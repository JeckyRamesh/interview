package com.adp.interview;

import java.util.Scanner;


public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to be reversed ");
		String input = sc.nextLine();
		StringBuffer sbf = new StringBuffer(input);
		 
		System.out.println(sbf.reverse());


	}

}
