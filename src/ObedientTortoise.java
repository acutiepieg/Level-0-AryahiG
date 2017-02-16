import org.teachingextensions.logo.Tortoise;

public class ObedientTortoise {

	public static void main(String[] args) {
		Tortoise.show();
		Tortoise.penDown();
		Tortoise.setSpeed(10);
		drawSquare(200);
		drawCircle(150);
	}
		
		public static void drawSquare(int size){
		for(int i=0; i < 4; i ++){
		Tortoise.move(size);
		Tortoise.turn(90);
		}
		}
		
		private static void drawCircle(int size){
			for(int i = 0; i< 360; i ++){
				Tortoise.move(1);
			Tortoise.turn(1);
			}
			
		}
	}


