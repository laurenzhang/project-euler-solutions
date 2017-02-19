/*
	Lauren Zhang
	
	Problem 1:
	If we list all the natural numbers below 10 that are multiples of 3 or 5, 
	we get 3, 5, 6 and 9. The sum of these multiples is 23. Find the sum of 
	all the multiples of 3 or 5 below 1000.
*/

import java.io.*;

public class SumOfMultiples {
	public static final int UPPER_BOUND = 1000;
	public static final int SOLUTION = 233168;

	public static void main(String[] args) {
		int answer = findSum();
		if (answer != SOLUTION)
			System.out.println("We found the wrong answer: " + answer);
		else
			System.out.println("We found the right answer: " + answer);
	}

	public static int findSum() {
		int sum = 0;

		for (int i = 1; i < UPPER_BOUND; i++)
			if (i % 3 == 0 || i % 5 == 0)
				sum += i;

		return sum;
	}
}

