package com.CoderByte;

import java.util.Scanner;

public class LetterChanges {
	
	String vowels = "abcdefghijklmnopqrstuvwxyz";
	
	  String LetterChanges(String str) {
		 char[] c = vowels.toCharArray();
		 StringBuilder result = new StringBuilder();
		 for(int i=0 ; i<c.length ; i++) {
			 char currentcharacter = str.charAt(i);
			 currentcharacter = result.append(Character.toUpperCase(c));
			 if(Character.isLetter(c[i])) {
				 	 currentcharacter+=1;
				 }
			 
			 if(currentcharacter == 'z') {
				 currentcharacter = 'a';
			 }else if(currentcharacter == 'Z') {
				 currentcharacter = 'A';
			 }
			 
			 if(currentcharacter == 'a' || currentcharacter == 'e' || currentcharacter == 'i' || currentcharacter == 'o' || currentcharacter == 'u') {
				 currentcharacter=Character.toUpperCase(currentcharacter); 
			 }
			 
			 result.append(currentcharacter);
		 }
		 
		 return result.toString();
	 }
	
	
	
	
	
	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	        LetterChanges c = new LetterChanges();
	        System.out.print(c.LetterChanges(s.nextLine()));
	}
}
