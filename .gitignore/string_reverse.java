package Practice.Java;

import java.util.Scanner;

public class string_reverse {
	
public static void main(String[] args) {
	int i;
	String s,rev="";
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the text to reverse: ");
	s=sc.next();
	sc.close();
	for(i=s.length()-1;i>=0;i--)
	{
		rev=rev+s.charAt(i);
	}
	System.out.println("reverse of the " +s+" is "+rev);	
}

}
