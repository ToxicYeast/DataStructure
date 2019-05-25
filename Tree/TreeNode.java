
public class TreeNode {
	
	private TreeNode leftchild;
	private TreeNode rightchild;
	private int val;
	
	public TreeNode(){};
	public TreeNode(int val){
		this.val=val;
	}
	
	public TreeNode getLeftChild(){
		return leftchild;
	}
	
	public TreeNode getRightChild(){
		return rightchild;
	}
	
	public int getVal(){
		return val;
	}
	
	public void setLeftChild(TreeNode leftchild){
		this.leftchild=leftchild;
	}
	
	public void setRightChild(TreeNode rightchild){
		this.rightchild=rightchild;
	}
	
	public void setVal(int val){
		this.val=val;
	}
	
	
}
