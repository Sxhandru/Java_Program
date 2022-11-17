package javaprogram;

import java.util.LinkedHashMap;
import java.util.Map;

public class countofeachcharacter {
	public static void main(String[] args) {
		String S ="welcome to java class java course to java";
		String[] allwords = S.split(" ");
		Map<String, Integer> C = new LinkedHashMap<String, Integer>();
		
		for (String words : allwords) {
			if (C.containsKey(words)) {
				Integer value = C.get(words);
				C.put(words, value+1);
			}
			else {
				C.put(words, 1);
			}
		}
		System.out.println(C);
	}

}
