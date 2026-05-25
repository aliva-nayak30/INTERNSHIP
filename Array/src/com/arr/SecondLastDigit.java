package com.arr;
import java.util.Scanner;
public class SecondLastDigit {

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

		        System.out.println("Second last element = " + arr[n - 2]);

		        sc.close();

	}

}
