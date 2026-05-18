package question_4;

import java.util.HashMap;
import java.util.Map;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "Count occurrences of each word in a line/file";
		
		HashMap<Character, Integer> mpp = new HashMap<>();
		for(int i=0; i<word.length(); i++) {
			mpp.put(word.charAt(i), mpp.getOrDefault(word.charAt(i), 0)+1);
		}
		
		for(Map.Entry<Character, Integer> c : mpp.entrySet()) {
			System.out.println(c.getKey() + " -> " + c.getValue());
		}
	}

}
