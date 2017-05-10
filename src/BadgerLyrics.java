
public class BadgerLyrics {

	public static void main(String[] args) {
		myBadger();
		myMushroom();
		myBadger();
		myMushroom();
		myBadger();
		myMushroom();
		System.out.println("Aaah! A Snake!!!!!");

	}

	static void myBadger() {
		for (int i = 0; i < 10; i++) {
			System.out.print("Badger ");
		}
		System.out.println();
	}

	static void myMushroom() {
		for (int i = 0; i < 2; i++) {
			System.out.print("Mushroom ");
		}
		System.out.println();
	}
}