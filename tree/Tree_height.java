import java.io.*;
import java.util.*;
class Tree_height
{
	Node head;
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
		if(ptr==null){
			Node temp = new Node(data);
			return temp;
		}
		else if (data<ptr.data) {
			ptr.left = insert(ptr.left,data);
		}
		else{
			ptr.right = insert(ptr.right,data);
		}
		return ptr;
	}
	int find_max(Node root)
	{
		if(root == null){
			return -1;
		}
		else{
			int left = find_max(root.left);
			int right = find_max(root.right);
			return (left<right?right:left)+1;
		}
	}
	int find_max_value(Node root)
	{
		if(root==null)
			return 0;
		else{
			int left = find_max_value(root.left);
			int right = find_max_value(root.right);
			if(left==0&&right==0)
				return root.data;
			else
				return(left<right?right:left);
		}
	}
	void level_order(Node root)
	{
		Node get;
		if(root==null)
			System.out.println("Root is Empty");
		PriorityQueue<Node> q = new PriorityQueue<Node>();
		q.add(root);
		get = q.poll();
		System.out.print(get.data+" ");
		q.add(get.left);
		q.add(get.right);
		get = q.poll();

		System.out.println(get.data);

		// q.add(get.left);
		// q.add(get.right);
		// get = q.poll();
		// System.out.println(get.data);
		// get = q.poll();
		// System.out.println(get.data);
		// while(!q.isEmpty())
		// {
		// 	get = q.poll();
		// 	System.out.print(get.data+" ");
		// 	if(get.left != null)
		// 		q.add(get.left);
		// 	if(get.right != null)
		// 		q.add(get.right);
		// }
		// System.out.println(" ");
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Tree_height th = new Tree_height();
		th.head = null;
		while(n>0)
		{
			int data = sc.nextInt();
			th.head = th.insert(th.head,data);
			n--;
		}
		// System.out.println(th.head.data);
		// System.out.println(th.head.left.data);
		// System.out.println(th.head.left.right.data);
		th.level_order(th.head);
		//int max_height = th.find_max(th.head);
		//System.out.println(max_height+" :- is the max height");
		//int max_value = th.find_max_value(th.head);
		//System.out.println(max_value+" :- the heighest value");

	}
}