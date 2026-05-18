package question_1;

import java.util.Arrays;

public class Q1 {
	
	public static void insertionSort(int arr[]) {
		
		for(int i = 1 ; i < arr.length ; i++) {
			int temp = arr[i];
			int j;
			for(j = i - 1 ; j >= 0 ; j--) {
				if(arr[j] < temp) {
					arr[j+1] = arr[j];					
				}else {
					break;	
				}
			}
			arr[j+1] = temp;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {4,7,8,2,1,3,4,5,9,7,20,4,1};
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
		

	}

}
