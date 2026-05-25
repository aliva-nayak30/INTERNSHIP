package com.arr;
import java.util.Scanner;
public class OddDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter size of array: ");
		        int n = sc.nextInt();

		        int arr[] = new int[n];

		        System.out.println("Enter array elements:");

		        for(int i = 0; i < n; i++) {
		            arr[i] = sc.nextInt();
		        }

		        int sum = 0;

		        for(int i = 0; i < n; i++) {
		            if(arr[i] % 2 != 0) {
		                sum = sum + arr[i];
		            }
		        }

		        System.out.println("Sum of odd elements = " + sum);

		        sc.close();
		    }

}
