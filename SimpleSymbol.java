package com.CoderByte;

import java.util.Scanner;

/**
 * Have the function SimpleSymbols(str) take the str parameter being passed and determine if it is an acceptable
 * sequence by either returning the string true or false. The str parameter will be composed of + and = symbols
 * with several letters between them (ie. ++d+===+c++==a) and for the string to be true each letter must be
 * surrounded by a + symbol. So the string to the left would be false.
 * The string will not be empty and will have at least one letter.
 *
 */

public class SimpleSymbol {
	String SimpleSymbols(String str) {

		int i;
		for(i=0 ; i<str.length() ; i++) {
			char c = str.charAt(i);
			if(Character.isLetter(c)) {
				if(i==0 || i==str.length()-1) {
					return "false";
				}
				
				if(str.charAt(i-1) != '+' || str.charAt(i+1) != '+') {
					return "false";
				}
		}
			
		}
			
			
			
		return "true";
	}
		
    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        SimpleSymbol c = new SimpleSymbol();
        System.out.print(c.SimpleSymbols(s.nextLine()));
    }
}

