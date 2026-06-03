package com.arr;
import java.util.Scanner;
public class EvenValue {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter the size of the array: ");
		        int n = sc.nextInt();
		        int[] arr = new int[n];

		        System.out.println("Enter " + n + " even numbers:");
		        for (int i = 0; i < n; i++) {
		            int num = sc.nextInt();
		            if (num % 2 == 0) {
		                arr[i] = num;
		            } else {
		                System.out.println("Odd number entered");
		                i--; 
		            }
		        }

		        System.out.println("Even numbers stored in the array are:");

		        for (int i = 0; i < n; i++) {
		            System.out.print(arr[i] + " ");
		        }

		        sc.close();
		    }
		}

