package com.num;
import java.util.Scanner;
public class Duck {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter a number: ");
		        int num = sc.nextInt();
		        int temp = num;
		        boolean isDuck = false;
		        while(temp > 0) {
		            int digit = temp % 10;

		            if(digit == 0) {
		                isDuck = true;
		                break;
		            }

		            temp = temp / 10;
		        }

		        if(isDuck) {
		            System.out.println("Duck Number");
		        } else {
		            System.out.println("Not a Duck Number");
		        }

		        sc.close();

	}

}
