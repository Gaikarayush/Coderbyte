package com.CoderByte;
import java.util.*;
/*
 * Have the function BracketMatcher(str) take the str parameter being passed and return 1 
 * if the brackets are correctly matched and each one is accounted for. 
 * Otherwise return 0. For example: if str is "(hello (world))", then the output should be 1,
 * but if str is "((hello (world))" the the output should be 0 because the brackets do not correctly 
 * match up. Only "(" and ")" will be used as brackets. If str contains no brackets return 1.
 */

public class BracketMatcher {


 
	  public static int BracketMatcher(String str) { 
	  
			int count=0;

	    for(int i=0 ; i<str.length() ; i++){
	      if(str.charAt(i) == '('){
	        count+=1;
	      }else if(str.charAt(i)==')'){
	        count-=1;
	      }
	    
	    }

	      if(count<0){
	        return 0;
	      }

	      if(count==0){
	        return 1;
	      }
	    

	    return 0;
		}
	  
	  public static void main (String[] args) {  
	    // keep this function call here     
	    Scanner s = new Scanner(System.in);
	    System.out.print(BracketMatcher(s.nextLine())); 
	  }

	}

