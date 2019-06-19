
public class BinarySearchTree extends Tree {
	
	BinarySearchTree(){}
	BinarySearchTree(int[] input){
		createTree(input);
	}
	
	public void insertBST(int val,TreeNode current){
		if(val<current.getVal()){
			if(current.getLeftChild() != null) insertBST(val , current.getLeftChild());
			else{
				current.setLeftChild(new TreeNode(val));
			}
		}
		else if(val>current.getVal()){
			if(current.getRightChild() != null) insertBST(val , current.getRightChild());
			else{
				current.setRightChild(new TreeNode(val));
			}
		}
		else{
			System.out.println("數字重複!");
			System.exit(1);
		}
	}
	
	public void createTree(int[] input){
		
		for(int i : input){
			
			if(root == null){
				root = new TreeNode(i); 
				continue;
			}
			insertBST(i,root);
		}
	}
	
	public TreeNode searchBST(int val){
		TreeNode current = root;
		while(current != null){
			if(val == current.getVal()) return current;
			else if(val < current.getVal()){
				current = current.getLeftChild();
			}
			else{
				current = current.getRightChild();
			}
		}
		return null;
				
	}
	
	public void removeBST(int val){
		TreeNode current = root;
		TreeNode previous = null;
		while(current != null){
			if(current.getVal() == val){
				if(current.getLeftChild()==null && current.getRightChild()==null){
					if(current == root) {
						root = null; return;
					}
					if(previous.getLeftChild() == current) previous.setLeftChild(null);
					else previous.setRightChild(null);
				}
				else if(current.getLeftChild()!=null && current.getRightChild()!=null){
					TreeNode temp = current.getLeftChild();
					TreeNode concat = leftmost(current.getRightChild());
					concat.setLeftChild(temp.getRightChild());
					temp.setRightChild(current.getRightChild());
					if(current == root){
						root = temp; return;
					}
					if(previous.getLeftChild() == current) previous.setLeftChild(temp);
					else previous.setRightChild(temp);
				}
				else{
					if(current == root){
						if(current.getLeftChild() != null){
							root = root.getLeftChild(); return;
						}
						else{
							root = root.getRightChild(); return;
						}
					}
					if(current.getLeftChild()!=null){
						if(previous.getLeftChild() == current) previous.setLeftChild(current.getLeftChild());
						else previous.setRightChild(current.getLeftChild());
					}
					else{
						if(previous.getLeftChild() == current) previous.setLeftChild(current.getRightChild());
						else previous.setRightChild(current.getRightChild());
					}
				}
				return;
			}
			else if(val < current.getVal()){
				previous = current;
				current = current.getLeftChild();
			}
			else{
				previous = current;
				current=current.getRightChild();
			}
		}
	}
	
	
	
 
}