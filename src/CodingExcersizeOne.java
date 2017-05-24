
import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;
import org.teachingextensions.logo.Colors;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExcersizeOne {
	static Robot r = new Robot();

	public static void main(String[] args) {
		// 3. ask the user what color they would like the Robot to draw
		String color = JOptionPane
				.showInputDialog("What is your favorite color out of these colors, red, blue, yellow?");
		// 4. use an if/else statement to set the pen color that the user
		// requested (minimum of 2 colors)
		if (color.equals("red")) {
			r.setPenColor(Colors.Reds.Crimson);
		} else if (color.equals("blue")) {
			r.setPenColor(Colors.Blues.RoyalBlue);
		} else if (color.equals("yellow")) {
			r.setPenColor(Colors.Yellows.LemonChiffon);
		} else {
			JOptionPane.showMessageDialog(null, "That color is not in my database.");
			r.setPenColor(Colors.Grays.Black);
		}

		// 2. set the pen width to 10
		r.setPenWidth(10);
		// 1. make the Robot draw a shape
		r.penDown();
		for (int i = 0; i < 360; i++) {
			r.move(1);
			r.turn(1);
		}
		r.penUp();
		r.move(150);
	}
}
