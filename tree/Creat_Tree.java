import java.io.*;
import java.util.*;
// class Creat_Tree
// {
// 	Node root;
// 	class Node
// 	{
// 		int data;
// 		Node left;
// 		Node right;
// 		Node(int info){
// 			data=info;
// 			left=null;
// 			right=null;
// 		}

// 	}
// 	Node insert_item(Node ptr,int data)
// 	{
// 		if(ptr==null){
// 			Node p = new Node(data);
// 			return p;
// 		}
// 		else if(data<ptr.data)
// 			ptr.left = insert_item(ptr.left,data);
// 		else
// 			ptr.right = insert_item(ptr.right,data);
// 		return ptr;
// 	}
// 	void print_data(Node ptr)
// 	{
// 		if(ptr!=null)
// 		{
			
// 			print_data(ptr.left);
// 			System.out.print(ptr.data+" ");
// 			print_data(ptr.right);
// 		}
// 	}
	
// 	public static void main(String args[])
// 	{
// 		Scanner sc = new Scanner(System.in);
// 		int n = sc.nextInt();
// 		Creat_Tree tr = new Creat_Tree();
// 		tr.root = null;
// 		for(int i=0;i<n;i++)
// 		{
// 			int data = sc.nextInt();
// 			tr.root = tr.insert_item(tr.root,data);
// 		}
// 		tr.print_data(tr.root);
// 		System.out.println(" ");
// 		System.out.println(tr.root.left.left.data);
// 		System.out.println(tr.root.left.right.data);
// 	}
// }
//---------------------------------------------
// class Creat_Tree
// {
// 	Node head;
// 	class Node{
// 		int data;
// 		Node left;
// 		Node right;
// 		Node(int info){
// 			data = info;
// 			left=null;
// 			right=null;
// 		}
// 	}
// 	Node input_data(Node ptr,int data)
// 	{
// 		if(ptr==null)
// 		{
// 			Node p = new Node(data);
// 			return p;
// 		}
// 		if(data<ptr.data)
// 			ptr.left = input_data(ptr.left,data);
// 		else
// 			ptr.right = input_data(ptr.right,data);
// 		return ptr;
// 	}
// 	// void print_data(Node ptr)
//  // 	{
// 	// 	if(ptr!=null)
// 	// 	{
			
// 	// 		print_data(ptr.left);
// 	// 		System.out.print(ptr.data+" ");
// 	// 		print_data(ptr.right);
// 	// 	}
// 	// }
	
// 	public static void main(String args[])
// 	{
// 		Scanner sc = new Scanner(System.in);
// 		int n = sc.nextInt();
// 		Creat_Tree ct = new Creat_Tree();
// 		for(int i=0;i<n;i++)
// 		{
// 			int data = sc.nextInt();
// 			ct.head = ct.input_data(ct.head,data);
// 		}
// 		// ct.print_data(ct.head);
// 		// System.out.println(ct.head.left.left.data);
//  	// 	System.out.println(ct.head.left.right.data);
// 		Stack<Node> st = new Stack<Node>();
// 		Node temp = ct.head;
// 		while(true)
// 		{
// 			while(temp!=null)
// 			{
// 				st.push(temp);
// 				//System.out.print(temp.data+" ");
// 				temp = temp.left;
// 			}
// 			if(st.empty())
// 				break;
// 			temp = st.pop();
// 			System.out.print(temp.data+" ");
// 			temp = temp.right;
// 		}
// 		System.out.println(" ");
// 	}
// }
//--------------------------------------------------------
//level order travering using recursion
class Creat_Tree
{
	Node head;
	class Node
	{
		int data;
		Node left;
		Node right;
		Node(int info){
			data = info;
			left=null;
			right=null;
		}
	}
	Node insert_item(Node ptr,int data)
	{
		if(ptr==null){
			Node p = new Node(data);
			return p;
		}
		else if(data<ptr.data)
		{
			ptr.left = insert_item(ptr.left,data);
		}
		else if(data>ptr.data)
			ptr.right = insert_item(ptr.right,data);
		return ptr;
	}
	void print_data(Node ptr)
	{
		if(ptr!=null)
		{
			System.out.print(ptr.data+" ");
			print_data(ptr.left);
			print_data(ptr.right);
		}
	}
	//print height of tree
	int tree_height(Node ptr)
	{
		if(ptr==null)
			return -1;
		int left = tree_height(ptr.left);
		int right = tree_height(ptr.right);
		return (left>right?left:right)+1;
	}
	//print level order -------------------

	// void print_level(Node ptr,int i)
	// {
	// 	if(ptr==null)
	// 		return;
	// 	if(i==1)
	// 		System.out.print(ptr.data+" ");
	// 	else{
	// 		print_level(ptr.left,i-1);
	// 		print_level(ptr.right,i-1);
	// 	}
	// }

	//print level order through linklist --------------------
	void level_order_linklist(Node ptr)
	{
		LinkedList<Node> ls = new LinkedList<Node>();
		ls.add(ptr);
		ListIterator itr = ls.listIterator();
		while(itr.hasNext()){
			Node temp = ls.poll();
			System.out.print(temp.data+" ");
			if(temp.left!=null)
				ls.add(temp.left);
			if(temp.right!=null)
				ls.add(temp.right);
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Creat_Tree ct = new Creat_Tree();
		ct.head = null;
		for(int i=0;i<n;i++){
			int data = sc.nextInt();
			ct.head = ct.insert_item(ct.head,data);
		}
		ct.print_data(ct.head);
		System.out.println(" ");
		int height = ct.tree_height(ct.head);
		System.out.println(height);
		// for(int i=1;i<=height+1;i++)
		// {
		// 	ct.print_level(ct.head,i);
		// 	System.out.println(" ");
		// }
		System.out.println(" ");
		ct.level_order_linklist(ct.head);
	}
}