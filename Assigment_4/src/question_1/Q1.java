package question_1;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,1,5,6};
		int lastOccur = -1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 1) {
				lastOccur = i;
			}
		}
		
		System.out.println("Last Occurence: " + lastOccur);

	}

}
