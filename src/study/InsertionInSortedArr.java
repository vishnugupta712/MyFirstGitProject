package study;

public class InsertionInSortedArr {
    static int insertionInarr(int[]arr , int cap, int key,int n){
    	if(n>=cap){
    		return n;
    	}
    	int i;
    	for( i=n-1 ; (i>=0 && arr[i]>key);i--){
    		arr[i+1]=arr[i];
    	}
    	arr[i+1]=key;
    	return n+1;
    }
	public static void main(String[] args) {
		int arr[] = new int[20];
        arr[0] = 12;
        arr[1] = 16;
        arr[2] = 20;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 70;
        int capacity = arr.length;
        int n = 6;
        int key = 26;
        insertionInarr(arr,capacity,key,n);
        for(int i=0;i<n;i++){
        	System.out.println(arr[i]);
        }
	}

}
