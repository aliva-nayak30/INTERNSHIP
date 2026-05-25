package com.arr;
import java.util.Scanner;
public class PrimeElement {

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

		        System.out.println("Prime numbers in the array are:");

		        for(int i = 0; i < n; i++) {

		            int count = 0;

		            for(int j = 1; j <= arr[i]; j++) {
		                if(arr[i] % j == 0) {
		                    count++;
		                }
		            }

		            if(count == 2) {
		                System.out.print(arr[i] + " ");
		            }
		        }

		        sc.close();
		    }
}
