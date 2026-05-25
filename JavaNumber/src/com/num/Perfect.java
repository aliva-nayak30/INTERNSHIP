package com.num;
import java.util.Scanner;
public class Perfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter a number: ");
		        int num = sc.nextInt();
		        int sum = 0;
		        for(int i = 1; i < num; i++) {
		            if(num % i == 0) {
		                sum = sum + i;
		            }
		        }

		        if(sum == num) {
		            System.out.println("Perfect Number");
		        } else {
		            System.out.println("Not a Perfect Number");
		        }

		        sc.close();
		    }
		}
