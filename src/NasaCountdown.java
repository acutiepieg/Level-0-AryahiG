
import javax.swing.JOptionPane;

public class NasaCountdown {
	public static void main(String[] args) {
		// 2. ask the user when to start (JOptionPane.showInputDialog)
		String count = JOptionPane.showInputDialog("Which number do you want to count down from?");
		// 3. convert the user's answer to an int (Integer.parseInt)
		int ans = Integer.parseInt(count);
		// 4. countdown from user's starting point
		for (int i = ans; i > 0; i--) {
			JOptionPane.showMessageDialog(null, i);
		}
		JOptionPane.showMessageDialog(null, "0");
		// 5. when the counting is done, print "blastoff!"
		JOptionPane.showMessageDialog(null, "BLASTOFF!!");
	}
}