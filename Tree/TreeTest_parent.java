/**
 * Class Untitled
 */
public class TreeTest_parent {
	public static void main(String[] args) {
    	TreeNode_parent a = new TreeNode_parent(1);
    	TreeNode_parent b = new TreeNode_parent(2);
    	TreeNode_parent c = new TreeNode_parent(3);
    	TreeNode_parent d = new TreeNode_parent(4);
    	TreeNode_parent e = new TreeNode_parent(5);
    	
     	a.setLeftChild(b); b.setParent(a);
    	a.setRightChild(c); c.setParent(a);
    	b.setRightChild(d); d.setParent(b);
    	d.setLeftChild(e); e.setParent(d);
    	
    	
    	Tree_parent t = new Tree_parent();
    	
 
		
		
    	t.Inorder_by_parent(a);
    	System.out.println();
    	t.Inorder_reverse(a);
	}
}