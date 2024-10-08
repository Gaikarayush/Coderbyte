package com.CoderByte;

import java.util.Scanner;

public class RemoveDuplicates {
	String RemoveDuplicates(String str) {
		String s[] = str.split(" ");
		//String up = "";
		
		StringBuffer result = new StringBuffer();
		//int count=0;
		
		for(int i=0 ; i<s.length ; i++) {
			boolean isduplicate = false;
			for(int j=0 ; j<i ; j++) {
				if(s[i].equals(s[j])) {
					isduplicate=true;
					
				}	
		
			}
			if(!isduplicate) {
				if(result.length()>0) {
					result.append(" ");
				}
				
				result.append(s[i]);
			}
					
		}
		
		
		return result.toString();
		
		
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		RemoveDuplicates r = new RemoveDuplicates();
		System.out.println(r.RemoveDuplicates(sc.nextLine()));
	}
}
