import javax.swing.JOptionPane;

public class NumberSorter {

	public static void main(String[] args) {
		String x = JOptionPane.showInputDialog("Choose a random number between 1 and 100");
		String y = JOptionPane.showInputDialog("Choose another random number between 1 and 100");
		String z = JOptionPane.showInputDialog("Last number between 1 and 100");
		JOptionPane.showMessageDialog(null, "I will now show them to you in ascending order...");
		int a = Integer.parseInt(x);
		int b = Integer.parseInt(y);
		int c = Integer.parseInt(z);
		if (a < b && a < c) {
			JOptionPane.showMessageDialog(null, a);
			if (b < c) {
				JOptionPane.showMessageDialog(null, b);
				JOptionPane.showMessageDialog(null, c);
			} else {
				JOptionPane.showMessageDialog(null, c);
				JOptionPane.showMessageDialog(null, b);
			}
		} else if (b < c) {
			JOptionPane.showMessageDialog(null, b);
			if (a < c) {
				JOptionPane.showMessageDialog(null, a);
				JOptionPane.showMessageDialog(null, c);
			} else {
				JOptionPane.showMessageDialog(null, c);
				JOptionPane.showMessageDialog(null, a);
			}
		} else {
			JOptionPane.showMessageDialog(null, c);
			if (b < a) {
				JOptionPane.showMessageDialog(null, b);
				JOptionPane.showMessageDialog(null, a);
			} else {
				JOptionPane.showMessageDialog(null, a);
				JOptionPane.showMessageDialog(null, b);
			}

		}

	}
}
