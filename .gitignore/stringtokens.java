package Practice.Java;

import java.math.BigInteger;
import java.util.StringTokenizer;

public class stringtokens {
	public static void main(String[] args) {
		
	
	String s="vijay is a good boy";
	StringTokenizer s1= new StringTokenizer(s, " ");
	BigInteger b= new BigInteger(s);
	b.isProbablePrime(1);
	
	while(s1.hasMoreTokens())
	{
		System.out.println(s1.nextToken());
	}
	
	}
	
}

