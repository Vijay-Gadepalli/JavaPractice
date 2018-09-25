package Practice.Java;

import java.util.Scanner;

public class reverse_string_using_strng_buffer {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string to reverse");
		System.out.println(new StringBuffer(sc.next()).reverse());
		sc.close();
		
	}

}
