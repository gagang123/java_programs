package Linkedlist;

class Node{
	int data;
	Node next;
	
	public Node(int data){
		this.data=data;
		this.next=null;
	}
	
}
class LinkedlistT{
	private int size=0;
	Node head;
	
	public LinkedlistT(){
		head=null;
	}
	
	 int getsize(){
	   return size;
	}
	
	void addatbeg(int data){
		Node node = new Node(data);
		
		node.next=head;
		head=node;
		size++;
	}
	void delatbeg(){
		if(head==null)
			System.out.println("empty linked list add some items to it");
		else{
		Node next= head.next;
		head=next;
		}
		size--;
	}
	
	void delatend(){
		if(head.next==null){
			head=null;		
		   System.out.println("No element in the list for displaying");
		}
		else{
			
			Node curr=head;
			while(curr.next.next!=null){
				curr=curr.next;
			}
			
			curr.next=null;
			
		}
		size--;
		
		
	}
	void addatend(int data){
		Node node=new Node(data);
		if(head==null){
			addatbeg(data);
		}
		else{
		
		Node curr=head;
		while(curr.next!=null){
			curr=curr.next;
		}
		
		curr.next=node;
		size++;
		
	}
}
	
	void search(int loc){
		
		
		
	}
	
	void show(Node head){
		
		Node curr= head;
		
		while(curr!=null){
			System.out.print("->"+curr.data);
		    curr=curr.next;
		}
		System.out.println();
	}
	
}

public class Linked_list {

	public static void main(String[] args) {
		LinkedlistT t = new LinkedlistT();
		t.addatbeg(20);
		t.addatbeg(10);
		
	    t.addatend(30);
	    t.addatend(40);
	    t.addatend(50);
		
	  //  t.delatbeg();
	  //  System.out.println(t.getsize());
		t.show(t.head);
		System.out.println(t.head); 
		new reverse().iterative(t.head); 
    
		LinkedlistT t1 = new LinkedlistT();
		t1.addatbeg(150);
		t1.addatbeg(140);
		t1.addatbeg(130);
		t1.addatbeg(120);
		t1.addatbeg(110);
		t1.show(t1.head);
		
	}
	
}
