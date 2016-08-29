package Linkedlist;

public class reverse {

	void iterative(Node head){
		
		Node currnode=head;
		Node prevnode=null;
		Node nextnode=null;
		
		while(currnode!=null){
			
	   		nextnode=currnode.next;
			currnode.next=prevnode;
			
			prevnode= currnode;
			currnode= nextnode;
			
			
		}
		
		head= prevnode;
		
		new LinkedlistT().show(head);
		
	}
}

