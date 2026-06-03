package com.arr;
import java.util.Scanner;
public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter size of array: ");
		        int n = sc.nextInt();
		        char[] arr = new char[n];
		        System.out.println("Enter characters:");
		        for (int i = 0; i < n; i++) {
		            arr[i] = sc.next().charAt(0);
		        }

		        System.out.println("Vowels present in array:");

 for (int i = 0; i < n; i++) {
		   if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' ||arr[i] == 'o' || arr[i] == 'u' || arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' ||
		                arr[i] == 'O' || arr[i] == 'U') {

		                System.out.print(arr[i] + " ");
		            }
		        }
		    }
	}


