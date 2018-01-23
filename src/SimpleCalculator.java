

import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
	String c=	JOptionPane.showInputDialog("Give me a number");
	int a= Integer.parseInt(c);
	String d=	JOptionPane.showInputDialog("Give me another number");
	int b= Integer.parseInt(d);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "Do you want to:", "Math Sutff", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "add", "subtract", "multiply", "divide" },
				null);
	
		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.

		if(operation==0) {
		add(a,b);	
		}
		
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	
	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
	}
	
	
	static void add(int a, int b) {
		JOptionPane.showMessageDialog(null, a+"+" +b+ "="+(a+b));}
	

	// 4. Create similar methods for subtraction, multiplication and division.
	static void subtract(int a, int b) {
		JOptionPane.showMessageDialog(null, a+"-" +b+ "=" +(a-b));

	
	}}
}