//Implement an algorithm to determine if a string has all unique characters. 

import java.util.*;

public class UniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter any string");
		Scanner sc = new Scanner(System.in);
		String st= sc.nextLine();
		HashMap<Integer, Character> hm = new HashMap<Integer, Character>();
		for(int i = 0; i<st.length(); i++)
		{
			if(hm.containsValue(st.charAt(i)))
			{
				System.out.println("not unique character is "+st.charAt(i));
				break;
			}
			else
			{
				hm.put(i, st.charAt(i));
			}
		}
		System.out.println("characters encountered"+hm.values());
	}

}
