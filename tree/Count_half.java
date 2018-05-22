import java.io.*;
import java.util.*;
class Count_half
{
	static int count =0;
	Node head;
	class Node
	{
		int data;
		Node left;
		Node right;
		Node(int info){
			data = info;
			left = null;
			right = null;
		}
	}
	// int half_count(Node ptr)
	// {
	// 	if(ptr==null)
	// 		return 0;
	// 	int left = half_count(ptr.left);
	// 	int right = half_count(ptr.right);
	// 	if(left == right)
	// 		return 1;
	// 	else if(left != right){
	// 		count++;
	// 	}
	// 	return 1;
	// }
	void half_count(Node ptr)
	{
		int count = 0;
		LinkedList<Node> ls = new LinkedList<Node>();
		Stack<Node> stc = new Stack<Node>();
		ls.add(ptr);
		ListIterator itr = ls.listIterator();
		while(itr.hasNext())
		{
			Node temp = ls.poll();
			//System.out.println(temp.data);
			stc.push(temp);
			if(temp.left==null&&temp.right!=null||temp.left!=null&&temp.right==null)
				count++;
			if(temp.right!=null)
				ls.add(temp.right);
			if(temp.left!=null)
				ls.add(temp.left);
		}
		while(!stc.empty())
		{
			//System.out.println("hello");
			Node temp1 = stc.pop();
			System.out.print(temp1.data+" ");
		}
		System.out.println(" ");
		System.out.println(count);
	}
	public static void main(String args[])
	{
		Count_half cl = new Count_half();
		cl.head = cl.new Node(2);
		cl.head.left = cl.new Node(7);
		cl.head.right = cl.new Node(5);
		cl.head.left.right = cl.new Node(6);
		cl.head.right.right = cl.new Node(9);
		cl.head.left.right.left = cl.new Node(1);
		cl.head.left.right.right = cl.new Node(11);
		cl.head.right.right.left = cl.new Node(14);
		cl.head.right.right.left.right = cl.new Node(23);
		//System.out.println(cl.head.left.right.data);
		//System.out.println(cl.head.right.right.data);
		//int check = cl.half_count(cl.head);
		//System.out.println(count);
		cl.half_count(cl.head);
	}
}