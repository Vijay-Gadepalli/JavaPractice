package Practice.Java;

import java.util.Scanner;

public class Largest_and_Smallest_in_Array {

	public static void main(String[] args) {
		int a[],n,i,Large,Small;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no of elements ion array: ");
		n=sc.nextInt();
		a=new int[n];
		System.out.println("Enter the Elemets: ");
		for(i=0;i<n;i++)
		a[i]=sc.nextInt();
		sc.close();
		Large=a[0];
		Small= a[0];
		for(i=0;i<n;i++)
		{
			if(a[i]>Large)
				Large=a[i];
			
			else if(a[i]<Small)
				Small=a[i];
		}
		System.out.println("Largest Number : "+Large);
		System.out.println("Smallest Number : "+Small);		
	}
}
