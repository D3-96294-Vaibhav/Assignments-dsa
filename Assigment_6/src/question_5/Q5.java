package question_5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,3,3,2,1,3};
		
		Map<Integer, Integer> mpp = new HashMap<>();
		for(int i=0; i<arr.length; i++) {
			mpp.put(arr[i], mpp.getOrDefault(arr[i], 0)+1);
		}

		int maxi = Integer.MIN_VALUE;
		
		for(Map.Entry<Integer, Integer> ac: mpp.entrySet()) {
			maxi = Math.max(maxi, ac.getValue());
		}
		
		for(Map.Entry<Integer, Integer> ac: mpp.entrySet()) {
			if(ac.getValue().equals(maxi)) {
				System.out.println("Mode of the Array: " + ac.getKey());
			}
		}
		
	}

}
