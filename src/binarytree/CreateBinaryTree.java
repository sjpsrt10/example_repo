package binarytree;

public class CreateBinaryTree {
	
	Node root;
	CreateBinaryTree()
	{
		root=null;
	}

	
	
	public static void main(String args[])
	{
		CreateBinaryTree tree=new CreateBinaryTree();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		
		System.out.println(tree.root.key);
		System.out.println(tree.root.left.key);
		System.out.println(tree.root.right.key);
		
		
	}

}
