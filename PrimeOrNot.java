package com.demo.main;

import java.util.Scanner;

public class PrimeOrNot {
	public static boolean isPrime() {
		int num, i, count = 0;
		Scanner s = new Scanner(System.in);

		System.out.print("Enter a Number: ");
		num = s.nextInt();
		if (num < 2)
			return false;
		else {
			for (i = 2; i < num; i++) {
				if (num % i == 0) {
					count++;
					break;
				}
			}

			if (count == 0)
				return true;
			else
				return false;
		}
	}
}
