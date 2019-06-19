/**
 * Class Untitled
 */
public class TreeTest {
	public static void main(String[] args) {
    	int[] input = {1,2,3,4};
    	
     	
    	
    	
    	BinarySearchTree tt = new BinarySearchTree();
    	tt.createTree(input);
    	
 
		tt.inOrder(tt.root);
		System.out.println();
		tt.levelOrder(tt.root);
		tt.removeBST(4);
		tt.insertBST(0,tt.root);
		System.out.println();
		tt.inOrder(tt.root);
		//System.out.println("2");

		//System.out.println(tt.searchBST(190));
		
	}
}