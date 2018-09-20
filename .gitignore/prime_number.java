package Practice.Java;

import java.util.Scanner;

public class prime_number {
	public static void main(String[] args) {
		int n, i,flag=0;
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter a number to check for prime: ");
		n=sc.nextInt();
		sc.close();
		if(n/2==0)
		{
		System.out.println(n+" is not a prime number");	
		}
		else
		{
			for(i=2;i<=n/2;i++)
			
			{
				if(n%i==0)
				{
					flag=1;
					break;
				}						
			}
		if(flag==0)
		{
			System.out.println(n+" is a prime number");			
		}
		else
		{
			System.out.println(n+" is not a prime number");
		}
	}
	
	
	}
}
