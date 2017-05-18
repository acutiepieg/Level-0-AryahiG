import java.util.Random;

import org.jointheleague.graphical.robot.Robot;
import org.teachingextensions.logo.PenColors;

public class StarryNight {
	// 1. Create a new Robot.
Robot r = new Robot();
	public StarryNight() {
		// 2. Using your robot name, print the window width and height to the console
		 int x = r.getWindow().getWidth();
		 int y = r.getWindow().getHeight();
		System.out.println(x);
		System.out.println(y);
		// 3. Set the robot's speed to draw FAST!
r.setSpeed(10);
drawStar(100);
		// 10. Do steps 7, 8 and 9 100 times.
		
			// 7. Move your robot to a random position using the method created
//     in step 5. Use the random method to get the new X and Y positions.
			//    The syso in step 2 should help you determine how big your canvas is.
		
			// 8. Set your robot pen color to be random, using the method 
//      created in step 6.

			// 9. Draw a star by calling your method created in step 4.
			//    Use the random method to make the size of your star random.


		// 11. Hide your robot so that you can see your beautiful starry sky!!
	
	}

	// 4. Create a method that draws a star. It should have an int parameter 
	//    that determines the size of the star.
	//    Hint: 144 degrees
	void drawStar(int length){
r.penDown();
		for(int i = 0; i < 5; i++){
	r.move(length);
	r.turn(144);
}
	}
	// 5. Create a method that moves the robot using setX and setY.
	//    The method should have 2 int parameters for the X and Y position.
void moveRandom(){
		
	r.setX();

	// 6. Create a method that RETURNS a random number.
	//    The method should have 2 int parameters for the minimum and maximum values
//     of the random number.
}	
	
	public static void main(String[] args) {
		new StarryNight();
		
	}
}

