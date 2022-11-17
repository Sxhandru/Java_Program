package javaprogram;

public class Maxvalue {
	public static void main(String[] args) {
		int n [] = {40,300,20,200,100,30};
		int max=n[0];
		for (int i = 0; i < n.length; i++) {
			if (n[i]>max) {
				max=n[i];
			}
		}
		System.out.println(max);
	}

}
