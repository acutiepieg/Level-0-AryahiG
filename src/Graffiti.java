import org.jointheleague.graphical.robot.Robot;

public class Graffiti {

	public static void main(String[] args) {
		Robot r = new Robot();
		r.setSpeed(10);
		drawingA();
		drawingG();
	}

	static void drawingA() {
		Robot r = new Robot();
		r.setSpeed(10);
		r.penDown();
		r.turn(25);
		r.move(200);
		r.turn(120);
		r.move(200);
		r.penUp();
		r.turn(180);
		r.move(100);
		r.turn(300);
		r.penDown();
		r.move(100);
		r.penUp();
		r.move(200);
	}

	static void drawingG() {
		Robot r = new Robot();
		r.setSpeed(10);
		r.turn(90);
		r.move(300);
		r.turn(270);
		r.move(200);
		r.turn(90);
		r.penDown();
		for (int i = 0; i < 200; i++) {
			r.move(2);
			r.turn(1);
		}

	}
}
