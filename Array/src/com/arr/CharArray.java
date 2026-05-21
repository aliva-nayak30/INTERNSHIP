package com.arr;
import java.util.Scanner;
public class CharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of characters: ");
        int n = sc.nextInt();

        char[] ch = new char[n];

        System.out.println("Enter characters:");
        for (int i = 0; i < n; i++) {
            ch[i] = sc.next().charAt(0);
        }

        System.out.println("Characters in reverse order:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(ch[i] + " ");
        }

        sc.close();

	}

}
