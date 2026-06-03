package com.arr;
import java.util.Scanner;
public class CountZeros {

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

		        int count = 0;

		        for (int i = 0; i < n; i++) {
		            if (arr[i] == 0) {
		                count++;
		            }
		        }

		        System.out.println("zeros = " + count);
		    }
		}

