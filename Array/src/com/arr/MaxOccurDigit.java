package com.arr;
import java.util.Scanner;
public class MaxOccurDigit {

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

		        int maxCount = 0;
		        int maxElement = arr[0];

		        for (int i = 0; i < n; i++) {
		            int count = 0;

		            for (int j = 0; j < n; j++) {
		                if (arr[i] == arr[j]) {
		                    count++;
		                }
		            }

		            if (count > maxCount) {
		                maxCount = count;
		                maxElement = arr[i];
		            }
		        }

		        System.out.println("Maximum occurred element = " + maxElement);
		        System.out.println("Number of occurrences = " + maxCount);

		        sc.close();
		    }
		}

	
