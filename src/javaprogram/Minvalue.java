package javaprogram;

public class Minvalue {
	public static void main(String[] args) {
		int n[]= {40,300,20,200,100,30};
		int min = n[0];
        for (int i = 0; i < n.length; i++) {
        	if (n[i]<min) {
        		min=n[i];
			}
			
		}	
        System.out.println(min);
		}
	}


