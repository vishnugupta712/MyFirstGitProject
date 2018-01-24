package study;

public class DisjoiintSet {
	//Array elements represents the individual person
    int friendsArr[];
    int indivFriend;
    public DisjoiintSet(int num){
    	indivFriend=num;
    	friendsArr=new int[num];
    	intializeArr();
    }
    public void intializeArr(){
    	for(int i =0 ; i <friendsArr.length;i++ ){
    		friendsArr[i]=i;
    	}
    }
    public int findFriendFindId(int i){
    	if(friendsArr[i]!=i){
    		friendsArr[i]=findFriendFindId(friendsArr[i]);
    	}
    	return friendsArr[i];
    }
    public void makeFriends(int i,int j){
    	int firstfriendId =findFriendFindId(i);
    	int secondfriendId=findFriendFindId(j);
    	if(firstfriendId!=secondfriendId){
    		int firstcounter = 0;
    		int secondcounter=0;
    		for(int a=0 ; a<friendsArr.length ; a++){
    			if(i==friendsArr[a]){
    				firstcounter++;
    				if(firstcounter>1){
    					friendsArr[j]=i;
    					break;
    				}
    			}
    			else if(j==friendsArr[a]){
    				secondcounter++;
    				if(secondcounter>1){
    					friendsArr[i]=j;
    					break;
    				}
    			}
    		}
    		if(firstcounter<=1 && secondcounter<=1){
    			friendsArr[i]=j;
    		}
    	}
    }
	public static void main(String[] args) {
		DisjoiintSet disjoiintSet = new DisjoiintSet(10);
		disjoiintSet.makeFriends(3, 5);
		disjoiintSet.makeFriends(3, 9);
		disjoiintSet.makeFriends(2, 4);
		disjoiintSet.makeFriends(8, 4);
		disjoiintSet.makeFriends(7, 1);
		if(disjoiintSet.findFriendFindId(8)==disjoiintSet.findFriendFindId(2)){
			System.out.println("both are friends");
		}
		else{
			System.out.println("both are unknown to each other");
		}
	}

}
