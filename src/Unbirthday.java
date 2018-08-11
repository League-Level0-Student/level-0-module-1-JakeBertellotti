import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("When is your birthday? ");
		if (s.equals("8/1")) {
			JOptionPane.showMessageDialog(null, "Happy Birthday !");
		}

		else {
			JOptionPane.showMessageDialog(null, "Happy Unbirthday !");

		}
	}
}
