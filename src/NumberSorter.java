import javax.swing.JOptionPane;

public class NumberSorter {

	public static void main(String[] args) {
		String x = JOptionPane.showInputDialog("Choose a random number between 1 and 100");
		String y = JOptionPane.showInputDialog("Choose another random number between 1 and 100");
		String z = JOptionPane.showInputDialog("Last number between 1 and 100");
	int a = Integer.parseInt(x);
	int b = Integer.parseInt(y);
	int c = Integer.parseInt(z);
		if(a > b && a > c){
			System.out.println(a);
			if(b > c){
				System.out.println(b);
			}
			else{
				System.out.println(c);
				System.out.println(b);
			}
		}
		else if(b > c && b > a){
			System.out.println(b);
			if(a > c){
				System.out.println(a);
			}
			else{
				System.out.println(c);
				System.out.println(b);
		}
		else if(c > a && c > b){
			System.out.println(c);
		}
	
	}
	
}
