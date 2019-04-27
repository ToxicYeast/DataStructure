public class LinkedList {
	
	private Node first;
	
	public int sizeOf(){					//calculate LinkedList size
		int size = 0;						//set initial size value as 0
		Node current = first;				
		while(current != null){ 
			current = current.getNext();	//go to next node and size++
			size++;
		}
		return size;
	}
	
	public void printList(){		//print all element in LinkedList//
		
		if(first == null){		//if LinkedList is empty show message
			System.out.println("LinkedList is empty");
			return;
		}
		
		Node current = first;
		
		while(current != null){		//if LinkedList is not empty
			System.out.print(current.getVal()+" ");		//print value
			current = current.getNext();	//go to next Node
		}
		System.out.println();
	}
	
	public void insertFront(int input){			//insert Node from the front end//
		Node newNode = new Node(input);			//create new Node
		newNode.setNext(first);					//newNode.next link to the origin list
		first = newNode;						//set newNode as new first
	}
	
	
	public void insertBack(int input){
		
		Node newNode = new Node(input);			//create new Node
		
		if(first == null){
			first=newNode;						//if List is empty, direct set as first
			return;
		} 		
		
		Node current = first;
		
		while(current.getNext() != null){		//goto list end
			current = current.getNext();
		}
		current.setNext(newNode);				//insert newNode into list bottom
	}
	
	public void insertMid(int input , int index){		//insert Node after n-th node
		
		Node newNode = new Node(input);
		
		if(index>sizeOf() || index<0){					//avoid illegal index value
			System.out.println("Out of index renge");
			return;
		}
		
		Node current = first;
		
		for(int i=0 ; i<index ;i++){			//travel to destination
			current = current.getNext();
		}
		
		newNode.setNext(current.getNext());		// behind list linked to newNode
		current.setNext(newNode);				// current Node.next set to newNode
	}
	
	public void remove(int index){
		
		if(index>sizeOf() || index<0){					//avoid illegal index value
			System.out.println("Out of index renge");
			return;
		}
		
		Node current = first;
		
		if(index == 0 ){
			first = current.getNext();
			return;
		}
		
		Node preNode = null;
		
		for(int i=0 ; i<index ;i++){			//travel to destination
			preNode = current;
			current = current.getNext();
		}
		
		preNode.setNext(current.getNext());		//skip current node (delete)
		
	}
	
	
	public void reverse(){
		
		Node preNode = null;					//use preNode , current , nexNode to reverse linkedlist
		Node nexNode = first.getNext();
		Node current = first;
		
		while(nexNode != null){					//nexNode goes to null , current go to last Node(current at last Node need to update current.next manually )
			
			current.setNext(preNode);			//reverse link direction
			
			preNode = current;					//3 Node step forward
			current = nexNode;
			nexNode = nexNode.getNext();
		}
		
		current.setNext(preNode);				//update current.next manually
		first = current;						//reset first 
		
	}
	
	public int search(int targetVaule){
		
		Node current = first;
		int index = 0;
		
		while(current != null){
			
			if(current.getVal() == targetVaule){
				return index;
			}
			index++;
			current = current.getNext();
		}
		return -1;
	}
	
	
}