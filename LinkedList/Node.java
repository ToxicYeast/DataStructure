public class Node {
	
	private int val;	//Node value
	private Node next;	//Node Linked List
	
	public Node(){}		//Basic constructor
	
	public Node(int val ){		//Constructor overloaded
		this.val = val;
	}
	
	public int getVal(){	//getVal method
		return val;
	}		
	
	public void setVal(int val){		//setVal method
		this.val=val;
	}
	
	public Node getNext(){		//getNext method
		return next;
	}
	
	public void setNext(Node next){		//setNext method
		this.next = next;
	}
	
}
