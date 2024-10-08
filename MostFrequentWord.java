package com.CoderByte;

import java.util.Scanner;
/*
 * Most Frequent Word
   - Problem: Write a function that returns the most frequently occurring word in a string. If multiple words have the same frequency, return the first one.
   - Input: A string with words separated by spaces.
   - Output: The word with the highest frequency.
   Input: "cat dog cat bird dog cat"  
   Output: "cat"


 */

public class MostFrequentWord {
	String MostFrequentWord(String str) {
		String latest[] = str.split(" ");
		//Arrays.sort(latest);
		String repeated="";
		//int count=0;
		for(int i=0 ; i<latest.length ; i++) {
			for(int j=latest.length-1 ; j>=0 ; j--) {
				if(latest[i].equals(latest[j])) {
					repeated=latest[i];
				}
				
			}
		}
		return repeated;
	}
		
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MostFrequentWord m = new MostFrequentWord();
		System.out.println(m.MostFrequentWord(sc.nextLine()));
	}
}
