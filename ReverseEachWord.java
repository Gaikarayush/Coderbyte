package com.CoderByte;

import java.util.Scanner;

public class ReverseEachWord {
	String ReverseEachWord(String str) {
		StringBuilder r = new StringBuilder(str);
		String a[] = str.split(" ");
		//String a1[] = "";
		
		for(int i=0 ; i<a.length ; i++) {
			StringBuilder r1 = new StringBuilder(a[i]);
			r.append(r1.reverse());
//			if(a.length>0) {
//				
////				r.append(s);
////				r.reverse();
//				//String p = r.toString();
//			}
			
			if(i<a.length-1) {
				r.append(" ");
			}
		}
			
		return r.toString();
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ReverseEachWord r = new ReverseEachWord();
		System.out.println(r.ReverseEachWord(sc.nextLine()));
	}
}