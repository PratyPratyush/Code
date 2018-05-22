import java.io.*;
import java.util.*;
class RemoveNode_Not_liePath{
	static Node head=null;
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
	static Node funRemove(Node ptr,int value,int k){
		if(ptr==null)
			return null;
		value =value+ptr.data;
		if(ptr.left==null&&ptr.right==null){
			if(value<k)
				return null;
			else
				return ptr;
		}
		ptr.left =funRemove(ptr.left,value,k);
		ptr.right =funRemove(ptr.right,value,k);
		if(ptr.left==null&&ptr.right==null){
			if(value<k)
				return null;
		}
		return ptr;
	}
	static void funDisplay(Node ptr){
		if(ptr==null) return;
		System.out.print(ptr.data+" ");
		funDisplay(ptr.left);
		funDisplay(ptr.right);
	}
	public static void main(String args[]){
		head= new Node(1);
		head.left =new Node(2);
		head.right =new Node(5);
		head.left.left = new Node(4);
		head.left.right =new Node(5);
		head.left.right.left =new Node(12);
		head.right.left =new Node(6);
		head.right.left.left =new Node(1);
		head.right.right = new Node(7);
		head.right.right.right =new Node(10);
		System.out.println("Before Removing");
		funDisplay(head);
		head=funRemove(head,0,20);
		System.out.println(" ");
		System.out.println("After Removing");
		funDisplay(head);
		System.out.println(" ");
	}
}
