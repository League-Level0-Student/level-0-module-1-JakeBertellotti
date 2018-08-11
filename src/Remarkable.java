import javax.swing.JOptionPane;

public class Remarkable {
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("What is your name");
		if (s.equals("Jake")) {
			JOptionPane.showMessageDialog(null, "Jake loves playing fortnite.");

		}
		if (s.equals("Ryan")) {
			JOptionPane.showMessageDialog(null, "Ryan loves to read");

		}

	}
}
