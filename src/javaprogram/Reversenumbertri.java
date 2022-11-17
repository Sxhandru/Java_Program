package javaprogram;

public class Reversenumbertri {
	public static void main(String[] args) {
		int num;
		for (int i = 1; i <=5; i++) {
			num=1;
			for (int j = 6; j >=i; j--) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	
	}
		
}
