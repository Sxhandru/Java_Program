package javaprogram;

public class countandprintofAmstrongfrom0to1000 {
	public static void main(String[] args) {
		int c=0;
		for (int n = 1; n <=1000; n++) {
			int a=n,i=0,j=0;
			while (a>0) {
				i=a%10;
				j=(i*i*i)+j;
				a=a/10;
			}
			if (n==j) {
				System.out.println("Amstrong number =");
				System.out.println(j);
				c++;
			}
		}
		System.out.println("Total Number of Amstrong = "+c);
	}

}
