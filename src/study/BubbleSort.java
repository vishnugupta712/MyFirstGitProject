package study;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int [] arr = new int[]{3,67,-2,-8,1,0};
         int n = arr.length;
         for(int i=0;i<n-1;i++){
        	 for(int j=0 ; j<n-1-i ; j++){
        		 if(arr[j]>arr[j+1]){
        			 int temp=arr[j];
        			 arr[j]=arr[j+1];
        			 arr[j+1]=temp;
        		 }
        	 }
         }
         for(int i=0;i<n;i++){
        	 System.out.println(arr[i]);
         }
	}

}
