package carPackage;

import java.util.Arrays;

public class tester {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6};
		int positions = 1;
		boolean leftRotation = true;
		if (leftRotation) {
			for (int i = 0; i < positions; i++) {
				int temp = array[0];
				for (int j = 0; j < array.length - 1; j++) {
					array[j + 1] = array[j];
				}
				array[array.length - 1] = temp;
			}
		} else {
			for (int i = 0; i < positions; i++) {
				int temp = array[array.length - 1];
				for (int k = array.length - 1; k > 0; k--) {
					array[k - 1] = array[k];
				}
				array[0] = temp;
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println(Arrays.toString(array));
		
	}

}
