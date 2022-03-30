package com.corejava;


import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int operator = sc.nextInt();
		/***
		 * 1---> Plus
		 * 2--->Minus
		 * 3--->Multiplication
		 * 4--->Divide
		 * 5--->Modulo
		 * 
		 */
		
		switch(operator) {
		case 1 : System.out.println(a+b);
		break;
		
		case 2 : System.out.println(a-b);
		break;
		
		case 3 : System.out.println(a*b);
		break;
		
		case 4 : if(b==0) {
			System.out.println("Invalid Number");
			
		}else {
			System.out.println(a/b);
		}
		break;
		case 5: if(b==0) {
			System.out.println("Invalid Number");
		}else {
			System.out.println(a%b);
		}
		break;
		
		default: System.out.println("Invalid Number");
		}

	}

}
