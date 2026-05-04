//Implement linear search algorithm to find the nth occurence of the given element. If nth occurrence is
//not found, return -1.
		
public class Question_2 {
	static int[] arr = {1 , 2 , 3 , 1 , 5 , 6 , 2 , 1 , 7 };
	      //indexes //  0   1   2   3   4   5   6   7   8
	
	public static void main(String[] args) {
		int key=1;
		int idx=-1;
        int n=2;
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]==key) {
        		n--;
        		idx=i;
        		if(n==0) {
        			break;
        		}
        	}
        }
        if(n==0)System.out.println("nth occ idx of ele 1 is : "+ idx);
        else System.out.println("not found");

	}

}
