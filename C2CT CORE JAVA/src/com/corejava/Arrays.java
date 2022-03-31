package com.corejava;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Q: Take an Array as an Input from the user.Search for a given number X and print the index at which it Occurs.
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int numbers[] = new int[size];
		//Input
		for(int i=1; i<size; i++) {
			numbers[i]=sc.nextInt();
		}
		//Output
		for(int i=1; i<numbers.length; i++) {
			int x = sc.nextInt();
			if(numbers[i]==x) {
				System.out.println("x is found at Index: "+ i);
			}
			
		}
		
	}

}
