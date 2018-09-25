package Practice.Java;

public class replaceall_using_regular_expression {
	public static void main(String[] args) {
		String s="%^&**&^*hbjdjsnsnd";
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
	}

}
