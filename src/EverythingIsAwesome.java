import javax.swing.JOptionPane;

public class EverythingIsAwesome {
	public static void main(String[] args) {
		String ans = JOptionPane.showInputDialog("Name something");
		JOptionPane.showMessageDialog(null, ans + "is awesome!");
	}
}
