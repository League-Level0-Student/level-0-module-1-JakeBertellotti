package ifs_ints_and_loops;

import javax.lang.model.element.VariableElement;
import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int Score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String s = JOptionPane.showInputDialog("What is greater than God,\r\n" + "more evil than the devil,\r\n"
				+ "the poor have it,\r\n" + "the rich need it,\r\n" + "and if you eat it, you'll die?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by
		// one
		if (s.equals("Nothing")) {
			JOptionPane.showMessageDialog(null, "Correct !");
			Score += 1;
			JOptionPane.showMessageDialog(null, Score);

		} else {
			JOptionPane.showMessageDialog(null, "Wrong !");
		}
		JOptionPane.showMessageDialog(null, "The answer is ... Nothing !");

	}
	// 5. Otherwise, say "wrong" and tell them the answer

	// 6. Add some more riddles

	// 2. Make a pop up to show the score.

}
