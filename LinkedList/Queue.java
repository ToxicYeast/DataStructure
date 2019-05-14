
public class Queue {
	
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
	
	
	public void printQueue(){		//print all element in LinkedList//
		
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
	
	public void push(int val){      //add element into tail
        
        Node newNode = new Node(val);
        
        if(first == null){		//if first is null add at first
        	first = newNode;
        	return;
        }
        
        Node current = first;
        
        while(current.getNext() != null){		//traversal to last Node
        	current = current.getNext();
        }
        
        current.setNext(newNode);  //add new Node 
        
    }
    
    public int pop(){               //return first Node value and remove first Node
        
        Node temp = first; 
        
        first = first.getNext();
        
        return temp.getVal();
    }
    
    public int peek(){              //return first Node value but not remove
        return first.getVal();
    }
	
}