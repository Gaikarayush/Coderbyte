package com.CoderByte;

import java.util.Scanner;

public class FindIntersection {
	
	public static String FindIntersection(String[] strArr) {
	    // code goes here  
	    // for(string arr : strArr){
	    //   if(arr[0].compare(a[1])){

	    //   }
	    // }

	    String[] arr1 = strArr[0].split(", ");
	    String[] arr2 = strArr[1].split(", ");

	    StringBuilder r = new StringBuilder();


	    for(int i=0 ; i<arr1.length ; i++){
	      for(int j=0 ; j<arr2.length ; j++){
	        if(arr1[i].equals(arr2[j])){
	          if(r.length()>0){
	            r.append(",");
	          }

	          r.append(arr1[i]);
	          
	        }
	      }
	    }


	    return r.toString();
	    //return strArr[0];
	  }

	  public static void main (String[] args) {  
	    // keep this function call here     
	    Scanner s = new Scanner(System.in);
	    System.out.print(FindIntersection(s.nextLine())); 
	  }
}
