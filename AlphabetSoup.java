package com.CoderByte;
import java.lang.reflect.Array;
import java.util.*;

/**
 * Have the function AlphabetSoup(str) take the str string parameter being passed and return the string with
 * the letters in alphabetical order (ie. hello becomes ehllo).
 * Assume numbers and punctuation symbols will not be included in the string.
 *
 */



public class AlphabetSoup {
	 String AlphabetSoup(String str) {
	        char c[] = new char[str.length()];
	        c=str.toCharArray();
	        Arrays.sort(c);
	        
	        return new String(c);
	        //return Arrays.toString(c);
	 }

	    public static void main (String[] args) {
	        // keep this function call here
	        Scanner s = new Scanner(System.in);
	        AlphabetSoup c = new AlphabetSoup();
	        System.out.print(c.AlphabetSoup(s.nextLine()));
	    }
}
