
public class TreeNode_parent {
	
	private TreeNode_parent leftchild;
	private TreeNode_parent rightchild;
	private TreeNode_parent parent;
	private int val;
	
	public TreeNode_parent(){};
	public TreeNode_parent(int val){
		this.val=val;
	}
	
	public TreeNode_parent getLeftChild(){
		return leftchild;
	}
	
	public TreeNode_parent getRightChild(){
		return rightchild;
	}
	
	public TreeNode_parent getParent(){
		return parent;
	}
	
	public int getVal(){
		return val;
	}
	
	public void setLeftChild(TreeNode_parent leftchild){
		this.leftchild=leftchild;
	}
	
	public void setRightChild(TreeNode_parent rightchild){
		this.rightchild=rightchild;
	}
	
	public void setParent(TreeNode_parent parent){
		this.parent = parent;
	}
	
	public void setVal(int val){
		this.val=val;
	}
	
	
}