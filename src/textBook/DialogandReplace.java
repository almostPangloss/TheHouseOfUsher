package textBook;

import javax.swing.JOptionPane;

public class DialogandReplace {
	
		public static void main(String[] args) {
			// String s = JOptionPane.showInputDialog(null, "Telephone number?");
			
			// s = s.replace("-", " ");
			
			JOptionPane.showMessageDialog(null, 
					JOptionPane.showInputDialog(null, "Telephone number?").replace("-", " "));
			
		}

	}