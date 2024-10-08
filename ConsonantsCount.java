package com.CoderByte;

import java.util.Scanner;

public class ConsonantsCount {
	int ConsonantsCount(String str) {
		
		int count=0;
		for(int i=0 ; i<str.length() ; i++) {
			char c = str.charAt(i);
			if(c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
				count+=1;
			}
		}
		
		return count;
	}
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ConsonantsCount c = new ConsonantsCount();
		System.out.println(c.ConsonantsCount(sc.nextLine()));
	}
}