//Given two strings, write a method to decide if one is a permutation of the other.

// A permutation means if the characters in one string are the same in another string
// Examples: 'teach' and 'cheat'; 'abcda' and 'aabcd' but not 'abcd'

import java.util.*;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter any two strings:");
		Scanner sc = new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		// convert string to array
		char[] sort1 = s1.toCharArray();
		char[] sort2 = s2.toCharArray();
		// sort the array in alphabetical order
		java.util.Arrays.sort(sort1);
		java.util.Arrays.sort(sort2);		
		// convert array values to string
		s1=new String(sort1);
		s2=new String(sort2);
		// check for equality
		if(s1.length()==s2.length())
		{
			if(s1.equals(s2))
			{
				System.out.println("permutation");
			}
			else
			{
				System.out.println("no permutation");
			}			
		}
		else
		{
			System.out.println("invalid length");
		}

				
	}
}
