//Implement binary search algorithm if array is sorted in descending order
public class Question_3 {
static int[] arr= { 13 , 11 , 9 , 5 , 4 , 3 , 1 };
//idx              /0    1    2   3   4   5   6
public static int binarysearch(int [] arr,int low,int high,int key) {
	int ans=-1;
	while(low<=high) {
		int mid=(low+high)/2;
 if(key==arr[mid]) {ans=mid;
 break;}
 
		
 else if(key>arr[mid])high=mid-1;
 
 else low=mid+1;
		
	}
	return ans;
}

	public static void main(String[] args) {
		int key=9;
		int result=Question_3.binarysearch(arr,0,arr.length-1,key);
		
		
		System.out.println("idx of " + key +" :  "+ result);
		

	}

}
