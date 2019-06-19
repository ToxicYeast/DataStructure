import java.util.*;	//queue , stack
public class Tree {
	
	public TreeNode root;
	
	Tree(){}
	Tree(int[] input){
		createTree(input);
	}
	
	
	public void preOrder(TreeNode root){		//VLR
		System.out.print(root.getVal()+" ");
		
		if(root.getLeftChild() != null) preOrder(root.getLeftChild());
		
		if(root.getRightChild() != null) preOrder(root.getRightChild());
	}
	
	public void preOrder_Stack(TreeNode root){
		if(root == null) return;
		
		Stack<TreeNode> TreeNodeStack = new Stack<>();
		TreeNode temp = null;
		TreeNodeStack.push(root);
		while(!TreeNodeStack.isEmpty()){
			temp = TreeNodeStack.pop();
			if(temp.getRightChild() != null) TreeNodeStack.push(temp.getRightChild());
			if(temp.getLeftChild() != null) TreeNodeStack.push(temp.getLeftChild());
			System.out.print(temp.getVal()+" ");
		}
	}
	
	public void inOrder(TreeNode root){			//LVR
		if(root == null) return;
		if(root.getLeftChild() != null) inOrder(root.getLeftChild());
		
		System.out.print(root.getVal()+" ");
		
		if(root.getRightChild() != null) inOrder(root.getRightChild());
	}
	
	public void inOrder_Stack(TreeNode root){
		if(root == null) return;												//avoid special case
		
		Stack<TreeNode> TreeNodeStack = new Stack<>();							//Step1: create new Stack
		TreeNode currentNode = root;											//Step2: initial currentNode as root 
		while(!TreeNodeStack.isEmpty() || currentNode != null){					
			while(currentNode != null){											//Step3: if currentNode is not null, then push into stack. Then set currentNode = currentNode.leftchild
				TreeNodeStack.push(currentNode);
				currentNode = currentNode.getLeftChild();
			}
			currentNode = TreeNodeStack.pop();									//Step4: if currentNode is null & stack is not empty. Stack pop to currentNode
			System.out.print(currentNode.getVal()+" ");							//print
			currentNode = currentNode.getRightChild();							//set currentNode = currentNode.rightchild. return to step3
		}
	}
	
	public void postOrder(TreeNode root){		//LRV
		if(root.getLeftChild() != null) postOrder(root.getLeftChild());
		
		if(root.getRightChild() != null) postOrder(root.getRightChild());
		
		System.out.print(root.getVal()+" ");
	}
	
	public void postOrder_Stack(TreeNode root){
		if(root == null) return;												//avoid special case
		
		Stack<TreeNode> TreeNodeStack = new Stack<>();							//create new stack
		TreeNode currentNode = root;											//set currentNode as root
		TreeNode temp = null;
		while(!TreeNodeStack.isEmpty() || currentNode != null){					//Step4 : repeat step2 & step3
			while(currentNode != null){																			//Step2: if currentNode != null do following
				if(currentNode.getRightChild() != null) TreeNodeStack.push(currentNode.getRightChild());		// a) if currentNode.rightchild != null push into stack	
				TreeNodeStack.push(currentNode);																// b) push currentNode into stack
				currentNode = currentNode.getLeftChild();														// c) set currentNode = currentNode.leftchild
			}
			temp = TreeNodeStack.pop();																			//Step3: Now currentNode == null. 1st pop from stack to temp
			if(!TreeNodeStack.isEmpty() && temp.getRightChild() == TreeNodeStack.peek()){						//if (stack not empty) and (current stack top != temp.rightchild)
				TreeNodeStack.pop();																				//throw current stack top
				TreeNodeStack.push(temp);																			//re-push temp into stack
				currentNode = temp.getRightChild();																	//set currentNode from null to temp.leftchild
			}
			else{																								//else
				System.out.print(temp.getVal()+" ");																//print
			}
		}
	}
	
	public void levelOrder(TreeNode root){		//leverOrder
		LinkedList<TreeNode> TreeNodeList = new LinkedList<>();
		TreeNodeList.add(root);
		TreeNode temp = null;
		while(TreeNodeList.size()>0){
			temp = TreeNodeList.pop();
			if(temp.getLeftChild() != null) TreeNodeList.add(temp.getLeftChild());
			if(temp.getRightChild() != null) TreeNodeList.add(temp.getRightChild());
			System.out.print(temp.getVal()+" ");
		}
	}
	
	public void createTree(int[] input){
		
		LinkedList<TreeNode> NodeList = new LinkedList<>();
		
		TreeNode current = root;
		for(int i=0 ; i<input.length ; i++){
			
			if(current == null){
				current = new TreeNode(input[i]);
				root = current;
				NodeList.add(current);
				i++;
			}
			
			current = NodeList.poll();
			current.setLeftChild(new TreeNode(input[i]));
			NodeList.add(current.getLeftChild());
			i++;
			
			if(!(i<input.length)) break;
			
			current.setRightChild(new TreeNode(input[i]));
			NodeList.add(current.getRightChild());
			
		}
	}
	
	public TreeNode leftmost(TreeNode root){
		while(root.getLeftChild() != null){
			root = root.getLeftChild();
		}
		return root;
	}
	
	public TreeNode rightmost(TreeNode root){
		while(root.getRightChild() != null){
			root = root.getRightChild();
		}
		return root;
	}
}