import javax.swing.JOptionPane;

public class SecretMessageBox {
	public static void main(String[] args) {
		String name = ("Video Games");

		String s = JOptionPane.showInputDialog("What is the password ?");
		if (s.equalsIgnoreCase("Video Games")) {
			JOptionPane.showMessageDialog(null, " You are correct");

		} else {
			JOptionPane.showMessageDialog(null, "Intruder");

		}

	}
}
