package APODDownloader;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * DiskImageLibrary
 *  - getImageIdentifiers
 *  - getImage
 *  - getImages
 *  - putImage
 * 
 * APODImageLibrary
 *  - getImageIdentifiers
 *  - getImage
 *  - getImages (if you want)
 * 
 * ImageSync - This is all the GUI stuff & and sync code
 *  + DiskImageLibrary
 *  + APODImageLibrary
 *  - syncLibraries
 *  - Whatever GUI stuff you need
 */

public class Frame1 {

	private JFrame frame;
	private JTextField txtCuserswarrenpicturespicdown;
	private JLabel lblUrl;
	private JTextField txtHttp;
	private JButton btnSync;
	
	private File selectedFile;
	private JFileChooser fileChooser;	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//this.fileChooser.setFileSelectionMode(1);   //I can't understand why these wont work... I've set a class scoped variable...
		//this.fileChooser.setCurrentDirectory(new File("C:\\Users\\Warren\\Pictures\\picDown"));
		
		//setPicLocation();     // Even this doesn't work.... Why?
		
		System.out.println(System.getProperty("user.home"));
		
		selectedFile = new File(System.getProperty("user.home") + "\\Pictures\\picDown"); //Now made current-location referenced
		
		JButton btnNewButton = new JButton("Browse");
		btnNewButton.setFont(new Font("Oxygen", Font.PLAIN, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setPicLocation();
				}
			});
		btnNewButton.setBounds(324, 55, 87, 23);
		frame.getContentPane().add(btnNewButton);
		
		txtCuserswarrenpicturespicdown = new JTextField();
		txtCuserswarrenpicturespicdown.setText(selectedFile.getPath());
		txtCuserswarrenpicturespicdown.setBounds(10, 57, 291, 20);
		frame.getContentPane().add(txtCuserswarrenpicturespicdown);
		txtCuserswarrenpicturespicdown.setColumns(10);
		
		JLabel lblSaveLocation = new JLabel("Save Location:");
		lblSaveLocation.setBounds(10, 38, 117, 14);
		frame.getContentPane().add(lblSaveLocation);
		
		lblUrl = new JLabel("URL:");
		lblUrl.setBounds(10, 116, 46, 14);
		frame.getContentPane().add(lblUrl);
		
		txtHttp = new JTextField();
		txtHttp.setText("https://apod.nasa.gov/apod/astropix.html");
		txtHttp.setBounds(10, 136, 401, 20);
		frame.getContentPane().add(txtHttp);
		txtHttp.setColumns(10);
		
		btnSync = new JButton("Sync");
		btnSync.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DiskImageLibrary dil = new DiskImageLibrary(selectedFile);
				String[] diskImageNameArray = dil.getImageIdentifiers();
				APODImageLibrary ail = new APODImageLibrary();
				
				
				
				try {
					String[][] aPODImageNameArray = ail.getImageIDs();
					ImageSync is = new ImageSync(diskImageNameArray, aPODImageNameArray);
					dil.downloadMissing(is.findMissingURLs());
				} catch (IOException | InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		btnSync.setBounds(175, 199, 89, 23);
		frame.getContentPane().add(btnSync);
	}
	
	
	/************************************************
	 * I can't figure out what should be the parts, here. 
	 * Should I have a whole class just for building the list of pics on the hd?
	 * Should anything with the file names be a class? 
	 * Should all the downloading happen in one place?
	 * What even is the downloading object?
	 * 
	 *  I want a program that looks at a folder, makes a list of all the pictures in there
	 *   then goes to the website given to the program, finds the names of the highest rez
	 *   versions of the last n (10?) pictures, compares that to the list of on-HD pictures
	 *   to see if they're already downloaded, creates a list of those that aren't yet downloaded
	 *   then downloads them, and tells the user how many have been DLed.
	 *   
	 *   get folder location
	 *   build list of files in folder
	 *   build list of URL for last n pics
	 *   	make sure to accept only pics in list, not youtube links
	 *   make list of files to be DLed by comparing elements of the first two lists
	 *   download missing files
	 *   tell user what happened
	 *   
	 *   What are the "objects" here? Is the frame an object, 
	 *    like a kiosk which does everything needed for me, like an ATM?
	 *    Or is the frame just a thing upon which sit objects, like each button, 
	 *    and it's the buttons that are the objects, which have, as part of their behavior, 
	 *    going to fetch the folder location, and the other doing all the grunt work?
	 *    Or are the different things actually making things happen the objects?
	 *    Like a InternetCOnnection object which handles all the traffic to the internet?
	 *    And another, FileHandling whose job it is to interact with the files on disk
	 *    to create the lists, and store the data someplace in particular on the harddrive?
	 *    And another to handle the comparison of the two lists? 
	 *    
	 *    Oh, wait, no. Have the internet one make an array of picture names or hashes
	 *    Have the File one make an array of the same data on disk
	 *    The button calls those, as well as some 
	 *    (compare-lists-and-make-a-new-list-of-unique-items) method from somewhere, 
	 *    and then calls a method to DL the new list of non-matched names' URLs.
	 *    
	 *    Another way:
	 *    make list of local files
	 *    get most recent online image
	 *    compare
	 *    if image on HD, stop, 
	 *    else download image and check next image
	*/
	
	
	private void setPicLocation(){
		fileChooser = new JFileChooser();
		fileChooser.setFileSelectionMode(1);
		fileChooser.setCurrentDirectory(selectedFile);
		int result = fileChooser.showOpenDialog(frame);
		if (result == JFileChooser.APPROVE_OPTION) {
		    selectedFile = fileChooser.getSelectedFile();
		    txtCuserswarrenpicturespicdown.setText(selectedFile.toString());
		}
	}


}