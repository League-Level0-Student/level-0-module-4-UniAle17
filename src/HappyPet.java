//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class HappyPet {
	// 2. Create a happinessLevel variable to store the pet's happiness number.
	// Initialize to zero.
	static int happy = 0;

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store in variable
		String pet = JOptionPane.showInputDialog("What pet would you like to buy?");

		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int i = 0; i < 100; i++) {
			
		
		// 3. Use showOptionDialog to ask the user what they want to do to make their
		// pet happy
		// (eg: cuddle, food, water, take a walk, groom, clean up poop).
		// Make sure to customize the title and question too.
		int task = JOptionPane.showOptionDialog(null, "What would you like to do to make your pet happy?", "Actions", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Feed", "cuddle", "groom" }, null);

		// 5. Use user input to call the appropriate method created in step 4.
		System.out.println(task);
		if (task == 0) {
			feed();
		}

		if (task == 1) {

			cuddle();
			if (task == 2) {
				groom();

			}
		}
		 if(happy >6) {
			 JOptionPane.showMessageDialog(null, "You sure love your pet! Great Job!");
			 break;
			 
		 }
		
		
		
		}
	}

	// 6. If you determine the happiness level is large enough, tell the
	// user that he loves his pet and use break; to exit for loop.
	

	// 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.

	static void feed() {
		JOptionPane.showMessageDialog(null, "Your pet's happy level now incresed to 3");
		happy += 3;
	}

	static void cuddle() {
		JOptionPane.showMessageDialog(null, "Your pet's happy level incresed to 6");
		happy += 6;
	}

	static void groom() {

		JOptionPane.showMessageDialog(null, "Your pet's happy level incresed to 4");
		happy += 4;
	}

}
