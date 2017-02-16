import java.net.URI;

import javax.swing.JOptionPane;

public class SoundtrackToLife {

	public static void main(String[] args) {
for(int i = 0; i < 5; i ++){
		// 1. Adjust this pop-up to find out what mood the user is in.
		int userMood = JOptionPane.showOptionDialog(null, "What mood are you in?", "Mood Quiz", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Happy", "Sad", "Angry", "Stressed" }, null);

		// 2. Their answer is stored in the userMood variable. Print it out.

		// 3. If they are in a stressed mood, use the playVideo method to play a
		// calming song from YouTube.
		if (userMood == 0) {
			JOptionPane.showMessageDialog(null, "I'm happy too");
			int userMood2 = JOptionPane.showOptionDialog(null, "Where did your happiness start?", "Mood Quiz", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Other", "Mall", "School","Work", "Home" }, null);
			JOptionPane.showMessageDialog(null, "Nice, I'm glad you're happy");
			
		}

		else if (userMood == 1) {
			JOptionPane.showMessageDialog(null, "I hope you feel better, everything will be all right");
			int userMood3 = JOptionPane.showOptionDialog(null, "Where did your sadness start?", "Mood Quiz", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Other", "Mall", "School", "Work","Home" }, null);
		JOptionPane.showMessageDialog(null, "That is a nice place but sometimes the things there make you sad ");
		}

		else if (userMood == 2) {
			JOptionPane.showMessageDialog(null, "Calm down, be happy");
			int userMood2 = JOptionPane.showOptionDialog(null, "Where did your anger start?", "Mood Quiz", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Other", "Mall", "School","Work","Home" }, null);
		JOptionPane.showMessageDialog(null, "Take 3 deep breaths and think about the postitive side of things, you will feel better.");
		}

		else if (userMood == 3) {
			JOptionPane.showMessageDialog(null, "Calm down, focus on one thing at a time");
			int userMood2 = JOptionPane.showOptionDialog(null, "Where did your stress start?", "Mood Quiz", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Other", "Mall", "School","Work", "Home" }, null);
			JOptionPane.showMessageDialog(null, "Take 3 deep breaths and think about the postitive side of things, you will feel better.");
		}
	}

	
}
}
