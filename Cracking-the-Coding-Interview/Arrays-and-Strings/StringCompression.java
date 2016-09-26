// Implement a method to perform basic string compression using the counts of repeated characters.
// For example, the string aabcccccaaa would become a2blc5a3. 
// If the "compressed" string would not become smaller than the original string, your method should return the original string.

import java.util.*;

public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter any string: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char last = s.charAt(0);
		int count=1;
		String newstr ="";
		for(int i=1;i<s.length();i++)
		{
			if(s.charAt(i)==last)
			{
				count++;
			}
			else
			{
				newstr+=last+""+count;
				last=s.charAt(i);
				count=1;
			}			
		}
		newstr+=last+""+count;
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
