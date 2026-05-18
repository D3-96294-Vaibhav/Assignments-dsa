package question_2;


public class Q2 {
	
	public static int nthOccurrence(int arr[], int n, int key) {
		int occur = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == key) {
				occur++;
			}
			
			if(occur == n) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,4,5,1,2,1,5,4,8,5,1,2};
		
		int occurence = nthOccurrence(arr, 4, 1);
		int occurence1 = nthOccurrence(arr, 1, 0);
		
		System.out.println("The Occurence: " + occurence);
		System.out.println("The Occurence: " + occurence1);

	}

}
