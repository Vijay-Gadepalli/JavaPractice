package Practice.Java;

import java.util.HashSet;
import java.util.Set;

public class string_duplicate_element {
	
	public static void main(String[] args) {
		
		String[] s= {"vijay","ramesh","java","java","vijay"};
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].equals(s[j]))
					System.out.println(s[i]);					
			}			
		}
		//here time complexity is O(n^2), so we can acheive it by set interface with O(n)
		
		Set<String> set= new HashSet<String>();
		for(String name:s)
		{
			if(set.add(name)==false)
			{
				System.out.println("duplicate element :"+ name);
			}
		}
	}
}
