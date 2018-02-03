package guitarThing;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class GUI {

	private JFrame frame;
	List<JPanel> strings = new ArrayList<>();

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
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setOrientation(SwingConstants.VERTICAL);
		separator_6.setBounds(94, 44, 2, 273);
		frame.getContentPane().add(separator_6);
		
		JLabel label = new JLabel("••");
		label.setVerticalAlignment(SwingConstants.BOTTOM);
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(673, 305, 46, 18);
		frame.getContentPane().add(label);
		
		JLabel label_3 = new JLabel("•");
		label_3.setVerticalAlignment(SwingConstants.BOTTOM);
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(523, 305, 46, 18);
		frame.getContentPane().add(label_3);
		
		JLabel label_1 = new JLabel("•");
		label_1.setVerticalAlignment(SwingConstants.BOTTOM);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(322, 305, 46, 18);
		frame.getContentPane().add(label_1);
		
		JLabel lblNewLabel = new JLabel("•");
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(222, 305, 46, 18);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label_2 = new JLabel("•");
		label_2.setVerticalAlignment(SwingConstants.BOTTOM);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(423, 305, 46, 18);
		frame.getContentPane().add(label_2);
		
		JLabel label_4 = new JLabel("•");
		label_4.setVerticalAlignment(SwingConstants.BOTTOM);
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(822, 305, 46, 18);
		frame.getContentPane().add(label_4);
		
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
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(96, 44, 2, 273);
		frame.getContentPane().add(separator_2);
		
		JPanel eString = new JPanel();
		eString.setLayout(null);
		eString.setBounds(47, 62, 796, 36);
		frame.getContentPane().add(eString);
		
		JLabel lblHighestring_0 = new JLabel("HighEString");
		lblHighestring_0.setOpaque(true);
		lblHighestring_0.setHorizontalAlignment(SwingConstants.CENTER);
		lblHighestring_0.setForeground(Color.BLACK);
		lblHighestring_0.setBackground(Color.YELLOW);
		lblHighestring_0.setBounds(0, 0, 46, 36);
		eString.add(lblHighestring_0);
		
		JLabel lblHighestring_1 = new JLabel("HighEString");
		lblHighestring_1.setOpaque(true);
		lblHighestring_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblHighestring_1.setForeground(Color.BLACK);
		lblHighestring_1.setBackground(Color.YELLOW);
		lblHighestring_1.setBounds(50, 0, 46, 36);
		eString.add(lblHighestring_1);
		
		JLabel lblHighestring_2 = new JLabel("HighEString");
		lblHighestring_2.setOpaque(true);
		lblHighestring_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblHighestring_2.setForeground(Color.BLACK);
		lblHighestring_2.setBackground(Color.YELLOW);
		lblHighestring_2.setBounds(100, 0, 46, 36);
		eString.add(lblHighestring_2);
		
		JLabel lblHighestring_3 = new JLabel("HighEString");
		lblHighestring_3.setOpaque(true);
		lblHighestring_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblHighestring_3.setForeground(Color.BLACK);
		lblHighestring_3.setBackground(Color.YELLOW);
		lblHighestring_3.setBounds(150, 0, 46, 36);
		eString.add(lblHighestring_3);
		
		JLabel lblHighestring_4 = new JLabel("HighEString");
		lblHighestring_4.setOpaque(true);
		lblHighestring_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblHighestring_4.setForeground(Color.BLACK);
		lblHighestring_4.setBackground(Color.YELLOW);
		lblHighestring_4.setBounds(200, 0, 46, 36);
		eString.add(lblHighestring_4);
		
		JLabel lblHighestring_5 = new JLabel("HighEString");
		lblHighestring_5.setOpaque(true);
		lblHighestring_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblHighestring_5.setForeground(Color.BLACK);
		lblHighestring_5.setBackground(Color.YELLOW);
		lblHighestring_5.setBounds(250, 0, 46, 36);
		eString.add(lblHighestring_5);
		
		JLabel lblHighestring_6 = new JLabel("HighEString");
		lblHighestring_6.setOpaque(true);
		lblHighestring_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblHighestring_6.setForeground(Color.BLACK);
		lblHighestring_6.setBackground(Color.YELLOW);
		lblHighestring_6.setBounds(300, 0, 46, 36);
		eString.add(lblHighestring_6);
		
		JLabel lblHighestring_7 = new JLabel("HighEString");
		lblHighestring_7.setOpaque(true);
		lblHighestring_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblHighestring_7.setForeground(Color.BLACK);
		lblHighestring_7.setBackground(Color.YELLOW);
		lblHighestring_7.setBounds(350, 0, 46, 36);
		eString.add(lblHighestring_7);
		
		JLabel lblHighestring_8 = new JLabel("HighEString");
		lblHighestring_8.setOpaque(true);
		lblHighestring_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblHighestring_8.setForeground(Color.BLACK);
		lblHighestring_8.setBackground(Color.YELLOW);
		lblHighestring_8.setBounds(400, 0, 46, 36);
		eString.add(lblHighestring_8);
		
		JLabel lblHighestring_9 = new JLabel("HighEString");
		lblHighestring_9.setOpaque(true);
		lblHighestring_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblHighestring_9.setForeground(Color.BLACK);
		lblHighestring_9.setBackground(Color.YELLOW);
		lblHighestring_9.setBounds(450, 0, 46, 36);
		eString.add(lblHighestring_9);
		
		JLabel lblHighestring_10 = new JLabel("HighEString");
		lblHighestring_10.setOpaque(true);
		lblHighestring_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblHighestring_10.setForeground(Color.BLACK);
		lblHighestring_10.setBackground(Color.YELLOW);
		lblHighestring_10.setBounds(500, 0, 46, 36);
		eString.add(lblHighestring_10);
		
		JLabel lblHighestring_11 = new JLabel("HighEString");
		lblHighestring_11.setOpaque(true);
		lblHighestring_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblHighestring_11.setForeground(Color.BLACK);
		lblHighestring_11.setBackground(Color.YELLOW);
		lblHighestring_11.setBounds(550, 0, 46, 36);
		eString.add(lblHighestring_11);
		
		JLabel lblHighestring_12 = new JLabel("HighEString");
		lblHighestring_12.setOpaque(true);
		lblHighestring_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblHighestring_12.setForeground(Color.BLACK);
		lblHighestring_12.setBackground(Color.YELLOW);
		lblHighestring_12.setBounds(600, 0, 46, 36);
		eString.add(lblHighestring_12);
		
		JLabel lblHighestring_13 = new JLabel("HighEString");
		lblHighestring_13.setOpaque(true);
		lblHighestring_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblHighestring_13.setForeground(Color.BLACK);
		lblHighestring_13.setBackground(Color.YELLOW);
		lblHighestring_13.setBounds(650, 0, 46, 36);
		eString.add(lblHighestring_13);
		
		JLabel lblHighestring_14 = new JLabel("HighEString");
		lblHighestring_14.setOpaque(true);
		lblHighestring_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblHighestring_14.setForeground(Color.BLACK);
		lblHighestring_14.setBackground(Color.YELLOW);
		lblHighestring_14.setBounds(700, 0, 46, 36);
		eString.add(lblHighestring_14);
		
		JLabel lblHighestring_15 = new JLabel("HighEString");
		lblHighestring_15.setOpaque(true);
		lblHighestring_15.setHorizontalAlignment(SwingConstants.CENTER);
		lblHighestring_15.setForeground(Color.BLACK);
		lblHighestring_15.setBackground(Color.YELLOW);
		lblHighestring_15.setBounds(750, 0, 46, 36);
		eString.add(lblHighestring_15);
		
		JPanel BString = new JPanel();
		BString.setLayout(null);
		BString.setBounds(47, 102, 796, 36);
		frame.getContentPane().add(BString);
		
		JLabel lblBstring_0 = new JLabel("BString");
		lblBstring_0.setOpaque(true);
		lblBstring_0.setHorizontalAlignment(SwingConstants.CENTER);
		lblBstring_0.setForeground(Color.BLACK);
		lblBstring_0.setBackground(Color.GREEN);
		lblBstring_0.setBounds(0, 0, 46, 36);
		BString.add(lblBstring_0);
		
		JLabel lblBstring_1 = new JLabel("BString");
		lblBstring_1.setOpaque(true);
		lblBstring_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblBstring_1.setForeground(Color.BLACK);
		lblBstring_1.setBackground(Color.GREEN);
		lblBstring_1.setBounds(50, 0, 46, 36);
		BString.add(lblBstring_1);
		
		JLabel lblBstring_2 = new JLabel("BString");
		lblBstring_2.setOpaque(true);
		lblBstring_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblBstring_2.setForeground(Color.BLACK);
		lblBstring_2.setBackground(Color.GREEN);
		lblBstring_2.setBounds(100, 0, 46, 36);
		BString.add(lblBstring_2);
		
		JLabel lblBstring_3 = new JLabel("BString");
		lblBstring_3.setOpaque(true);
		lblBstring_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblBstring_3.setForeground(Color.BLACK);
		lblBstring_3.setBackground(Color.GREEN);
		lblBstring_3.setBounds(150, 0, 46, 36);
		BString.add(lblBstring_3);
		
		JLabel lblBstring_4 = new JLabel("BString");
		lblBstring_4.setOpaque(true);
		lblBstring_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblBstring_4.setForeground(Color.BLACK);
		lblBstring_4.setBackground(Color.GREEN);
		lblBstring_4.setBounds(200, 0, 46, 36);
		BString.add(lblBstring_4);
		
		JLabel lblBstring_5 = new JLabel("BString");
		lblBstring_5.setOpaque(true);
		lblBstring_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblBstring_5.setForeground(Color.BLACK);
		lblBstring_5.setBackground(Color.GREEN);
		lblBstring_5.setBounds(250, 0, 46, 36);
		BString.add(lblBstring_5);
		
		JLabel lblBstring_6 = new JLabel("BString");
		lblBstring_6.setOpaque(true);
		lblBstring_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblBstring_6.setForeground(Color.BLACK);
		lblBstring_6.setBackground(Color.GREEN);
		lblBstring_6.setBounds(300, 0, 46, 36);
		BString.add(lblBstring_6);
		
		JLabel lblBstring_7 = new JLabel("BString");
		lblBstring_7.setOpaque(true);
		lblBstring_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblBstring_7.setForeground(Color.BLACK);
		lblBstring_7.setBackground(Color.GREEN);
		lblBstring_7.setBounds(350, 0, 46, 36);
		BString.add(lblBstring_7);
		
		JLabel lblBstring_8 = new JLabel("BString");
		lblBstring_8.setOpaque(true);
		lblBstring_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblBstring_8.setForeground(Color.BLACK);
		lblBstring_8.setBackground(Color.GREEN);
		lblBstring_8.setBounds(400, 0, 46, 36);
		BString.add(lblBstring_8);
		
		JLabel lblBstring_9 = new JLabel("BString");
		lblBstring_9.setOpaque(true);
		lblBstring_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblBstring_9.setForeground(Color.BLACK);
		lblBstring_9.setBackground(Color.GREEN);
		lblBstring_9.setBounds(450, 0, 46, 36);
		BString.add(lblBstring_9);
		
		JLabel lblBstring_10 = new JLabel("BString");
		lblBstring_10.setOpaque(true);
		lblBstring_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblBstring_10.setForeground(Color.BLACK);
		lblBstring_10.setBackground(Color.GREEN);
		lblBstring_10.setBounds(500, 0, 46, 36);
		BString.add(lblBstring_10);
		
		JLabel lblBstring_11 = new JLabel("BString");
		lblBstring_11.setOpaque(true);
		lblBstring_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblBstring_11.setForeground(Color.BLACK);
		lblBstring_11.setBackground(Color.GREEN);
		lblBstring_11.setBounds(550, 0, 46, 36);
		BString.add(lblBstring_11);
		
		JLabel lblBstring_12 = new JLabel("BString");
		lblBstring_12.setOpaque(true);
		lblBstring_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblBstring_12.setForeground(Color.BLACK);
		lblBstring_12.setBackground(Color.GREEN);
		lblBstring_12.setBounds(600, 0, 46, 36);
		BString.add(lblBstring_12);
		
		JLabel lblBstring_13 = new JLabel("BString");
		lblBstring_13.setOpaque(true);
		lblBstring_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblBstring_13.setForeground(Color.BLACK);
		lblBstring_13.setBackground(Color.GREEN);
		lblBstring_13.setBounds(650, 0, 46, 36);
		BString.add(lblBstring_13);
		
		JLabel lblBstring_14 = new JLabel("BString");
		lblBstring_14.setOpaque(true);
		lblBstring_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblBstring_14.setForeground(Color.BLACK);
		lblBstring_14.setBackground(Color.GREEN);
		lblBstring_14.setBounds(700, 0, 46, 36);
		BString.add(lblBstring_14);
		
		JLabel lblBstring_15 = new JLabel("BString");
		lblBstring_15.setOpaque(true);
		lblBstring_15.setHorizontalAlignment(SwingConstants.CENTER);
		lblBstring_15.setForeground(Color.BLACK);
		lblBstring_15.setBackground(Color.GREEN);
		lblBstring_15.setBounds(750, 0, 46, 36);
		BString.add(lblBstring_15);
		
		JPanel GString = new JPanel();
		GString.setLayout(null);
		GString.setBounds(47, 142, 796, 36);
		frame.getContentPane().add(GString);
		
		JLabel lblGstring_0 = new JLabel("GString");
		lblGstring_0.setOpaque(true);
		lblGstring_0.setHorizontalAlignment(SwingConstants.CENTER);
		lblGstring_0.setForeground(Color.BLACK);
		lblGstring_0.setBackground(Color.CYAN);
		lblGstring_0.setBounds(0, 0, 46, 36);
		GString.add(lblGstring_0);
		
		JLabel lblGstring_1 = new JLabel("GString");
		lblGstring_1.setOpaque(true);
		lblGstring_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblGstring_1.setForeground(Color.BLACK);
		lblGstring_1.setBackground(Color.CYAN);
		lblGstring_1.setBounds(50, 0, 46, 36);
		GString.add(lblGstring_1);
		
		JLabel lblGstring_2 = new JLabel("GString");
		lblGstring_2.setOpaque(true);
		lblGstring_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblGstring_2.setForeground(Color.BLACK);
		lblGstring_2.setBackground(Color.CYAN);
		lblGstring_2.setBounds(100, 0, 46, 36);
		GString.add(lblGstring_2);
		
		JLabel lblGstring_3 = new JLabel("GString");
		lblGstring_3.setOpaque(true);
		lblGstring_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblGstring_3.setForeground(Color.BLACK);
		lblGstring_3.setBackground(Color.CYAN);
		lblGstring_3.setBounds(150, 0, 46, 36);
		GString.add(lblGstring_3);
		
		JLabel lblGstring_4 = new JLabel("GString");
		lblGstring_4.setOpaque(true);
		lblGstring_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblGstring_4.setForeground(Color.BLACK);
		lblGstring_4.setBackground(Color.CYAN);
		lblGstring_4.setBounds(200, 0, 46, 36);
		GString.add(lblGstring_4);
		
		JLabel lblGstring_5 = new JLabel("GString");
		lblGstring_5.setOpaque(true);
		lblGstring_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblGstring_5.setForeground(Color.BLACK);
		lblGstring_5.setBackground(Color.CYAN);
		lblGstring_5.setBounds(250, 0, 46, 36);
		GString.add(lblGstring_5);
		
		JLabel lblGstring_6 = new JLabel("GString");
		lblGstring_6.setOpaque(true);
		lblGstring_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblGstring_6.setForeground(Color.BLACK);
		lblGstring_6.setBackground(Color.CYAN);
		lblGstring_6.setBounds(300, 0, 46, 36);
		GString.add(lblGstring_6);
		
		JLabel lblGstring_7 = new JLabel("GString");
		lblGstring_7.setOpaque(true);
		lblGstring_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblGstring_7.setForeground(Color.BLACK);
		lblGstring_7.setBackground(Color.CYAN);
		lblGstring_7.setBounds(350, 0, 46, 36);
		GString.add(lblGstring_7);
		
		JLabel lblGstring_8 = new JLabel("GString");
		lblGstring_8.setOpaque(true);
		lblGstring_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblGstring_8.setForeground(Color.BLACK);
		lblGstring_8.setBackground(Color.CYAN);
		lblGstring_8.setBounds(400, 0, 46, 36);
		GString.add(lblGstring_8);
		
		JLabel lblGstring_9 = new JLabel("GString");
		lblGstring_9.setOpaque(true);
		lblGstring_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblGstring_9.setForeground(Color.BLACK);
		lblGstring_9.setBackground(Color.CYAN);
		lblGstring_9.setBounds(450, 0, 46, 36);
		GString.add(lblGstring_9);
		
		JLabel lblGstring_10 = new JLabel("GString");
		lblGstring_10.setOpaque(true);
		lblGstring_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblGstring_10.setForeground(Color.BLACK);
		lblGstring_10.setBackground(Color.CYAN);
		lblGstring_10.setBounds(500, 0, 46, 36);
		GString.add(lblGstring_10);
		
		JLabel lblGstring_11 = new JLabel("GString");
		lblGstring_11.setOpaque(true);
		lblGstring_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblGstring_11.setForeground(Color.BLACK);
		lblGstring_11.setBackground(Color.CYAN);
		lblGstring_11.setBounds(550, 0, 46, 36);
		GString.add(lblGstring_11);
		
		JLabel lblGstring_12 = new JLabel("GString");
		lblGstring_12.setOpaque(true);
		lblGstring_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblGstring_12.setForeground(Color.BLACK);
		lblGstring_12.setBackground(Color.CYAN);
		lblGstring_12.setBounds(600, 0, 46, 36);
		GString.add(lblGstring_12);
		
		JLabel lblGstring_13 = new JLabel("GString");
		lblGstring_13.setOpaque(true);
		lblGstring_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblGstring_13.setForeground(Color.BLACK);
		lblGstring_13.setBackground(Color.CYAN);
		lblGstring_13.setBounds(650, 0, 46, 36);
		GString.add(lblGstring_13);
		
		JLabel lblGstring_14 = new JLabel("GString");
		lblGstring_14.setOpaque(true);
		lblGstring_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblGstring_14.setForeground(Color.BLACK);
		lblGstring_14.setBackground(Color.CYAN);
		lblGstring_14.setBounds(700, 0, 46, 36);
		GString.add(lblGstring_14);
		
		JLabel lblGstring_15 = new JLabel("GString");
		lblGstring_15.setOpaque(true);
		lblGstring_15.setHorizontalAlignment(SwingConstants.CENTER);
		lblGstring_15.setForeground(Color.BLACK);
		lblGstring_15.setBackground(Color.CYAN);
		lblGstring_15.setBounds(750, 0, 46, 36);
		GString.add(lblGstring_15);
		
		JPanel DString = new JPanel();
		DString.setLayout(null);
		DString.setBounds(47, 182, 796, 36);
		frame.getContentPane().add(DString);
		
		JLabel lblDstring_0 = new JLabel("DString");
		lblDstring_0.setOpaque(true);
		lblDstring_0.setHorizontalAlignment(SwingConstants.CENTER);
		lblDstring_0.setForeground(Color.BLACK);
		lblDstring_0.setBackground(Color.BLUE);
		lblDstring_0.setBounds(0, 0, 46, 36);
		DString.add(lblDstring_0);
		
		JLabel lblDstring_1 = new JLabel("DString");
		lblDstring_1.setOpaque(true);
		lblDstring_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDstring_1.setForeground(Color.BLACK);
		lblDstring_1.setBackground(Color.BLUE);
		lblDstring_1.setBounds(50, 0, 46, 36);
		DString.add(lblDstring_1);
		
		JLabel lblDstring_2 = new JLabel("DString");
		lblDstring_2.setOpaque(true);
		lblDstring_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblDstring_2.setForeground(Color.BLACK);
		lblDstring_2.setBackground(Color.BLUE);
		lblDstring_2.setBounds(100, 0, 46, 36);
		DString.add(lblDstring_2);
		
		JLabel lblDstring_3 = new JLabel("DString");
		lblDstring_3.setOpaque(true);
		lblDstring_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblDstring_3.setForeground(Color.BLACK);
		lblDstring_3.setBackground(Color.BLUE);
		lblDstring_3.setBounds(150, 0, 46, 36);
		DString.add(lblDstring_3);
		
		JLabel lblDstring_4 = new JLabel("DString");
		lblDstring_4.setOpaque(true);
		lblDstring_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblDstring_4.setForeground(Color.BLACK);
		lblDstring_4.setBackground(Color.BLUE);
		lblDstring_4.setBounds(200, 0, 46, 36);
		DString.add(lblDstring_4);
		
		JLabel lblDstring_5 = new JLabel("DString");
		lblDstring_5.setOpaque(true);
		lblDstring_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblDstring_5.setForeground(Color.BLACK);
		lblDstring_5.setBackground(Color.BLUE);
		lblDstring_5.setBounds(250, 0, 46, 36);
		DString.add(lblDstring_5);
		
		JLabel lblDstring_6 = new JLabel("DString");
		lblDstring_6.setOpaque(true);
		lblDstring_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblDstring_6.setForeground(Color.BLACK);
		lblDstring_6.setBackground(Color.BLUE);
		lblDstring_6.setBounds(300, 0, 46, 36);
		DString.add(lblDstring_6);
		
		JLabel lblDstring_7 = new JLabel("DString");
		lblDstring_7.setOpaque(true);
		lblDstring_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblDstring_7.setForeground(Color.BLACK);
		lblDstring_7.setBackground(Color.BLUE);
		lblDstring_7.setBounds(350, 0, 46, 36);
		DString.add(lblDstring_7);
		
		JLabel lblDstring_8 = new JLabel("DString");
		lblDstring_8.setOpaque(true);
		lblDstring_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblDstring_8.setForeground(Color.BLACK);
		lblDstring_8.setBackground(Color.BLUE);
		lblDstring_8.setBounds(400, 0, 46, 36);
		DString.add(lblDstring_8);
		
		JLabel lblDstring_9 = new JLabel("DString");
		lblDstring_9.setOpaque(true);
		lblDstring_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblDstring_9.setForeground(Color.BLACK);
		lblDstring_9.setBackground(Color.BLUE);
		lblDstring_9.setBounds(450, 0, 46, 36);
		DString.add(lblDstring_9);
		
		JLabel lblDstring_10 = new JLabel("DString");
		lblDstring_10.setOpaque(true);
		lblDstring_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblDstring_10.setForeground(Color.BLACK);
		lblDstring_10.setBackground(Color.BLUE);
		lblDstring_10.setBounds(500, 0, 46, 36);
		DString.add(lblDstring_10);
		
		JLabel lblDstring_11 = new JLabel("DString");
		lblDstring_11.setOpaque(true);
		lblDstring_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblDstring_11.setForeground(Color.BLACK);
		lblDstring_11.setBackground(Color.BLUE);
		lblDstring_11.setBounds(550, 0, 46, 36);
		DString.add(lblDstring_11);
		
		JLabel lblDstring_12 = new JLabel("DString");
		lblDstring_12.setOpaque(true);
		lblDstring_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblDstring_12.setForeground(Color.BLACK);
		lblDstring_12.setBackground(Color.BLUE);
		lblDstring_12.setBounds(600, 0, 46, 36);
		DString.add(lblDstring_12);
		
		JLabel lblDstring_13 = new JLabel("DString");
		lblDstring_13.setOpaque(true);
		lblDstring_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblDstring_13.setForeground(Color.BLACK);
		lblDstring_13.setBackground(Color.BLUE);
		lblDstring_13.setBounds(650, 0, 46, 36);
		DString.add(lblDstring_13);
		
		JLabel lblDstring_14 = new JLabel("DString");
		lblDstring_14.setOpaque(true);
		lblDstring_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblDstring_14.setForeground(Color.BLACK);
		lblDstring_14.setBackground(Color.BLUE);
		lblDstring_14.setBounds(700, 0, 46, 36);
		DString.add(lblDstring_14);
		
		JLabel lblDstring_15 = new JLabel("DString");
		lblDstring_15.setOpaque(true);
		lblDstring_15.setHorizontalAlignment(SwingConstants.CENTER);
		lblDstring_15.setForeground(Color.BLACK);
		lblDstring_15.setBackground(Color.BLUE);
		lblDstring_15.setBounds(750, 0, 46, 36);
		DString.add(lblDstring_15);
		
		JPanel AString = new JPanel();
		AString.setLayout(null);
		AString.setBounds(47, 222, 796, 36);
		frame.getContentPane().add(AString);
		
		JLabel lblAstring_0 = new JLabel("AString");
		lblAstring_0.setOpaque(true);
		lblAstring_0.setHorizontalAlignment(SwingConstants.CENTER);
		lblAstring_0.setForeground(Color.BLACK);
		lblAstring_0.setBackground(Color.MAGENTA);
		lblAstring_0.setBounds(0, 0, 46, 36);
		AString.add(lblAstring_0);
		
		JLabel lblAstring_1 = new JLabel("AString");
		lblAstring_1.setOpaque(true);
		lblAstring_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblAstring_1.setForeground(Color.BLACK);
		lblAstring_1.setBackground(Color.MAGENTA);
		lblAstring_1.setBounds(50, 0, 46, 36);
		AString.add(lblAstring_1);
		
		JLabel lblAstring_2 = new JLabel("AString");
		lblAstring_2.setOpaque(true);
		lblAstring_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblAstring_2.setForeground(Color.BLACK);
		lblAstring_2.setBackground(Color.MAGENTA);
		lblAstring_2.setBounds(100, 0, 46, 36);
		AString.add(lblAstring_2);
		
		JLabel lblAstring_3 = new JLabel("AString");
		lblAstring_3.setOpaque(true);
		lblAstring_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblAstring_3.setForeground(Color.BLACK);
		lblAstring_3.setBackground(Color.MAGENTA);
		lblAstring_3.setBounds(150, 0, 46, 36);
		AString.add(lblAstring_3);
		
		JLabel lblAstring_4 = new JLabel("AString");
		lblAstring_4.setOpaque(true);
		lblAstring_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblAstring_4.setForeground(Color.BLACK);
		lblAstring_4.setBackground(Color.MAGENTA);
		lblAstring_4.setBounds(200, 0, 46, 36);
		AString.add(lblAstring_4);
		
		JLabel lblAstring_5 = new JLabel("AString");
		lblAstring_5.setOpaque(true);
		lblAstring_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblAstring_5.setForeground(Color.BLACK);
		lblAstring_5.setBackground(Color.MAGENTA);
		lblAstring_5.setBounds(250, 0, 46, 36);
		AString.add(lblAstring_5);
		
		JLabel lblAstring_6 = new JLabel("AString");
		lblAstring_6.setOpaque(true);
		lblAstring_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblAstring_6.setForeground(Color.BLACK);
		lblAstring_6.setBackground(Color.MAGENTA);
		lblAstring_6.setBounds(300, 0, 46, 36);
		AString.add(lblAstring_6);
		
		JLabel lblAstring_7 = new JLabel("AString");
		lblAstring_7.setOpaque(true);
		lblAstring_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblAstring_7.setForeground(Color.BLACK);
		lblAstring_7.setBackground(Color.MAGENTA);
		lblAstring_7.setBounds(350, 0, 46, 36);
		AString.add(lblAstring_7);
		
		JLabel lblAstring_8 = new JLabel("AString");
		lblAstring_8.setOpaque(true);
		lblAstring_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblAstring_8.setForeground(Color.BLACK);
		lblAstring_8.setBackground(Color.MAGENTA);
		lblAstring_8.setBounds(400, 0, 46, 36);
		AString.add(lblAstring_8);
		
		JLabel lblAstring_9 = new JLabel("AString");
		lblAstring_9.setOpaque(true);
		lblAstring_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblAstring_9.setForeground(Color.BLACK);
		lblAstring_9.setBackground(Color.MAGENTA);
		lblAstring_9.setBounds(450, 0, 46, 36);
		AString.add(lblAstring_9);
		
		JLabel lblAstring_10 = new JLabel("AString");
		lblAstring_10.setOpaque(true);
		lblAstring_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblAstring_10.setForeground(Color.BLACK);
		lblAstring_10.setBackground(Color.MAGENTA);
		lblAstring_10.setBounds(500, 0, 46, 36);
		AString.add(lblAstring_10);
		
		JLabel lblAstring_11 = new JLabel("AString");
		lblAstring_11.setOpaque(true);
		lblAstring_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblAstring_11.setForeground(Color.BLACK);
		lblAstring_11.setBackground(Color.MAGENTA);
		lblAstring_11.setBounds(550, 0, 46, 36);
		AString.add(lblAstring_11);
		
		JLabel lblAstring_12 = new JLabel("AString");
		lblAstring_12.setOpaque(true);
		lblAstring_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblAstring_12.setForeground(Color.BLACK);
		lblAstring_12.setBackground(Color.MAGENTA);
		lblAstring_12.setBounds(600, 0, 46, 36);
		AString.add(lblAstring_12);
		
		JLabel lblAstring_13 = new JLabel("AString");
		lblAstring_13.setOpaque(true);
		lblAstring_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblAstring_13.setForeground(Color.BLACK);
		lblAstring_13.setBackground(Color.MAGENTA);
		lblAstring_13.setBounds(650, 0, 46, 36);
		AString.add(lblAstring_13);
		
		JLabel lblAstring_14 = new JLabel("AString");
		lblAstring_14.setOpaque(true);
		lblAstring_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblAstring_14.setForeground(Color.BLACK);
		lblAstring_14.setBackground(Color.MAGENTA);
		lblAstring_14.setBounds(700, 0, 46, 36);
		AString.add(lblAstring_14);
		
		JLabel lblAstring_15 = new JLabel("AString");
		lblAstring_15.setOpaque(true);
		lblAstring_15.setHorizontalAlignment(SwingConstants.CENTER);
		lblAstring_15.setForeground(Color.BLACK);
		lblAstring_15.setBackground(Color.MAGENTA);
		lblAstring_15.setBounds(750, 0, 46, 36);
		AString.add(lblAstring_15);
		
		JPanel EString = new JPanel();
		EString.setLayout(null);
		EString.setBounds(47, 262, 796, 36);
		frame.getContentPane().add(EString);
		
		JLabel lblEstring_0 = new JLabel("EString");
		lblEstring_0.setOpaque(true);
		lblEstring_0.setHorizontalAlignment(SwingConstants.CENTER);
		lblEstring_0.setForeground(Color.BLACK);
		lblEstring_0.setBackground(Color.RED);
		lblEstring_0.setBounds(0, 0, 46, 36);
		EString.add(lblEstring_0);
		
		JLabel lblEstring_1 = new JLabel("EString");
		lblEstring_1.setOpaque(true);
		lblEstring_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblEstring_1.setForeground(Color.BLACK);
		lblEstring_1.setBackground(Color.RED);
		lblEstring_1.setBounds(50, 0, 46, 36);
		EString.add(lblEstring_1);
		
		JLabel lblEstring_2 = new JLabel("EString");
		lblEstring_2.setOpaque(true);
		lblEstring_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblEstring_2.setForeground(Color.BLACK);
		lblEstring_2.setBackground(Color.RED);
		lblEstring_2.setBounds(100, 0, 46, 36);
		EString.add(lblEstring_2);
		
		JLabel lblEstring_3 = new JLabel("EString");
		lblEstring_3.setOpaque(true);
		lblEstring_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblEstring_3.setForeground(Color.BLACK);
		lblEstring_3.setBackground(Color.RED);
		lblEstring_3.setBounds(150, 0, 46, 36);
		EString.add(lblEstring_3);
		
		JLabel lblEstring_4 = new JLabel("EString");
		lblEstring_4.setOpaque(true);
		lblEstring_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblEstring_4.setForeground(Color.BLACK);
		lblEstring_4.setBackground(Color.RED);
		lblEstring_4.setBounds(200, 0, 46, 36);
		EString.add(lblEstring_4);
		
		JLabel lblEstring_5 = new JLabel("EString");
		lblEstring_5.setOpaque(true);
		lblEstring_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblEstring_5.setForeground(Color.BLACK);
		lblEstring_5.setBackground(Color.RED);
		lblEstring_5.setBounds(250, 0, 46, 36);
		EString.add(lblEstring_5);
		
		JLabel lblEstring_6 = new JLabel("EString");
		lblEstring_6.setOpaque(true);
		lblEstring_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblEstring_6.setForeground(Color.BLACK);
		lblEstring_6.setBackground(Color.RED);
		lblEstring_6.setBounds(300, 0, 46, 36);
		EString.add(lblEstring_6);
		
		JLabel lblEstring_7 = new JLabel("EString");
		lblEstring_7.setOpaque(true);
		lblEstring_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblEstring_7.setForeground(Color.BLACK);
		lblEstring_7.setBackground(Color.RED);
		lblEstring_7.setBounds(350, 0, 46, 36);
		EString.add(lblEstring_7);
		
		JLabel lblEstring_8 = new JLabel("EString");
		lblEstring_8.setOpaque(true);
		lblEstring_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblEstring_8.setForeground(Color.BLACK);
		lblEstring_8.setBackground(Color.RED);
		lblEstring_8.setBounds(400, 0, 46, 36);
		EString.add(lblEstring_8);
		
		JLabel lblEstring_9 = new JLabel("EString");
		lblEstring_9.setOpaque(true);
		lblEstring_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblEstring_9.setForeground(Color.BLACK);
		lblEstring_9.setBackground(Color.RED);
		lblEstring_9.setBounds(450, 0, 46, 36);
		EString.add(lblEstring_9);
		
		JLabel lblEstring_10 = new JLabel("EString");
		lblEstring_10.setOpaque(true);
		lblEstring_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblEstring_10.setForeground(Color.BLACK);
		lblEstring_10.setBackground(Color.RED);
		lblEstring_10.setBounds(500, 0, 46, 36);
		EString.add(lblEstring_10);
		
		JLabel lblEstring_11 = new JLabel("EString");
		lblEstring_11.setOpaque(true);
		lblEstring_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblEstring_11.setForeground(Color.BLACK);
		lblEstring_11.setBackground(Color.RED);
		lblEstring_11.setBounds(550, 0, 46, 36);
		EString.add(lblEstring_11);
		
		JLabel lblEstring_12 = new JLabel("EString");
		lblEstring_12.setOpaque(true);
		lblEstring_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblEstring_12.setForeground(Color.BLACK);
		lblEstring_12.setBackground(Color.RED);
		lblEstring_12.setBounds(600, 0, 46, 36);
		EString.add(lblEstring_12);
		
		JLabel lblEstring_13 = new JLabel("EString");
		lblEstring_13.setOpaque(true);
		lblEstring_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblEstring_13.setForeground(Color.BLACK);
		lblEstring_13.setBackground(Color.RED);
		lblEstring_13.setBounds(650, 0, 46, 36);
		EString.add(lblEstring_13);
		
		JLabel lblEstring_14 = new JLabel("EString");
		lblEstring_14.setOpaque(true);
		lblEstring_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblEstring_14.setForeground(Color.BLACK);
		lblEstring_14.setBackground(Color.RED);
		lblEstring_14.setBounds(700, 0, 46, 36);
		EString.add(lblEstring_14);
		
		JLabel lblEstring_15 = new JLabel("EString");
		lblEstring_15.setOpaque(true);
		lblEstring_15.setHorizontalAlignment(SwingConstants.CENTER);
		lblEstring_15.setForeground(Color.BLACK);
		lblEstring_15.setBackground(Color.RED);
		lblEstring_15.setBounds(750, 0, 46, 36);
		EString.add(lblEstring_15);
		
		// Does it matter that I have these here? Could I put each assignment in it's respective JPanel creation block?
		// Are these object references, and so as the object changes, the content of the list of the objects also changes?
		// or are these the actual things, so when I put them into the list, they go into it as what they are at the time and don't get updated?
		strings.add(EString); 
		strings.add(AString);
		strings.add(DString);
		strings.add(GString);
		strings.add(BString);
		strings.add(eString);
	}
	
	public void updateLabels(List<List<GuitarNote>> relevantCells) {
		/*
		 * Maybe pass this a List called "relevantStringFretCombos" or "relevantCombos" or "relevantCells"
		 * and then paint all those not in that list invisible??
		 * Fuck, I have no idea how to interact with this layer, like what's best practice?
		 * Maybe have a set of check boxes for what gets displayed in each label?
		 */
		
		for (int s = 0; s < relevantCells.size(); s++) {
			List<GuitarNote> workingString = relevantCells.get(s);
			for (int f = 0; f < workingString.size(); f++) {
				if () // Fuuuuuuu-
			}
		}
		
	}
}
















