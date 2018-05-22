import java.io.*;
import java.util.*;
class PrintAllAncestor2{
	static Node head = null;
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int d){
			data =d;
			left = null;
			right=null;
		}
	}
	static boolean printAncestor(Node ptr,int n){
		if(ptr==null)
			return false;
		else if(ptr.data==n)
			return true;
		if(printAncestor(ptr.left,n)){
			System.out.print(ptr.data+" ");
			return true;
		}
		if(printAncestor(ptr.right,n)){
			System.out.print(ptr.data+" ");
			return true;
		}
		return false;
	}
	public static void main(String args[]){
		head = new Node(1);
		head.left = new Node(2);
		head.right = new Node(3);
		head.left.right = new Node(5);
		head.left.left =new Node(4);
		head.left.left.left =new Node(7);
		//head.right.right =new Node(5);//
		//head.right.left =new Node(5);
		// if(funFoldable(head.left,head.right))
		// 	System.out.println("Yes");
		// else
		// 	System.out.println("No");
		boolean b = printAncestor(head,4);
		System.out.print("\n");
	}
}