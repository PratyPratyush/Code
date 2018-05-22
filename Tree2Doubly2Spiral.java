import java.io.*;
import java.util.*;
class Tree2Doubly2Spiral{
	static Node head = null;
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
	static void builtDoubly(Node ptr){
		Stack<Node> st =new Stack<Node>();
		LinkedList<Node> ls =new LinkedList<Node>();
		ls.add(ptr);
		int i=1;
		Node prev=null;
		while(true){
			if(ls.isEmpty())
				break;
			if(i%2!=0){
				while(!ls.isEmpty()){
					Node temp = ls.poll();
					if(temp.right!=null)
						st.push(temp.right);
					if(temp.left!=null)
						st.push(temp.left);
					temp.left = prev;
					temp.right=null;
					if(prev!=null)
						prev.right = temp;
					prev=temp;
				}
			}
			else{
				while(!ls.isEmpty()){
					Node temp = ls.poll();
					if(temp.left!=null)
						st.push(temp.left);
					if(temp.right!=null)
						st.push(temp.right);
					temp.left = prev;
					temp.right = null;
					if(prev!=null)
						prev.right = temp;
					prev=temp;
				}
			}
			while(!st.empty()){
				ls.add(st.pop());
			}
			i++;
		}
	}
	static void printDoubly(Node ptr){
		while(ptr!=null){
			System.out.print(ptr.data+" ");
			ptr =ptr.right;
		}
	}
	public static void main(String args[]){
		head = new Node(1);
		head.left =new Node(2);
		head.right =new Node(3);
		head.left.left =new Node(4);
		head.left.right =new Node(5);
		head.right.left =new Node(6);
		head.right.right =new Node(7);
		head.left.left.left =new Node(8);
		head.left.left.right =new Node(9);
		head.right.left.left =new Node(10);
		head.right.left.right =new Node(11);
		builtDoubly(head);
		printDoubly(head);
		System.out.print("\n")
	}
}