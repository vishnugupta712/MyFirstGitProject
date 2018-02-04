package study;

public class SelectionSort {

	public static void main(String[] args) {
		int [] arr = new int[]{3,67,-2,-8,1,0};
        int n = arr.length;
        for(int i=0;i<n-1;i++){
        	int minIndex=i;
       	 for(int j=i+1 ; j<n ; j++){
       		 if(arr[j]<arr[minIndex]){
       			minIndex=j;
       		 }
       	 }
       	int temp=arr[minIndex];
		 arr[minIndex]=arr[i];
		 arr[i]=temp;
        }
        for(int i=0;i<n;i++){
       	 System.out.println(arr[i]);
        }

	}

}
