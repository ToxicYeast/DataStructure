public class LinkedListTest {
	public static void main(String[] args) {
    	
    	// int sizeOf() : return LinkedList current size
    	// int search() : return index number of typical vaule in LinkedList ; -1 : not found
    	// void printList() : print node vaule in current LinkedList
    	// void insertFront(int input) : insert a value into LinkList head
    	// void insertBack(int input) : insert a value into LinkedList bottom
    	// void insertMid(int input , int index) : insert a value into LinkedList (after n-th Node)
    	// void remove(int index) : remove n-th Node
    	// void reverse() : reverse the LinkedList sequence
    	
    	
    	
    	LinkedList list = new LinkedList();
    	
    	list.printList();						// "empty"
    	list.insertFront(1);					// 1
    	list.insertBack(2);						// 1 2 
    	list.insertMid(3,0);					// 1 3 2
    	list.printList();						// "1 3 2"
    	System.out.println(list.sizeOf());		// "3"
    	list.remove(2);							// 1 3
    	list.printList();						// "1 3"
    	list.reverse();							// 3 1
    	list.printList();						// "3 1"
    	System.out.println(list.search(5));		// "1"
    	
	}
}