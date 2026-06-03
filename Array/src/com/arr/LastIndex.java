package com.arr;
import java.util.Scanner;
public class LastIndex {

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
		        System.out.print("Enter element to search: ");
		        int key = sc.nextInt();
		        int lastIndex = -1;
		        for (int i = 0; i < n; i++) {
		            if (arr[i] == key) {
		                lastIndex = i;
		            }
		        }
		        if (lastIndex != -1) {
		            System.out.println("Last index of " + key + " is: " + lastIndex);
		        } else {
		            System.out.println("Element not found");
		        }

		        sc.close();
		    }
		}

	
