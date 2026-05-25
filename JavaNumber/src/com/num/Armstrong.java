package com.num;
import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter a number: ");
		        int num = sc.nextInt();
		        int original = num;
		        int sum = 0;
		        while(num != 0) {
		            int digit = num % 10;
		            sum = sum + (digit * digit * digit);
		            num = num / 10;
		        }

		        if(original == sum) {
		            System.out.println("Armstrong Number");
		        } else {
		            System.out.println("Not an Armstrong Number");
		        }

		        sc.close();
		    }
}
