package javaprogram;

public class AscendingOrder {
	public static void main(String[] args) {
		int temp;
		int n[]= {10,100,200,40,20};
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]+" ");
		}
		for (int j = 0; j < n.length; j++) {
			for (int k = j+1; k < n.length; k++) {
				while (n[j]>n[k]) {
					temp=n[j];
					n[j]=n[k];
					n[k]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("Orginal value");
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]+" ");
		}
		
		System.out.println();
		int maximiumnumber =n[n.length-1];
		System.out.println("maximium number is "+maximiumnumber);
		
		int maximiumnumber2 =n[0];
		System.out.println("maximium number is"+maximiumnumber2);
		
		int thridmaxnumber =n[n.length-3];
		System.out.println("Thrid maxnumber is "+thridmaxnumber);
		
		int thridminnumber = n[2];
		System.out.println("Thrid minnumber is "+thridminnumber);
	}

}
