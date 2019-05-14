
public class QueueTest {
	public static void main(String[] args) {
    	
    	Queue s = new Queue();
    	
    	s.push(100);
    	s.push(200);
    	s.printQueue();
    	System.out.println(s.peek());
    	System.out.println(s.pop());
    	s.push(300);
    	s.printQueue();
    	System.out.println(s.sizeOf());
	}
}