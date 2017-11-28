package study;

public class LinkedListInicio {
     Node head;
    static class Node{
    	int data;
    	Node next;
    	Node(int d){
    		data=d;
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListInicio linkedListInicio = new LinkedListInicio();
		linkedListInicio.head= new Node(10);
		
	}

}
