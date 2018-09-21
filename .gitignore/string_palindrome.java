package Practice.Java;

import java.util.Scanner;

public class string_palindrome {
	
	public static void main(String[] args) {
		
		int i;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string to check for Palindrome: ");
		String a= sc.next();
		sc.close();
		for(i=0;i<a.length()/2;i++)
		{
			if(a.charAt(i)!=a.charAt(a.length()-1-i))
					{
					System.out.println(a+" is not a palindrome");
					break;
					}
		}
		if(i==a.length()/2)
		System.out.println(a+" is a palindrome");			
		}
		}
