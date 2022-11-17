package javaprogram;

public class Trim {
	public static void main(String[] args) {
		String S ="welcome to java";
		String trim = S.trim().replaceAll(" ", "");
		System.out.println(trim);
		
		
	    S=S.replaceAll("[AaEeIiOoUu]", "*");
		System.out.println("Replace vowel with star   "+S);
	}

}
