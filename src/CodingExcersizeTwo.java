
/* Level 0 Exam: Coding  Exercise #2 */
import javax.swing.JOptionPane;

import org.omg.Messaging.SyncScopeHelper;

import com.spun.util.velocity.ParseCall;

/**
 * Write a program that asks the user for their age. Tell them which year they
 * were born. If they are over 30, tell them they are too old to play this game.
 **/

public class CodingExcersizeTwo {
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("What is your age?");
		int ans = Integer.parseInt(age);
		int ans1 = 2017 - ans;
		JOptionPane.showMessageDialog(null, "You were born in " + ans1);
		if (ans < 30) {
			JOptionPane.showMessageDialog(null, "You're the perfect age to play this game.");
		}
		if(ans >= 30){
			JOptionPane.showMessageDialog(null,"You are way to old for this game.");
		}
	}
}
