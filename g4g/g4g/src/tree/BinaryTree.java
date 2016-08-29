package tree;

class Node{
	int data;
	Node left;
	Node right;
	
	Node(int data){
		this.data=data;
		left=null;
		right=null;
	}
	
}

class BinarysearchTree{
	Node root;
	BinarysearchTree(){
		this.root=null;
	}
	
	public void insert(int data){
		
		Node newNode= new Node(data);
		
		if(root==null){
			   root= newNode;
		        return;
		}
		
		Node current = root;
		Node parent= null;
		while(true){
			parent= current;
			if(data < current.data){
				current= current.left;
				if(current==null){
					parent.left=newNode;
					return;
				}
				
			}else{
				current= current.right;
				if(current==null){
					parent.right=newNode;
					return;
				}
			}
		}
	}
	
	public void display(Node root){
		if(root!=null){
			
			display(root.left);
			System.out.print(" "+root.data);
			display(root.right);
		}
	}

	
	public boolean find(int data){
		
		Node current =root;
		    while(current!=null){
			 if(current.data== data)
				 return true;
			 else if(current.data > data)
				 current= current.left;
			 else
				 current= current.right;
			 }
		    
		    return false;
		
		
	}
	
	
	public boolean delete(int data){
		Node parent =root;
		Node current=root;
		
		boolean isLeftChild=false;
		while(current.data!=data){
			
			parent=current;
			if(current.data > data){
				isLeftChild= true;
				current= current.left;
			}else{
				isLeftChild = false;
				current= current.right;
				}
			
			if(current== null){
				return false;
				
			}
		}
		
		
		//case 1 No child of the deleted node
		if(current.left==null  && current.right==null) {
			
			if(current == root){
				root= null;
			}
			if(isLeftChild==true){
				parent.left= null;
			}
			if(isLeftChild== false){
				parent.right=null;
			}
			
		}
		
		//case 2 There is one child of the deleted node //left node to be deleted
		else if(current.right==null){
			
			if(current==root)
				root= current.left;
			else if(isLeftChild){
				
				parent.left=current.left;
			}else
			{
				parent.right=current.left;
			}
		}
		
		else if(current.left==null){
			if(current==root){
				root= current.right;
			}
			else if(isLeftChild==false){
				parent.right=current.right;
			}
			else{
				parent.left=current.right;
			}
		}
		
		// node has both child
		
		else if(current.left!=null && current.right!=null){
			Node successor= getSuccesor(current);
			if(current==root){
				root=successor;
			}
			else if(isLeftChild){
				parent.left=successor;
			}else{
				parent.right=successor;
			}
			
			successor.left=current.left;
			
			
		}
		
		
		return true;
		
	}
	
	public Node getSuccesor(Node deleteNode){
		Node successor=null;
		Node successorparent=null;
		Node current= deleteNode.right;
		while(current!=null){
			successorparent=successor;
			successor=current;
			current=current.left;
		}
		
		if(successor!=deleteNode.right){
			successorparent.left=successor.right;
			successor.right=deleteNode.right;
		}
		return successor;
	}
	
	
}



public class BinaryTree {
	public static void main(String args[]){
		
		BinarysearchTree bst = new BinarysearchTree();
		bst.insert(10);
		bst.insert(5);bst.insert(4);bst.insert(3);bst.insert(2);
		bst.insert(11);bst.insert(12);bst.insert(13);bst.insert(14);
		bst.display(bst.root);
		System.out.println("");
		System.out.print("check whether the node exists : "+bst.find(11));
		
		System.out.println("Delete Node with no children (2) : " + bst.delete(2));		
		bst.display(bst.root);
		System.out.println("\n Delete Node with one child (4) : " + bst.delete(4));		
		bst.display(bst.root);
		System.out.println("\n Delete Node with Two children (10) : " + bst.delete(10));		
		bst.display(bst.root);
		
		
	}

}
