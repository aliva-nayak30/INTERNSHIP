package com.arr;
import java.util.Scanner;
public class IndexSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in);

        int n, i;
        int evenSum = 0, oddSum = 0;

        System.out.print("Enter size of array: ");
        n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");

        for(i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Calculate even and odd index sums
        for(i = 0; i < n; i++) {

            if(i % 2 == 0) {
                evenSum = evenSum + arr[i];
            }
            else {
                oddSum = oddSum + arr[i];
            }
        }

        System.out.println("Sum of even index values: " + evenSum);
        System.out.println("Sum of odd index values: " + oddSum);

        sc.close();
		

	}

}
