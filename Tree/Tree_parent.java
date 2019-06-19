
public class Tree_parent {
	
	public TreeNode_parent root;
	
	
	public TreeNode_parent leftmost(TreeNode_parent root){
		while(root.getLeftChild() != null){
			root = root.getLeftChild();
		}
		return root;
	}
	
	public TreeNode_parent rightmost(TreeNode_parent root){
		while(root.getRightChild() != null){
			root = root.getRightChild();
		}
		return root;
	}
	
	public TreeNode_parent InorderSuccessor(TreeNode_parent current){
		if(current.getRightChild() != null){
			return leftmost(current.getRightChild());
		}
		TreeNode_parent temp = current.getParent();
		while(temp != null && temp.getRightChild() == current){
			current = temp;
			temp = temp.getParent();
		}
		return temp;
	}
	
	public TreeNode_parent InorderPredecessor(TreeNode_parent current){
		if(current.getLeftChild() != null) return rightmost(current.getLeftChild());
		
		TreeNode_parent temp = current.getParent();
		while(temp != null && temp.getLeftChild() == current){
			current = temp;
			temp = temp.getParent();
		}
		return temp;
	}
	
	public void Inorder_by_parent(TreeNode_parent root){
		
		TreeNode_parent current = leftmost(root);
		
		while(current != null){
			System.out.print((current.getVal()+" "));
			current = InorderSuccessor(current);
		}
	}
	
	public void Inorder_reverse(TreeNode_parent root){
		TreeNode_parent current = rightmost(root);
		
		while(current != null){
			System.out.print(current.getVal()+" ");
			current = InorderPredecessor(current);
		}
	}
}