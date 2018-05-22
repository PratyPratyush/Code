import java.io.*;
import java.util.*;
class Inorder_using_stack
{
	Node head;
	class Node
	{
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
	void fun(Node[] arr,Node root)
	{
		Node temp;
		int top = -1;
		top++;
		arr[top] = root;
		while(top>-1)
		{
			temp = arr[top];
			top--;
			System.out.print(temp.data+" ");
			if(temp.right!=null){
				//top++;
				arr[++top] = temp.right;	
			}
			if(temp.left!=null){
				//top++;
				arr[++top] = temp.left;	
			}
			
		}
		System.out.println(" ");
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Inorder_using_stack tree = new Inorder_using_stack();
		tree.head = tree.new Node(1);
		tree.head.left = tree.new Node(2);
		tree.head.right = tree.new Node(3);
		tree.head.left.left = tree.new Node(4);
		tree.head.left.right = tree.new Node(5);
		tree.head.right.left = tree.new Node(6);
		tree.head.right.right = tree.new Node(7);
		// System.out.println(tree.head.data);
		// System.out.println(tree.head.left.data);
		// System.out.println(tree.head.right.data);
		Node[] arr = new Node[10];
		tree.fun(arr,tree.head);
		//arr[0] = tree.new Node(1);
		//System.out.println(arr[0].data);
	}
}