package com.corejava;

import java.util.*;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int  size = sc.nextInt();
		
		String names[] = new String[size];
		
		for(int i = 0; i<size; i++) {
			names[i] = sc.next();
			
		}
		
		for(int i=0; i<names.length; i++) {
			System.out.println("names " + (i+1) + " is " + names[i] );
		}
	}

}
