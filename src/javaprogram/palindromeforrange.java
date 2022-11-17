package javaprogram;

public class palindromeforrange {
	public static void main(String[] args) {
		int c=0;
		for (int n = 1; n <=30; n++) {
			int a=n,i=0,j=0;
			while (a>0) {
				i=a%10;
				j=(j*10)+i;
				a=a/10;
			}
			if (n==j) {
			System.out.println(j);
			c++;
			
			
			
			}
		
		
	}
		System.out.println("Total Number of Prime Number");
		System.out.println(c);
		}

}
