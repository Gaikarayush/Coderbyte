package com.CoderByte;

import java.util.Scanner;

public class CamelCaseConversion {
	String CamelCaseConversion(String str) {
		String a[] = str.split(" ");
		StringBuilder b = new StringBuilder();
		
		for(int i=0 ; i<a.length ; i++) {
			String word = a[i];
			if(i==0) {
				b.append(word.toLowerCase());
			}else {
				b.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1).toLowerCase());
			}
		}
		
		
		return b.toString();	
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CamelCaseConversion c = new CamelCaseConversion();
		System.out.println(c.CamelCaseConversion(sc.nextLine()));
		
	}
}
