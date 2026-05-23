package com.arr;
import java.util.Scanner;
public class EvenIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Elements at even index:");

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println(arr[i]);
            }
        }

        sc.close();

	}

}
