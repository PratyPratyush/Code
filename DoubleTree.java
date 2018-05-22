import java.io.*;
import java.util.*;
class DoubleTree{
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
	static void funDoubleTree(Node ptr){
		if(ptr==null)
			return;
		Node temp = new Node(ptr.data);
		temp.left = ptr.left;
		ptr.left = temp;
		funDoubleTree(temp.left);
		funDoubleTree(ptr.right);
	}
	static void display(Node ptr){
		if(ptr==null)
			return;
		System.out.print(ptr.data+" ");
		display(ptr.left);
		display(ptr.right);
	}
	public static void main(String args[]){
		head = new Node(1);
		head.left =new Node(2);
		head.right =new Node(3);
		head.left.left =new Node(4);
		head.left.right =new Node(5);
		funDoubleTree(head);
		//display(head);
		System.out.println(head.left.left.data);
		System.out.println(head.right.left.data);
	}
}