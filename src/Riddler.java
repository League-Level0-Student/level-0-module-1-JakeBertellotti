import javax.swing.JOptionPane;

public class Riddler {
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("What is greater than God,\n" + "more evil than the devil,\n"
				+ "the poor have it,\n" + "the rich need it,\n" + "and if you eat it, you'll die?");

		if (s.equalsIgnoreCase("Nothing")) {
			JOptionPane.showMessageDialog(null, "Correct");

		} else {
			JOptionPane.showMessageDialog(null, "Incorrect");

		}

	}
}
