package com.CoderByte;

import java.util.Scanner;

/**
 * Have the function ExOh(str) take the str parameter being passed and return the string true if there is an
 * equal number of x's and o's, otherwise return the string false.
 * Only these two letters will be entered in the string, no punctuation or numbers.
 * For example: if str is "xooxxxxooxo" then the output should return false because there are 6 x's and 5 o's.
 *
 */


public class ExOh {
	
	 String ExOh(String str) {
		 
		 int x_count=0,o_count=0;
		 char c[] = str.toCharArray();
		 
		 for(int i=0 ; i<c.length ; i++) {
			 if(c[i]=='x') {
				 x_count++;
			 }
			 if(c[i]=='o') {
				 o_count++;
			 }
		 }
		 
		 if(x_count != o_count) {
			 return "false";
		 }
		 
		 return "true";

	    }

	    public static void main (String[] args) {
	        // keep this function call here
	        Scanner s = new Scanner(System.in);
	        ExOh c = new ExOh();
	        System.out.print(c.ExOh(s.nextLine()));
	    }

}
