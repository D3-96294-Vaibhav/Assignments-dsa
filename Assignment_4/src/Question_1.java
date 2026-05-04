//1. Write a linear search algorithm to return index of last occurance of key


public class Question_1 {
	
	static int[] arr = {1 , 2 , 3 , 1 , 5 , 6 , 2 , 1 , 7 };
          //indexes //  0   1   2   3   4   5   6   7   8	
	//last occurance of 1  is  7th index;
	
	public static void main(String[] args) {
		int key=1;
		int last_occ=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key)last_occ=i;
		}
		System.out.println("last occurance of "+ key + " is: " +last_occ);

	}

}
