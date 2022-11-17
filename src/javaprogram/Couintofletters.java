package javaprogram;

public class Couintofletters {
	public static void main(String[] args) {
		int Uppercase=0,lowercase=0, Numerical=0,Special=0;
		String S ="wElcome To @java123";
		for (int i = 0; i < S.length(); i++) {
		char ch = S.charAt(i);
		if (S.charAt(i) >='A'  && S.charAt(i)<='Z') {
			Uppercase++;
		}
		else if (S.charAt(i) >='a' && S.charAt(i)<='z') {
			lowercase++;
		}
		else if (S.charAt(i)>='0' && S.charAt(i)<='9') {
			Numerical++;
		}
		else {
			Special++;
		}
	}
		System.out.println(" Total number of Uppercase =  "+ Uppercase );
		System.out.println("Total Number of Lowercase = "+ lowercase);
		System.out.println("Total Number of Numerical ="+Numerical);
		System.out.println("Total Number of Special= "+Special);
	}
}
