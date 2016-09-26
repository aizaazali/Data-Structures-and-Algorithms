// Implement a method to perform basic string compression using the counts of repeated characters.
// For example, the string aabcccccaaa would become a2b1c5a3. 
// If the "compressed" string would not become smaller than the original string, your method should return the original string.

import java.util.*;

public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter any string: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		// first character
		char previous = s.charAt(0);
		int count=1;
		String newstr ="";
		for(int i=1;i<s.length();i++)
		{
			if(s.charAt(i)==previous)
			{
				// increments count for repeating characters
				count++;
			}
			else
			{
				// character and count are concatenated to the new string
				newstr+=previous+""+count;
				previous=s.charAt(i);
				count=1;
			}			
		}
		newstr+=previous+""+count;
		// check for string length
		if(s.length()<newstr.length())
		{
			System.out.println(s);
		}
		else
		{
			System.out.println(newstr);	
		}		
	}

}
