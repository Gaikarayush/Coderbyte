package com.CoderByte;
import java.util.Scanner;

/*
 * First Non-repeated Character
   - Problem: Write a function to find the first character in a string that does not repeat.
   - Input: A string.
   - Output: The first non-repeated character.  
   Input: "swiss"  
   Output: "w"
 */

public class FirstNonRepeatedCharacter {
	char FirstNonRepeatedCharacter (String str) {
		char check[] = str.toCharArray();
		//char non =' ';
		
		for(int i=0 ; i<check.length ; i++) {
			int count =0;
			for(int j=0 ; j<check.length ; j++ ) {
				if(check[i]==check[j]) {
					count++;
				}
			}
			
			if(count==1) {
				return check[i];
			}
			
		}
		
		return ' ';
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FirstNonRepeatedCharacter f = new FirstNonRepeatedCharacter();
		System.out.println(f.FirstNonRepeatedCharacter(sc.nextLine()));
	}
}
