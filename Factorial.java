package com.demo.main;

import java.util.Scanner;

public class Factorial {
	public static boolean factorial() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number to find it's factorial: ");
	int num = sc.nextInt();
    long factorial = 1;
    if(num<0) {
    	System.out.println("Factorial Not Possible");
    	return false;
    }
    if(num==0||num==1) { 
    	 System.out.println("Factorial of " +num+" is: 1");
    	return true;
    }
    for(int i = 1; i <= num; ++i)
    {
        // factorial = factorial * i;
        factorial *= i;
    }
    System.out.println("Factorial of " +num+" is: "+factorial);
    return true;
    }
	}

