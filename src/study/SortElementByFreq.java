package study;

import java.util.HashMap;
import java.util.Map;

public class SortElementByFreq {
    public static void sortByFreq(int []arr){
    	int n =arr.length;
        int j;
        for(int i=1;i<n;i++){
        	int key =arr[i];
        	j=i-1;
        	while(j>=0 && arr[j]>key){
        		arr[j+1]=arr[j];
        		j=j-1;
        	}
        	arr[j+1]=key;
        }
    	Map<Integer,Integer>m=new HashMap<Integer,Integer>();
    	int tempArr[][] = new int[arr.length][2];
    	int count =1;
    	for( j=1 ; j<n ; j++){
    		if(j==(n-1)){
    			tempArr[j][0]=j;
    		}
    		if(arr[j]==arr[j-1]){
    			count++;
    			m.put(j, count);
    		}else{
    			tempArr[j-1][0]=j-1;
    			tempArr[j-1][1]=count;
    			m.put(j, count);
    			count=1;
    		}
    	}
    	tempArr[n-1][1]=count;
    	
    	if(tempArr[((tempArr.length)-1)][1]!=0){
    		for(int a=0; a<tempArr.length ; a++){
        		if(tempArr[a][1]==0){
        			tempArr[a]=tempArr[a+1];
        		}
        	}
    	}
    	else{
    		for(int a=0; a<((tempArr.length)-1) ; a++){
        		if(tempArr[a][1]==0){
        			tempArr[a][1]=tempArr[a+1][1];
        		}
        	}
    	}
    	for(int i=1;  i<tempArr.length ; i++){
    		if(tempArr[i]!=null){
    			int k= i-1;
        		int key = tempArr[i][1];
        		while(k>=0 && key<tempArr[k][1]){
        			tempArr[k+1][1]=tempArr[k][1];
        			k=k-1;
        		}
        		tempArr[k+1][1]=tempArr[i][1];
    		}
    		else{
    			break;
    		}
    	}
    	for(int i =0 ; i < tempArr.length ;i++){
    		int counter = tempArr[i][1];
    		while(counter>0){
    			System.out.println(arr[i]);
    			counter--;
    		}
    	}
    }
	public static void main(String[] args) {
        int []dataArray = {2, 5, 2, 8, 5, 6, 8, 8};
        sortByFreq(dataArray);
	}

}
