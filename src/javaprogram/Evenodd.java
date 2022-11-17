package javaprogram;

public class Evenodd {
	public static void main(String[] args) {
		int c=0,count=0;
		for (int i = 0; i <=30; i++) {
			if (i%2==0) {
				System.out.println(i);
				c++;
				count=count+i ;
			}
		}
		System.out.println("Total Number of evenNumber");
		System.out.println(c);
		System.out.println("count of even number"+count);
	}

}
