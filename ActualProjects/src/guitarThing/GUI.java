package guitarThing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.Rectangle;
import java.awt.Font;

public class GUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
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
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 950, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("●●");
		label.setVerticalAlignment(SwingConstants.BOTTOM);
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(673, 305, 46, 18);
		frame.getContentPane().add(label);
		
		JLabel label_3 = new JLabel("●");
		label_3.setVerticalAlignment(SwingConstants.BOTTOM);
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(523, 305, 46, 18);
		frame.getContentPane().add(label_3);
		
		JLabel label_1 = new JLabel("●");
		label_1.setVerticalAlignment(SwingConstants.BOTTOM);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(322, 305, 46, 18);
		frame.getContentPane().add(label_1);
		
		JLabel lblNewLabel = new JLabel("●");
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(222, 305, 46, 18);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label_2 = new JLabel("●");
		label_2.setVerticalAlignment(SwingConstants.BOTTOM);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(423, 305, 46, 18);
		frame.getContentPane().add(label_2);
		
		JLabel label_4 = new JLabel("●");
		label_4.setVerticalAlignment(SwingConstants.BOTTOM);
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(822, 305, 46, 18);
		frame.getContentPane().add(label_4);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setOrientation(SwingConstants.VERTICAL);
		separator_6.setBounds(95, 50, 2, 265);
		frame.getContentPane().add(separator_6);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setOrientation(SwingConstants.VERTICAL);
		separator_7.setBounds(145, 57, 2, 252);
		frame.getContentPane().add(separator_7);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setOrientation(SwingConstants.VERTICAL);
		separator_8.setBounds(195, 57, 2, 252);
		frame.getContentPane().add(separator_8);
		
		JSeparator separator_9 = new JSeparator();
		separator_9.setOrientation(SwingConstants.VERTICAL);
		separator_9.setBounds(245, 57, 2, 252);
		frame.getContentPane().add(separator_9);
		
		JSeparator separator_10 = new JSeparator();
		separator_10.setOrientation(SwingConstants.VERTICAL);
		separator_10.setBounds(295, 57, 2, 252);
		frame.getContentPane().add(separator_10);
		
		JSeparator separator_11 = new JSeparator();
		separator_11.setOrientation(SwingConstants.VERTICAL);
		separator_11.setBounds(345, 57, 2, 252);
		frame.getContentPane().add(separator_11);
		
		JSeparator separator_12 = new JSeparator();
		separator_12.setOrientation(SwingConstants.VERTICAL);
		separator_12.setBounds(395, 57, 2, 252);
		frame.getContentPane().add(separator_12);
		
		JSeparator separator_13 = new JSeparator();
		separator_13.setOrientation(SwingConstants.VERTICAL);
		separator_13.setBounds(445, 57, 2, 252);
		frame.getContentPane().add(separator_13);
		
		JSeparator separator_14 = new JSeparator();
		separator_14.setOrientation(SwingConstants.VERTICAL);
		separator_14.setBounds(495, 57, 2, 252);
		frame.getContentPane().add(separator_14);
		
		JSeparator separator_15 = new JSeparator();
		separator_15.setOrientation(SwingConstants.VERTICAL);
		separator_15.setBounds(545, 57, 2, 252);
		frame.getContentPane().add(separator_15);
		
		JSeparator separator_16 = new JSeparator();
		separator_16.setOrientation(SwingConstants.VERTICAL);
		separator_16.setBounds(595, 57, 2, 252);
		frame.getContentPane().add(separator_16);
		
		JSeparator separator_17 = new JSeparator();
		separator_17.setOrientation(SwingConstants.VERTICAL);
		separator_17.setBounds(645, 57, 2, 252);
		frame.getContentPane().add(separator_17);
		
		JSeparator separator_18 = new JSeparator();
		separator_18.setOrientation(SwingConstants.VERTICAL);
		separator_18.setBounds(695, 57, 2, 252);
		frame.getContentPane().add(separator_18);
		
		JSeparator separator_19 = new JSeparator();
		separator_19.setOrientation(SwingConstants.VERTICAL);
		separator_19.setBounds(745, 57, 2, 252);
		frame.getContentPane().add(separator_19);
		
		JSeparator separator_20 = new JSeparator();
		separator_20.setOrientation(SwingConstants.VERTICAL);
		separator_20.setBounds(795, 57, 2, 252);
		frame.getContentPane().add(separator_20);
		
		JSeparator separator_21 = new JSeparator();
		separator_21.setOrientation(SwingConstants.VERTICAL);
		separator_21.setBounds(845, 57, 2, 252);
		frame.getContentPane().add(separator_21);
		
		JLabel lblE = new JLabel("e");
		lblE.setHorizontalAlignment(SwingConstants.RIGHT);
		lblE.setBounds(10, 72, 19, 14);
		frame.getContentPane().add(lblE);
		
		JLabel lblB = new JLabel("B");
		lblB.setHorizontalAlignment(SwingConstants.RIGHT);
		lblB.setBounds(10, 112, 19, 14);
		frame.getContentPane().add(lblB);
		
		JLabel lblG = new JLabel("G");
		lblG.setHorizontalAlignment(SwingConstants.RIGHT);
		lblG.setBounds(10, 152, 19, 14);
		frame.getContentPane().add(lblG);
		
		JLabel lblD = new JLabel("D");
		lblD.setHorizontalAlignment(SwingConstants.RIGHT);
		lblD.setBounds(10, 192, 19, 14);
		frame.getContentPane().add(lblD);
		
		JLabel lblA = new JLabel("A");
		lblA.setHorizontalAlignment(SwingConstants.RIGHT);
		lblA.setBounds(10, 232, 19, 14);
		frame.getContentPane().add(lblA);
		
		JLabel lblE_1 = new JLabel("E");
		lblE_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblE_1.setBounds(10, 272, 19, 14);
		frame.getContentPane().add(lblE_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(36, 60, 825, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(36, 100, 825, 2);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(36, 140, 825, 2);
		frame.getContentPane().add(separator_3);
		
		JSeparator separator_02 = new JSeparator();
		separator_02.setBounds(36, 180, 825, 2);
		frame.getContentPane().add(separator_02);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(36, 220, 825, 2);
		frame.getContentPane().add(separator_5);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(36, 260, 825, 2);
		frame.getContentPane().add(separator_4);
		
		JSeparator separator_22 = new JSeparator();
		separator_22.setBounds(36, 300, 825, 2);
		frame.getContentPane().add(separator_22);
		
		JPanel EString = new JPanel();
		EString.setBounds(47, 262, 796, 36);
		frame.getContentPane().add(EString);
		EString.setLayout(null);
		
		JLabel lblOpenE = new JLabel("EString");
		lblOpenE.setBounds(0, 0, 46, 36);
		EString.add(lblOpenE);
		lblOpenE.setHorizontalAlignment(SwingConstants.CENTER);
		lblOpenE.setOpaque(true);
		lblOpenE.setForeground(Color.BLACK);
		lblOpenE.setBackground(Color.RED);
		
		JLabel lblEfret1 = new JLabel("EString");
		lblEfret1.setBounds(50, 0, 46, 36);
		EString.add(lblEfret1);
		lblEfret1.setHorizontalAlignment(SwingConstants.CENTER);
		lblEfret1.setOpaque(true);
		lblEfret1.setForeground(Color.BLACK);
		lblEfret1.setBackground(Color.RED);
		
		JLabel lblEfret2 = new JLabel("EString");
		lblEfret2.setBounds(100, 0, 46, 36);
		EString.add(lblEfret2);
		lblEfret2.setHorizontalAlignment(SwingConstants.CENTER);
		lblEfret2.setOpaque(true);
		lblEfret2.setForeground(Color.BLACK);
		lblEfret2.setBackground(Color.RED);
		
		JLabel lblEfret3 = new JLabel("EString");
		lblEfret3.setBounds(150, 0, 46, 36);
		EString.add(lblEfret3);
		lblEfret3.setHorizontalAlignment(SwingConstants.CENTER);
		lblEfret3.setOpaque(true);
		lblEfret3.setForeground(Color.BLACK);
		lblEfret3.setBackground(Color.RED);
		
		JLabel lblEfret4 = new JLabel("EString");
		lblEfret4.setBounds(200, 0, 46, 36);
		EString.add(lblEfret4);
		lblEfret4.setHorizontalAlignment(SwingConstants.CENTER);
		lblEfret4.setOpaque(true);
		lblEfret4.setForeground(Color.BLACK);
		lblEfret4.setBackground(Color.RED);
		
		JLabel lblEfret5 = new JLabel("EString");
		lblEfret5.setBounds(250, 0, 46, 36);
		EString.add(lblEfret5);
		lblEfret5.setHorizontalAlignment(SwingConstants.CENTER);
		lblEfret5.setOpaque(true);
		lblEfret5.setForeground(Color.BLACK);
		lblEfret5.setBackground(Color.RED);
		
		JLabel lblEfret6 = new JLabel("EString");
		lblEfret6.setBounds(300, 0, 46, 36);
		EString.add(lblEfret6);
		lblEfret6.setHorizontalAlignment(SwingConstants.CENTER);
		lblEfret6.setOpaque(true);
		lblEfret6.setForeground(Color.BLACK);
		lblEfret6.setBackground(Color.RED);
		
		JLabel lblEfret7 = new JLabel("EString");
		lblEfret7.setBounds(350, 0, 46, 36);
		EString.add(lblEfret7);
		lblEfret7.setHorizontalAlignment(SwingConstants.CENTER);
		lblEfret7.setOpaque(true);
		lblEfret7.setForeground(Color.BLACK);
		lblEfret7.setBackground(Color.RED);
		
		JLabel lblEfret8 = new JLabel("EString");
		lblEfret8.setBounds(400, 0, 46, 36);
		EString.add(lblEfret8);
		lblEfret8.setHorizontalAlignment(SwingConstants.CENTER);
		lblEfret8.setOpaque(true);
		lblEfret8.setForeground(Color.BLACK);
		lblEfret8.setBackground(Color.RED);
		
		JLabel lblEfret9 = new JLabel("EString");
		lblEfret9.setBounds(450, 0, 46, 36);
		EString.add(lblEfret9);
		lblEfret9.setHorizontalAlignment(SwingConstants.CENTER);
		lblEfret9.setOpaque(true);
		lblEfret9.setForeground(Color.BLACK);
		lblEfret9.setBackground(Color.RED);
		
		JLabel lblEfret10 = new JLabel("EString");
		lblEfret10.setBounds(500, 0, 46, 36);
		EString.add(lblEfret10);
		lblEfret10.setHorizontalAlignment(SwingConstants.CENTER);
		lblEfret10.setOpaque(true);
		lblEfret10.setForeground(Color.BLACK);
		lblEfret10.setBackground(Color.RED);
		
		JLabel lblEfret11 = new JLabel("EString");
		lblEfret11.setBounds(550, 0, 46, 36);
		EString.add(lblEfret11);
		lblEfret11.setHorizontalAlignment(SwingConstants.CENTER);
		lblEfret11.setOpaque(true);
		lblEfret11.setForeground(Color.BLACK);
		lblEfret11.setBackground(Color.RED);
		
		JLabel lblEfret12 = new JLabel("EString");
		lblEfret12.setBounds(600, 0, 46, 36);
		EString.add(lblEfret12);
		lblEfret12.setHorizontalAlignment(SwingConstants.CENTER);
		lblEfret12.setOpaque(true);
		lblEfret12.setForeground(Color.BLACK);
		lblEfret12.setBackground(Color.RED);
		
		JLabel lblEfret13 = new JLabel("EString");
		lblEfret13.setBounds(650, 0, 46, 36);
		EString.add(lblEfret13);
		lblEfret13.setHorizontalAlignment(SwingConstants.CENTER);
		lblEfret13.setOpaque(true);
		lblEfret13.setForeground(Color.BLACK);
		lblEfret13.setBackground(Color.RED);
		
		JLabel lblEfret14 = new JLabel("EString");
		lblEfret14.setBounds(700, 0, 46, 36);
		EString.add(lblEfret14);
		lblEfret14.setHorizontalAlignment(SwingConstants.CENTER);
		lblEfret14.setOpaque(true);
		lblEfret14.setForeground(Color.BLACK);
		lblEfret14.setBackground(Color.RED);
		
		JLabel lblEfret15 = new JLabel("EString");
		lblEfret15.setBounds(750, 0, 46, 36);
		EString.add(lblEfret15);
		lblEfret15.setHorizontalAlignment(SwingConstants.CENTER);
		lblEfret15.setOpaque(true);
		lblEfret15.setForeground(Color.BLACK);
		lblEfret15.setBackground(Color.RED);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(93, 50, 2, 265);
		frame.getContentPane().add(separator_2);
	}
}
