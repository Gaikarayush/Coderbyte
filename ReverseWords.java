package com.CoderByte;

import java.util.Scanner;

public class ReverseWords {


	String ReverseWords(String str) {
		String r[] = str.split(" ");
		StringBuilder b = new StringBuilder();
		for(int i=r.length-1 ; i>=0 ; i--) {
			b.append(r[i]);
			
			if(i!=0) {
				b.append(" ");
			}
		}
		
	    return b.toString();	
}
		 

	    public static void main (String[] args) {
	        // keep this function call here
	        Scanner s = new Scanner(System.in);
	        ReverseWords c = new ReverseWords();
	        System.out.print(c.ReverseWords(s.nextLine()));
	    }
}
