// Assume you have a method isSubstring which checks if one word is a substring of another.
// Given two strings, s1 and s2, write code to check if s2 is a rotation of si using only one call to isSubstring 
// Example: "waterbottLe" is a rotation of "erbottLewat".

import java.util.*;

public class RotationalSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter original string: ");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		System.out.println("enter the substring: ");
		String s2=sc.nextLine();
		// check for string length
		if(s1.length()==s2.length())
		{
			// Concatenate original string with itself.
			String s1s1=s1+""+s1;
			boolean istrue=isSubstring(s1s1, s2);
			if(istrue)
			{
				System.out.println("it is a rotational substring");
			}
			else
			{
				System.out.println("it is not a rotational substring");	
			}			
		}
		else
		{
			System.out.println("String length is not the same");
		}

	}
	public static boolean isSubstring(String s1, String s2)
	{
		boolean isSubstr=false;
		// check for rotational substring
		if(s1.contains(s2))
		{
			isSubstr=true;
		}
		return isSubstr;
	}

}
