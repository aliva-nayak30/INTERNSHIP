package com.num;
import java.util.Scanner;
public class Prime1ToN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter N: ");
		        int n = sc.nextInt();
		        for(int num = 1; num <= n; num++) {

		            int count = 0;

		            for(int i = 1; i <= num; i++) {
		                if(num % i == 0) {
		                    count++;
		                }
		            }

		            if(count == 2) {
		                System.out.print(num + " ");
		            }
		        }

		        sc.close();
		    }
}
