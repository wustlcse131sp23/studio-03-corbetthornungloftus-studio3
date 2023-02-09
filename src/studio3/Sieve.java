package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("How many numbers?");
		int length = in.nextInt();
		boolean[] numbers = new boolean[length];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = true;

		}
		for (int iterator = 2; iterator <= Math.sqrt(length); iterator++) {

			for (int nums = iterator*2; nums < numbers.length; nums+=iterator) {
				numbers[nums] = false;


			}





		}

		for (int w = 2; w< numbers.length; w++) {
			if (numbers[w]==true) {
				System.out.println(w);
			}
		}


		//		
		//		for(int r=6; r< numbers.length; r=r+3) {
		//			numbers[r] = false;
		//		}
		//		
		//		for(int s=10; s< numbers.length; s=s+5) {
		//			numbers[s] = false;
		//		}
		//		for(int p=14; p< numbers.length; p=p+7) {
		//			numbers[p] = false;
		//		}
		//		

		//		for (int i = 0; i < length; i++) {
		//	    	 numbers[i]++; 
		//	    	 System.out.print((i+1) + " "); //check if array exists
		//	     }
		//		for(int i = 2; )
		////		for (int v : numbers)
		////	     {
		////	       System.out.print(v + " ");
		////	     }


	}

}
