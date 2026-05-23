package com.arr;
import java.util.Scanner;
public class OddElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner sc = new Scanner(System.in);

		        int n, i;

		        System.out.print("Enter size of array: ");
		        n = sc.nextInt();

		        int arr[] = new int[n];

		        System.out.println("Enter array elements:");

		        for(i = 0; i < n; i++) {
		            arr[i] = sc.nextInt();
		        }

		        System.out.println("Odd elements are:");

		        for(i = 0; i < n; i++) {
		            if(arr[i] % 2 != 0) {
		                System.out.println(arr[i]);
		            }
		        }

		        sc.close();
		    
		

	}

}
