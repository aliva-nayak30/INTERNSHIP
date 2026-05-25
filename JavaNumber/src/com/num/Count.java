package com.num;
import java.util.Scanner;
public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter a number: ");
		        int num = sc.nextInt();
		        int count = 0;

		        while(num != 0) {
		            num = num / 10;
		            count++;
		        }

		        System.out.println("Number of digits = " + count);

		        sc.close();
		    }
		}

	