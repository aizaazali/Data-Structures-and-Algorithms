// Write a method to replace all spaces in a string with'%20'. 
// You may assume that the string has sufficient space at the end of the string to hold the additional characters, 
// and that you are given the "true" length of the string. 
// EXAMPLE
// Input: "Mr John Smith 	"
// Output: "Mr%20John%20Smith"

import java.util.*;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter any string: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(s);
		//remove all whitespaces in the end
		s=s.trim();
		//replace all whitespaces with %20 
		if(s.contains(" "))
		{
			s=s.replaceAll(" ","%20");
		}
		System.out.println(s);
		
	}

}
