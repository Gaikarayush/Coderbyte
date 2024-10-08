package com.CoderByte;

import java.util.Scanner;


/**
 * Have the function SwapCase(str) take the str parameter and swap the case of each character.
 * For example: if str is "Hello World" the output should be hELLO wORLD.
 * Let numbers and symbols stay the way they are.
 *
 */


public class SwapCase {
	 String SwapCase(String str) {
	        StringBuilder result = new StringBuilder();
	       
	        
	        for(int i=0 ; i<str.length() ; i++) {
	        	
	        	char c = str.charAt(i);
	        	if(Character.isUpperCase(c)) {
	        		result.append(Character.toLowerCase(c));
	        	}else {
	        		result.append(Character.toUpperCase(c));
	        	}
	        }
	        
	        return result.toString();	        
	 }

	    public static void main (String[] args) {
	        // keep this function call here
	        Scanner s = new Scanner(System.in);
	        SwapCase c = new SwapCase();
	        System.out.print(c.SwapCase(s.nextLine()));
	    }
}
