import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {
		String ans1 = JOptionPane.showInputDialog("Weekday? Yes or No");

		if (ans1.equals("Yes")) {
			String ans2 = JOptionPane.showInputDialog("Are you on vacation? Yes or No");
			if (ans2.equals("Yes")) {
			String ans3 = JOptionPane.showInputDialog("Work? Yes or No");
			if (ans3.equals("Yes")){
				JOptionPane.showMessageDialog(null,"get up lazybones!");
			}
			}
			else {
				JOptionPane.showMessageDialog(null,"get up lazybones!");
			}
		}
					
			else{
				String x = JOptionPane.showInputDialog("Do you have work to do? Yes or No");
					if(x.equals("Yes")){
						JOptionPane.showMessageDialog(null, "get up lazybones!");
			}
					else{
						JOptionPane.showInternalMessageDialog(null, "sleep in");
					}
}

}
}


