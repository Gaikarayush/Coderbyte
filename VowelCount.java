package com.CoderByte;

import java.util.Scanner;


/**
 * Have the function VowelCount(str) take the str string parameter being passed and return the number of vowels
 * the string contains (ie. "All cows eat grass" would return 5). Do not count y as a vowel for this challenge.
 *
 */



public class VowelCount {
//	final String VOWELS = "aeiou";
//    final String VOWELS_UPPER = VOWELS.toUpperCase();

    int VowelCount(String str) {
   
    	//char c = str.toCharArray();
    	int count=0;
    	for(int i=0 ; i<str.length() ; i++) {
    		char c = str.charAt(i);
    		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c=='u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c=='U') {
    			count++;
    		}
    	}
    	
    	return count;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        VowelCount c = new VowelCount();
        System.out.print(c.VowelCount(s.nextLine()));
    }
}
