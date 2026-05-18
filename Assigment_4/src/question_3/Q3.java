package question_3;

public class Q3 {
	public static int binarySearch(int arr[], int key) {
		
		int low = 0, high = arr.length-1;
		while(low <= high) {
			int mid = (low + high)/2;
			if(arr[mid] == key) {
//				System.out.println("Key is found at: " + mid);
				return mid;
			} else if(key < arr[mid]) {
				low = mid+1;
			} else {
				high = mid-1;
			}
		}
		return -1;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,4,3,2,1};
		
		System.out.println("Key is found: " + binarySearch(arr, 4));
		

	}

}
