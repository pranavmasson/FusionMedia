package inheritance;

import java.awt.Color;

public class mainmethod {

	public static void main(String[] args) {

		// reference type		 // object type
		SUV new_suv               = new SUV(4, 4, "honda", "pilot", Color.black, 7, true);
		System.out.println(new_suv.getMake());
		// variable declaration  // variable instantiation
		
		
		// the right side must be the class on the left side, or below
		//												e.g. a subclass
		
	}

}

/*
 * 						animal
 * 					   /	\
 * 					inv.	vert.
 * 					/			\
 * 				  bug			human	
 * 
 */




/*
 * suppose Animal is the parent class
 * and we have 2 subclasses for animal: Vertebrate Invertebrate
 * suppose vertebrate has a subclass called human
 * suppose invertebrate has a subclass called bug
 * assume we are only using default constructors
 * 
 * (a) is the following code correct
 * 			human bob = new vertebrate();
 * 
 * 
 * 
 * 
 * 
 */





























