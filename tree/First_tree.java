import java.util.*;
import java.io.*;
class First_tree
{
	Node head;
	class Node{
		int data;
		Node left;
		Node right;
		Node(int item)
		{
			data = item;
			left = null;
			right = null;
		}
	}
	Node insert(Node ptr, int data)
	{
		if(ptr == null){
			Node p = new Node(data);
			return p;
		}
		else if (data<ptr.data) {
			ptr.left=insert(ptr.left,data);
		}
		else{
			ptr.right = insert(ptr.right,data);
		}
		return ptr;
	}
	void print_tree(Node ptr)
	{
		if(ptr!=null){
			System.out.print(ptr.data+" ");
			print_tree(ptr.left);
			print_tree(ptr.right);	
		}
		
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		First_tree tree = new First_tree();
		tree.head = null;
		while(n>0)
		{
			int data = sc.nextInt();
			tree.head = tree.insert(tree.head,data);
			n--;
		}
		//tree.print_tree(tree.head);
		System.out.println(tree.head.data);
		System.out.println(tree.head.left.data);
		System.out.println(tree.head.left.left.data);
		System.out.println(tree.head.left.right.data);
	}
}