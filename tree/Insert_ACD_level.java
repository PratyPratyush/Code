import java.io.*;
import java.util.*;
class Insert_ACD_level
{
	Node head;
	class Node
	{
		int data;
		Node left;
		Node right;
		Nod(int item)
		{
			data = item;
			left = null;
			right = null;
		}
	}
	// Node insert_data(Node root,int item)
	// {
	// 	if(root==null){
	// 		Node ptr= new Node(item);
	// 		return ptr
	// 	}
	// 	else{
	// 		if(root.data>item)
	// 			root.left = insert_data(root.left,item);
	// 		else
	// 			root.right = insert_data(root.right,item);
	// 	}
	// 	return root;
	// }
	void insert_data(Node root,int item)
	{
		if(root==null)
		{
			Node ptr = new Node(item);
			head = ptr;
		}
		if(root!==null)
		{
			if(root.data>item)
			{
				if(root.left!=null)
					insert_data(root.left,item);
				else{
					Node ptr = new Node(item);
					root.left = ptr;
					return;
				}

			}
			else{
				if(root.right!=null)
					insert_data(root.right,item);
				else{
					Node ptr = new Node(item);
					root.right = ptr;
					return;
				}
			}
		}
	}
	public static void main(String args[])
	{
		Scanner sc = Scanner(System.in);
		int n = sc.next();
		Insert_ACD_level tree = new Insert_ACD_level();
		tree.head = null;
		while(n>0)
		{
			int data = sc.nextInt();
			tree.insert_data(head,data);

		}
	}
}