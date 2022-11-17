package javaprogram;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class repitativeword {
	public static void main(String[] args) {
		String S = "welcome god god god here here where";
		String[] allwords = S.split(" ");
		Map<String, Integer> C = new LinkedHashMap<String,Integer>();
		
		for (String words: allwords) {
			if (C.containsKey(words)) {
				Integer value = C.get(words);
				C.put(words, value+1);
			}
			else {
				C.put(words, 1);
			}
		}
		Set<Entry<String,Integer>> entry=C.entrySet();
		for (Entry<String, Integer> entry2 : entry) {
			if (entry2.getValue()>1) {
				String Key = entry2.getKey();
				Integer value = entry2.getValue();
				System.out.println(Key +"=" + value);
				
			}
			
		}
	}

}
