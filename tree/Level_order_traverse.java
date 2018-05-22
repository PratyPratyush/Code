import java.io.*;
import java.util.*;
class Level_order_traverse
{
	Node head,temp;
	class Node{
		int data;
		Node left;
		Node right;
		Node(int item)
		{
			data = item;
			left = right = null;
		}
	}
	Node insert(Node ptr,int data)
	{
		if(ptr == null){
			Node element = new Node(data);
			return(element);
		}
		else if(data<ptr.data){
			ptr.left = insert(ptr.left,data);
		}
		else{
			ptr.right = insert(ptr.right,data);
		}
		return(ptr);
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Level_order_traerse tree = new Level_order_traerse();
		System.out.println("Enter how many input u want");
		int n = sc.nextInt();
		tree.head = null;
		while(n>0)
		{
			int data = sc.nextInt();
			tree.head =tree.insert(tree.head,data);
			n--;
		}
		System.out.println(tree.head.data);
		//Level_order_traerse.Node temp = tree.head;
		 //PriorityQueue p = new PriorityQueue();
		// Node temp1 = new Node(5);
		 //tree.temp = tree.head;
		 //p.add(temp);
		 //tree.temp = p.poll();
		 //System.out.println(temp.data);
		// while()
		// System.out.println(tree.head.data);
		// System.out.println(tree.head.left.data);
		// System.out.println(tree.head.right.data);
		// System.out.println(tree.head.left.left.data);
		// System.out.println(tree.head.right.right.data);

	}
}