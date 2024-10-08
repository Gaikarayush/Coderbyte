package com.CoderByte;

import java.util.Scanner;

/**
 * Have the function WordCount(str) take the str string parameter being passed and return the number of words
 * the string contains (ie. "Never eat shredded wheat" would return 4). Words will be separated by single spaces.
 *
 */


public class Palindrome {
	String Palindrome(String str) {

		
		StringBuilder rev = new StringBuilder(str);
		rev.reverse();
	
		if(str.equals(rev.toString())) {
			return "true";
		}
		
		return "false";
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        Palindrome c = new Palindrome();
        System.out.print(c.Palindrome(s.nextLine()));
    }
    
}
