import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public HighLowGame() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 10. 
		int random = new Random().nextInt(10)+1;
		// 2. Print out the random variable above
System.out.println(random);		
        // 11. do the following 10 times
		
			// 1. ask the user for a guess using a pop-up window, and save their response 
String answer= JOptionPane.showInputDialog("Guess a number between 1 and 10");
			// 4. convert the users’ answer to an int (Integer.parseInt(string))
int ans = (Integer.parseInt(answer));
			// 5. if the guess is correct
			if (ans == random){	
			// 6. win
				JOptionPane.showMessageDialog(null,"You guessed correct! You win!");
			}
			// 7. if the guess is high
			else if (ans < random ){	
			// 8. tell them it's too high
				JOptionPane.showMessageDialog(null,"You guessed to low. Guess again, you get two more guesses.");
			}
				// 9. if the guess is low
				else if (ans > random){
				// 10. tell them it's too low
					JOptionPane.showMessageDialog(null,"You guessed to high. Guess again, you get two more guesses. ");
		// 12. tell them they lose
				}
					//next round
					String answer2= JOptionPane.showInputDialog("Guess a number between 1 and 10 (again)");
				
		int ans2 = (Integer.parseInt(answer2));
				
		 if (ans2 == random){	
			// 6. win
				JOptionPane.showMessageDialog(null,"You guessed correct! You win! (it took you only two rounds, nice)");
			}
			// 7. if the guess is high
			else if (ans2 < random ){	
			// 8. tell them it's too high
				JOptionPane.showMessageDialog(null,"You guessed to low. Guess again, you get one more guess.");
			}
				// 9. if the guess is low
				else if (ans2 > random){
				// 10. tell them it's too low
					JOptionPane.showMessageDialog(null,"You guessed to high. Guess again, you get one more guess. ");
				}
					//final round
					String answer3= JOptionPane.showInputDialog("Guess a number between 1 and 10 (last time)");
					
					int ans3 = (Integer.parseInt(answer3));
							
					if (ans3 == random){	
						// 6. win
							JOptionPane.showMessageDialog(null,"You guessed correct! You win! (it's about time)");
						}
						// 7. if the guess is high
						else if (ans3 < random ){	
						// 8. tell them it's too high
							JOptionPane.showMessageDialog(null,"You guessed to low.(You lose)");
						}							
							// 9. if the guess is low
							else if (ans3 > random){
							// 10. tell them it's too low
								JOptionPane.showMessageDialog(null,"You guessed to high. (You lose)");
								}
	}
}
				

	
	

