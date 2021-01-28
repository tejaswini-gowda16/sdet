package JavaActivity1_4;

import java.util.Arrays;

public class Activity1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num = {10, 77, 8, 54, 11, 3};
		System.out.println("Input array is: " + Arrays.toString(num));
		int size = num.length, i;
		for (i = 1; i < size; i++) {
			int key = num[i];
			int j = i - 1;

			while (j >= 0 && key < num[j]) {
				num[j + 1] = num[j];
				--j;
			}
			num[j + 1] = key;
		}
		System.out.println("Sorted Array in Ascending Order: " + Arrays.toString(num));
	}

}	
