package pictureDownloader;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Frame1 {

	private JFrame frame;
	private JTextField txtCuserswarrenpicturespicdown;
	private JLabel lblUrl;
	private JTextField txtHttp;
	private JButton btnSync;
	
	private File selectedFile;
	private JFileChooser fileChooser;
	
	private List<String> builtList = new ArrayList();;

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
		
		selectedFile = new File("C:\\Users\\Seth\\Pictures\\picDown");
		
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
				sync();
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
	
	private File[] makeFileList(){
		
		File[] fileArray = selectedFile.listFiles();
		
		return fileArray;
		
	}
	
	private void sync (){
		File[] files = makeFileList();
		String mostRecent = "";
		long min = 0;
		

		builtList = buildListOfImages("https://apod.nasa.gov/apod/archivepix.html");

		
		for (File i : files){			
			
			if ( min < i.lastModified() ){
				min = i.lastModified();
				mostRecent = i.getName();
				System.out.println("insideIf, min: " + min + " and name: " + i.getName() );
			}
			System.out.println("\nFile timestamp: " + i.lastModified() +
					 "\nFilename: " + i.getName());			
		}
		System.out.print("\nThe most recently modified file is " + mostRecent + " : ");
		System.out.println(mostRecent.hashCode());
		
		
		System.out.println(builtList.toString()); //********************Giving NullPointer, but why?
											  // because List<String> isn't meant to be used, but extended, it seems?
		
		downloadMissing(files);
					
	}
	
	private void downloadMissing(File[] files){
		
		ArrayList<Integer> fileHashes = new ArrayList<Integer>();		
		for (File file : files){
			fileHashes.add(file.getName().hashCode());
			System.out.println(file.getName() + " has a hash of " + fileHashes.get(fileHashes.size()-1));
		}
		
		
		ArrayList<Integer> linkImageHashes = new ArrayList<Integer>();
		for (String link : builtList){
			try {
				Connection connection = Jsoup.connect(link);
				connection.timeout(5000);
				Connection.Response resultImageResponse = connection.ignoreContentType(true).execute();
				/**/Document resultImageAsDoc = resultImageResponse.parse();
				System.out.println(resultImageAsDoc.getAllElements());
				linkImageHashes.add(resultImageResponse.header("title").hashCode());
				System.out.println(resultImageResponse.header("title")
						+ " has a hash of " + linkImageHashes.get(linkImageHashes.size()-1));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		// Build list of missing and download them
	}
	
	private List<String> buildListOfImages ( String URL ) {
		try {
			Document doc = Jsoup.connect(URL).get();
			Elements listOfPages;
			Attributes attributes;
			String image;
			
			if ( !(URL.equals("https://apod.nasa.gov/apod/archivepix.html"))){
				System.out.println("In True");
				try{
					image = doc.select("a").eachAttr("abs:href").get(1);
					System.out.println("Within True; link: " + image);
					if (Pattern.matches(".*[jpg|png|bmp]", image)){
						builtList.add(image);
					}						
					System.out.println("BuiltList item:    " 
					+ builtList.get((builtList.size()-1)));
					
				} catch (NullPointerException e) {
					
				}			

			} else {
				System.out.println("In False");
				
				listOfPages = doc.selectFirst("b").children();
				List<String> listAsList = listOfPages.select("a").eachAttr("abs:href");
				for ( int i = 0; i < 5; i++ ){
					System.out.println("Element number " + i + ": " 
							+ listAsList.get(i).toString()); //Just checking, before we begin
					//Now you need to parse out each element and re-call this bLOI method
					System.out.println();
					buildListOfImages (listAsList.get(i).toString());
				}
			}
			
			
			
			System.out.println("End of array builder method.");
			
			
			// image.absUrl(attributeKey);
			
			
			//Trying to split around <br> 
			//                       <a href="image/
			// giving the date right before, and the link to the full size image right after
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return builtList;
		
	}
	

}