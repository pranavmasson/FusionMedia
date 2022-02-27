
public class ArrayAlgos2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		int[] example1 = {1, 2, 3, 3, 4, 5};
		int[] example2 = {1, 3, 5, 2, 3, 6, 7, 8};
		int[] example3 = {1, 1, 3, 4, 5};
		
		int[] example4 = {1, 2, 2};
		int[] example5  = {1, 2, 4};
		int[] example6 = {1, 4, 4};
		int[] example7 = {1, 4, 2};
		
		//System.out.println(isNext(example3));
		//System.out.println(isThreeNextOdd(example3));
		//System.out.println(isThreeNextInc(example3));
		//System.out.println(is2or4Next(example3));
		System.out.println(more1Or4(example2));
		
	}
	
	/*
	 * returns true if there are 2 values next to each other in the array that are the same
	 * else return false
	 */
	public static boolean isNext(int[] array) {
		for(int i = 0; i< array.length-1;i++)
		{
			if(array[i] == array[i+1]) {
				return true;
			}
		}
		
		return false;
		
	}
	
	/*
	 * returns true if 3 values in the array that are next to each other are odd
	 * else return false
	 */
	public static boolean isThreeNextOdd(int[] array) {
		for(int i = 0; i < array.length-2;i++) {
			if(array[i]%2 == 1 && array[i+1]%2 == 1 && array[i+2]%2 == 1) {
				return true;
			}
		}
		return false;
		
	}
	
	/*
	 * returns true if 3 values in the array that are next to each other
	 * are consecutive
	 * else return false
	 */
	public static boolean isThreeNextInc(int[] array) {
		for(int i = 0; i < array.length-2;i++) {
			if(array[i] + 1 == array[i+1] && array[i] + 2 == array[i+2]) {
				return true;
			}
		}
		return false;
	}
	
	/*
	 * returns true if there is a 2 or 4 that is next to each other in the array
	 * else return false
	 */
	public static boolean is2or4Next(int[] array) {
		for(int i = 0; i < array.length-1;i++) {
			if((array[i]==2 && array[i+1] == array[i]) 
					|| (array[i] == 4 && array[i+1] == array[i]) 
					|| (array[i] == 2 && array[i+1] == 4)
					|| (array[i] == 4 && array[i+1] == 2)){
				return true;
			}
		}
		return false;		
	}
	
	public static boolean alternative(int[] array) {
		for(int i = 0; i < array.length-1;i++) {
			if ((array[i] == 2 && (array[i+1] == 2 || array[i+1] == 4))
					|| (array[i] == 4 && (array[i+1] == 2 || array[i+1] == 4))) {
				return true;
			}
		}
		return false;
	}
	
	/*
	 * returns true if there are more 1's than 4's in the array
	 * returns false if there are more 4's than 1's in the array
	 * returns false if there are the same number of 1's and 4's in the array
	 */
	public static boolean more1Or4(int[] array) {
		int numOne = 0;
		int numFour = 0;
		for(int i = 0; i < array.length;i++)	{
			if(array[i] == 1) {
				numOne++;
			}
			else if(array[i] == 4) {
				numFour++;
			}
		}
		if(numOne > numFour) {
			return true;
		}
		else {
			return false;
		}
	}
	

}
