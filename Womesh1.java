import java.io.*;
import java.util.*;
class Womesh1{
	static Node head;
	static class Node{
		int data;
		Node left;
		Node right;
		public Node(int d){
			data = d;
			left=null;
			right=null;
		}
	}
	static void lef(Node ptr){
		while(ptr!=null){
			System.out.print(ptr.data+" ");
			ptr =ptr.left;
		}
		System.out.println(" ");
	}
	static void traverse(Node ptr){
		Node prev=null;
		while(ptr!=null){
			System.out.print(ptr.data+" ");
			prev=ptr;
			ptr=ptr.right;
		}
		System.out.println(" ");
		lef(prev);
		System.out.println(" ");
	}
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int t = sc.nextInt();
		head=null;
		Node prev=null;
		while(t-->0){
			int n =sc.nextInt();
			Node current = new Node(n);
			if(prev!=null){
				prev.right=current;
				current.left = prev;
				prev= current;
			}
			if(head==null){
				head = current;
				prev=current;
			}
		}
		traverse(head);
	}
}
