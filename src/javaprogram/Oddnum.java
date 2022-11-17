package javaprogram;

public class Oddnum {
	public static void main(String[] args) {
		int c=0,count=0;
		for (int i = 0; i <=30; i++) {
			if (i%2==1) {
				System.out.println(i);
				 c++;
				 count=count+i;
			}
			
		}
		System.out.println("sum of odd number from"+c);
		System.out.println("count of odd number from"+count);
		
	}

}
