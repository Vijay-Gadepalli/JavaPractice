package Practice.Java;

import java.util.Scanner;

public class number_reverse {
	public static void main(String[] args) {
		
		int n,r,k=0,temp;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number to reverse it: ");
		n=sc.nextInt();
		sc.close();
		temp=n;
		while(n>0)
		{
			r=n%10;
			k=k*10+r;
			n=n/10;			
		}
		System.out.println("reverse of the "+temp+ " is "+k );	
	}
}
