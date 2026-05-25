package com.num;
import java.util.Scanner;
public class LargestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter first number: ");
		        int a = sc.nextInt();

		        System.out.print("Enter second number: ");
		        int b = sc.nextInt();

		        System.out.print("Enter third number: ");
		        int c = sc.nextInt();

		        if(a >= b && a >= c) {
		            System.out.println("Largest number is: " + a);
		        }
		        else if(b >= a && b >= c) {
		            System.out.println("Largest number is: " + b);
		        }
		        else {
		            System.out.println("Largest number is: " + c);
		        }

		        sc.close();
		    }
	
}
