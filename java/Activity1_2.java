package JavaActivity1_2;
import java.util.*;
public class Activity1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num = {10, 77, 10, 54, -11, 10};
		System.out.println("Input array is: " + Arrays.toString(num));
		int ten=10;
		int thirty=30;
		System.out.println("Result: " + result(num, ten, thirty));
	}
	public static boolean result(int[] numbers, int ten, int thirty) {
		int tempSum = 0;
		for (int number : numbers) {
			if (number == ten) {
				tempSum += ten;
			}

			if (tempSum > thirty) {
				break;
			}
		}
		return tempSum == thirty;
	}
}