import javax.swing.JOptionPane;

public class XGeeks {
	
		public static void main(String[] args) {

				// 1. Save the superpower for each person in a variable.
String aryahi = "power over elements";
String louis = "time travel";
String tom = "x-ray vision";
				// 2. Ask the user to enter a name. Store their answer in a variable.
String name = JOptionPane.showInputDialog("Enter your name.");
				// 3. Show the superpower in a pop-up, depending on the name entered. 
if (name.equals("Aryahi")){
	JOptionPane.showMessageDialog(null, "Your superpower is "+ aryahi);
}
else if (name.equals("Louis")){
	JOptionPane.showMessageDialog(null, "Your superpower is "+ louis);
}
else if (name.equals("Tom")){
	JOptionPane.showMessageDialog(null, "Your superpower is "+ tom);
}
else if (name.equals("Wendy")){
	JOptionPane.showMessageDialog(null, "Your superpower is flight");
}
		}
		}



