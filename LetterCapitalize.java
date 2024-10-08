package com.CoderByte;

import java.util.Scanner;

/**
 * 
 * Have the function LetterCapitalize(str) take the str parameter being passed and capitalize the first letter
 * of each word. Words will be separated by only one space.
 *
 */

public class LetterCapitalize {
	String LetterCapitalize(String str) {
		
		
		int i;
		String words[] = str.split(" ");
		StringBuilder result = new StringBuilder(); 
		
		for(i=0 ; i<words.length ; i++) {
			if(words[i].length()>0) {
				char firstchar = Character.toUpperCase(words[i].charAt(0));
				result.append(firstchar).append(words[i].substring(1));
			}
			
			if (i < words.length - 1) {
	            result.append(" ");
	        }
		}
		
		
	
		
		return result.toString();

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        LetterCapitalize c = new LetterCapitalize();
        System.out.print(c.LetterCapitalize("ayush ramakant gaikar"));
    }
}

