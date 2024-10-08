package com.CoderByte;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Anagram Check
   - Problem: Write a function to determine if two strings are anagrams (contain the same characters in the same frequency).
   - Input: Two strings.
   - Output: True if the strings are anagrams, otherwise False.
    Anagram Check  
   Input: "listen", "silent"  
   Output: True

 */

public class Anagram {
	String Anagram(String str) {
		String a[] = str.split(" ");
		//Arrays.sort(a);
		char a1[] = a[0].toCharArray();
		char a2[] = a[1].toCharArray();
		
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		if(Arrays.equals(a1,a2)) {
			return "true";
		}
		
		
		return "false";
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Anagram a = new Anagram();
		System.out.println(a.Anagram(sc.nextLine()));
	}
}
