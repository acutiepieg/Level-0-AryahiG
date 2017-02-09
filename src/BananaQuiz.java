import javax.swing.JOptionPane;

public class BananaQuiz {

	public static void main(String[] args) {
		// 1. ask the user if they like bananas
		String question1 = JOptionPane.showInputDialog("Do you like bananas? Answer with yes or no, and no capitals.");
		// 2. if they say no,
		if (question1.equals("no")) {
			// tell them they are crazy
			JOptionPane.showMessageDialog(null, "You are crazy");
			// and end quiz
			System.exit(0);
		}
		// 3. if they say yes
		else {
			// ask them what is their favorite hobby
			String hobby = JOptionPane.showInputDialog("What's your favorite hobby?");
			// show a pop up that says "<your hobby> is much better with
			// bananas!"
			JOptionPane.showMessageDialog(null, "BANANAS ARE BETTER THAN " + hobby);
		}
		// 4. OPTIONAL: if they say something other than “yes” or “no”
		// show a pop up that says “You are bananas!”

	}

}
