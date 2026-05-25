package com.num;
import java.util.Scanner;
public class PosNegZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter a number: ");
		        int num = sc.nextInt();

		        if(num > 0) {
		            System.out.println("Positive Number");
		        }
		        else if(num < 0) {
		            System.out.println("Negative Number");
		        }
		        else {
		            System.out.println("Number is Zero");
		        }

		        sc.close();
		    }
		}

