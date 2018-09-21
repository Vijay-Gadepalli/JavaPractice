package Practice.Java;

import java.util.Scanner;

public class number_palindrome {

	public static void main(String[] args) {
		
		int n;		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter as number to check palindrome: ");
		n=sc.nextInt();
		sc.close();
		if(isPalindrome(n)==true)
			System.out.println(n+" is a palindrome");
		else
		System.out.println(n+" is not a palindrome");
	}	
	
		public static boolean isPalindrome(int num)
		{
			int k,s=0,temp;
			temp=num;
			while(num!=0) {				
			k=num%10;
			s=s*10+k;
			num=num/10;
			}
			if(s==temp)
			return true;
			else
			return	false;			
		}
	}