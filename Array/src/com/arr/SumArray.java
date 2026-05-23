package com.arr;
import java.util.Scanner;
public class SumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner sc = new Scanner(System.in);

		        int n, i, sum = 0;

		        System.out.print("Enter size of array: ");
		        n = sc.nextInt();

		        int arr[] = new int[n];

		        System.out.println("Enter array elements:");

		        for(i = 0; i < n; i++) {
		            arr[i] = sc.nextInt();
		        }

		        // Calculate sum
		        for(i = 0; i < n; i++) {
		            sum = sum + arr[i];
		        }

		        System.out.println("Sum of array elements is: " + sum);

		        sc.close();

	}

}
