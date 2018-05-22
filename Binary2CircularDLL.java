import java.io.*;
import java.util.*;
class Binary2CircularDLL{
	static Node head =null;
	static Node h=null;
	static Node prev=null;
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int d){
			data=d;
			left=null;
			right=null;
		}
	}
	static void builtCDLL(Node ptr){
		if(ptr==null)
			return;
		builtCDLL(ptr.left);
		ptr.left=prev;
		if(h==null) 
			h=ptr;
		if(prev!=null) 
			prev.right=ptr;
		prev=ptr;
		builtCDLL(ptr.right);
	}
	static void printCDLL(Node ptr){
		while(ptr!=null){
			System.out.print(ptr.data+" ");
			ptr=ptr.right;
		}
		System.out.print("\n");
	}
	static void printTree(Node ptr){
		if(ptr==null)
			return;
		printTree(ptr.left);
		System.out.print(ptr.data+" ");
		printTree(ptr.right);
	}
	public static void main(String args[]){
		head = new Node(1);
		head.left =new Node(2);
		head.right =new Node(3);
		head.right.left = new Node(6);
		head.left.left =new Node(4);
		head.left.right =new Node(5);
		printTree(head);
		System.out.print("\n");
		builtCDLL(head);
		printCDLL(h);
	}
}