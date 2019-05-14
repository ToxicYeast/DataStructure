
public class QueueTest {
	public static void main(String[] args) {
    	
    	Queue s = new Queue();
    	
    	s.add(100);
    	s.add(200);
    	s.printQueue();
    	System.out.println(s.peek());
    	System.out.println(s.pull());
    	s.add(300);
    	s.printQueue();
    	System.out.println(s.sizeOf());
	}
}