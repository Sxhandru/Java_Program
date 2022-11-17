package javaprogram;

public class Descending_Order {
	public static void main(String[] args) {
		int temp;
		int n[]= {10,100,200,40,20};
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]+" ");
		}
		for (int j = 0; j < n.length; j++) {
			for (int k = j+1; k < n.length; k++) {
				while (n[j]<n[k]) {
					temp=n[j];
					n[j]=n[k];
					n[k]=temp;
				}
			}
		}
		System.out.println("Orinigal Descending Order");
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]+" ");
		}
		
	}

}
