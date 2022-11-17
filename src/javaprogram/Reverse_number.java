package javaprogram;

public class Reverse_number {
	public static void main(String[] args) {
		int n = 12345;
		int a=n,i=0,j=0;
		while (a>0) {
			i=a%10;
			j=(j*10)+i;
			a=a/10;
		}
		System.out.println(j);
			
	}

}
