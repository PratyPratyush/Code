import java.io.*;
import java.util.*;
// class CheckTree{
// 	static Node head=null;
// 	static class Node{
// 		int data;
// 		Node left;Node right;
// 		Node(int d){
// 			data=d;
// 			left=null;right=null;
// 		}
// 	}
// 	static Node insert(Node ptr,int data){
// 		if(ptr==null){
// 			Node p =new Node(data);
// 			return p;
// 		}
// 		else if(ptr.data>data)
// 			ptr.left = insert(ptr.left,data);
// 		else if(ptr.data<data)
// 			ptr.right = insert(ptr.right,data);
// 		return ptr;
// 	}
// 	static void print_tree(Node ptr){
// 		if(ptr==null) return;
// 		print_tree(ptr.left);
// 		print_tree(ptr.right);
// 		System.out.println(ptr.data);
		
// 	}
// 	public static void main(String args[]){
// 		Scanner sc =new Scanner(System.in);
// 		int t =sc.nextInt();
// 		while(t-->0){
// 			int data = sc.nextInt();
// 			head = insert(head,data);
// 		}
// 		print_tree(head);
// 	}
// }
class CheckTree{
	static class Node{
		int data;
		Node left;
		Node(int d){
			data=d;
			left=null;
		}
	}
	public static void main(String args[]){
		Node temp=null;
		LinkedList<Node> ls =new LinkedList<Node>();
		ls.add(temp);
		Node p =ls.pop();
		if(p==null) System.out.println("j");
		// Node n =new Node();
		// n.fun();
	}
}