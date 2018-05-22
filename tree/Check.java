import java.io.*;
import java.util.*;
class Check{
	Node head;
	class Node{
		int data;Node left;Node right;
		Node(int value){data=value;left=null;right=null;}
	}
	Node insert_value(Node ptr,int data){
		if(ptr==null){Node p = new Node(data);return p;}
		if(data<ptr.data)
			ptr.left=insert_value(ptr.left,data);
		else if(data>ptr.data)
			ptr.right = insert_value(ptr.right,data);
		return ptr;
	}
	void pri_nt(Node ptr){
		if(ptr!=null){
			pri_nt(ptr.left);
			System.out.print(ptr.data+" ");
			pri_nt(ptr.right);
		}
	}

	//SUM OF ALL LEAF VALUE IN TREE
	int find_leaf_value(Node ptr){
		int sum=0;
		if(ptr==null) return sum;
		if(ptr.left==null&&ptr.right==null)
			return ptr.data;
		sum = sum+find_leaf_value(ptr.left);
		sum = sum +find_leaf_value(ptr.right);
		return sum;
	}
	//==================================================

	// SUM OF ONLY LEFT LEAF NODE OF A TREE
	boolean check_left(Node ptr){
		if(ptr==null) return false;
		if(ptr.left==null&&ptr.right==null) return true;
		return false;
	}
	int find_left_leaf_value(Node ptr){
		int sum=0;
		if(ptr!=null){
			if(check_left(ptr.left)){sum+=ptr.left.data;}
			else sum+=find_left_leaf_value(ptr.left);
			sum+=find_left_leaf_value(ptr.right);
		}
		return sum;
	}
	//=============================================================


	// MIN AND MAX VALUE OF TREE(NOT BINARY TREE)
	void max_min_value(){
		Node head1;
		head1= new Node(2);
		head1.left = new Node(7);
		head1.right = new Node(5);
		head1.left.right = new Node(6);
		head1.left.right.left = new Node(1);
		head1.left.right.right = new Node(11);
		head1.right.right = new Node(9);
		head1.right.right.left = new Node(4);
		LinkedList<Node> ls =new LinkedList<Node>();
		ls.add(head1);
		int max=head1.data,min=head1.data;
		//System.out.println(head1.data+" "+head1.left.data+" "+head1.right.data);
		while(!ls.isEmpty()){
			Node temp = ls.poll();
			if(max<temp.data) max=temp.data;
			if(min>temp.data) min=temp.data;
			if(temp.left!=null) ls.add(temp.left);
			if(temp.right!=null) ls.add(temp.right);
		}
		System.out.println(max+" "+min);
	}
	//=========================================================================

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		Check ck = new Check();
		// ck.head=null;
		// while(n-->0){
		// 	ck.head = ck.insert_value(ck.head,sc.nextInt());
		// }
		// ck.pri_nt(ck.head);
		// System.out.println(" ");
		// System.out.println(ck.find_leaf_value(ck.head));      // SUM OF ALL LEAF NODE OF THE TREE
		// System.out.println(ck.find_left_leaf_value(ck.head)); // SUM OF ONLY LEFT LEAF NODE OF TREE
		ck.max_min_value();
	}
}