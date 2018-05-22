//====================================================
//          Mirror Tree or not
//=====================================================
// import java.io.*;
// import java.util.*;
// class Check_Mirror_Tree{
// 	Node head1,head2;
// 	class Node{
// 		int data;Node left;Node right;
// 		Node(int value){
// 			data = value;left=null;right=null;
// 		}
// 	}
// 	Node insert_tree(Node ptr,int data){
// 		if(ptr==null){Node p =new Node(data);return p;}
// 		if(data<ptr.data){ptr.left=insert_tree(ptr.left,data);}
// 		else if(data>ptr.data){ptr.right=insert_tree(ptr.right,data);}
// 		return ptr;
// 	}
// 	void print_tree(Node ptr){
// 		LinkedList<Node> ls=new LinkedList<Node>();
// 		ls.add(ptr);
// 		Node temp;
// 		while(!ls.isEmpty()){
// 			temp=ls.poll();System.out.print(temp.data+" ");
// 			if(temp.left!=null) ls.add(temp.left);
// 			if(temp.right!=null) ls.add(temp.right);
// 		}
// 	}
// 	void check_mirr(Node ptr1,Node ptr2){
// 	    LinkedList<Node> ls1 =new LinkedList<Node>();
// 	    LinkedList<Node> ls2 = new LinkedList<Node>();
// 	    ls1.add(ptr1);ls2.add(ptr2);boolean check=true;
// 	    while(!ls1.isEmpty()&&!ls2.isEmpty()){
	    	
// 	    	Node temp1=ls1.poll();Node temp2=ls2.poll();
// 	    	if(temp1.data!=temp2.data){check=false;break;}
// 	    	if(temp1.left!=null) ls1.add(temp1.left);
// 	    	if(temp2.right!=null) ls2.add(temp2.right);
// 	    	if(temp1.right!=null) ls1.add(temp1.right);
// 	    	if(temp2.left!=null) ls2.add(temp2.left);
// 	    }
// 	    if(ls1.isEmpty()&&ls2.isEmpty()&&check==true) System.out.println("true");
// 	    else System.out.println("false");
// 	}
// 	public static void main(String args[]){
// 		Scanner sc = new Scanner(System.in) ;
// 		int n = sc.nextInt();
// 		Check_Mirror_Tree cm =new Check_Mirror_Tree();
// 		cm.head1=null;cm.head2=null;
// 		while(n-->0){
// 			cm.head1=cm.insert_tree(cm.head1,sc.nextInt());
// 		}
// 		cm.print_tree(cm.head1);
// 		System.out.println(" ");
// 		cm.head2=cm.new Node(15);
// 		cm.head2.left=cm.new Node(20);
// 		cm.head2.right=cm.new Node(10);
// 		cm.head2.left.left=cm.new Node(25);
// 		cm.head2.left.right=cm.new Node(17);
// 		cm.head2.right.right=cm.new Node(8);
// 		cm.head2.right.left=cm.new Node(11);
		
		
// // 		n=sc.nextInt();
// // 		while(n-->0){
// // 			cm.head2=cm.insert_tree(cm.head2,sc.nextInt());
// // 		}
// 		cm.print_tree(cm.head2);
// 		System.out.println(" ");
// 		cm.check_mirr(cm.head1,cm.head2);

// 	}
// }
//===================================================================================================
//			Balance tree or not
//====================================================================================================
import java.io.*;
import java.util.*;
class Check_Mirror_Tree{
	Node head1;
	class Node{
		int data;Node left;Node right;
		Node(int value){
			data = value;left=null;right=null;
		}
	}
	Node insert_tree(Node ptr,int data){
		if(ptr==null){Node p =new Node(data);return p;}
		if(data<ptr.data){ptr.left=insert_tree(ptr.left,data);}
		else if(data>ptr.data){ptr.right=insert_tree(ptr.right,data);}
		return ptr;
	}
	void print_tree(Node ptr){
		LinkedList<Node> ls=new LinkedList<Node>();
		ls.add(ptr);
		Node temp;
		while(!ls.isEmpty()){
			temp=ls.poll();System.out.print(temp.data+" ");
			if(temp.left!=null) ls.add(temp.left);
			if(temp.right!=null) ls.add(temp.right);
		}
	}
	int balance_tree(Node ptr){
		if(ptr==null) return -1;
		int left = balance_tree(ptr.left);
		int right = balance_tree(ptr.right);
		if(Math.abs(left-right)<=1&&left>-2&&right>-2) return(left>right?left:right)+1;
		else return -2;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in) ;
		int n = sc.nextInt();
		Check_Mirror_Tree cm =new Check_Mirror_Tree();
		cm.head1=null;
		while(n-->0){
			cm.head1=cm.insert_tree(cm.head1,sc.nextInt());
		}
		cm.print_tree(cm.head1);
		System.out.println(" ");
		int value = cm.balance_tree(cm.head1);
		if(value==-2) System.out.println("Not Balance tree");
		else System.out.println("Balance tree");

	}
}