import java.io.*;
import java.util.*;
class CreatLinklist2Tree{
	static Node root = null;
	static Doublee head=null;
	static Doublee h = null;
	static Doublee prev = null;
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int d){
			data=d;
			left = null;
			right=null;
		}
	}
	static class Doublee{
		int data;
		Doublee front;
		Doublee back;
		Doublee(int d){
			data =d;
			front=null;
			back=null;
		}
	}
	static void funBuiltDLL(Node ptr){
		if(ptr==null)
			return;
		funBuiltDLL(ptr.left);
		h = new Doublee(ptr.data);
		if(head==null)
			head = h;
		h.front = prev;
		if(prev!=null)
			prev.back = h;
		prev = h;
		System.out.print(ptr.data+" ");
		funBuiltDLL(ptr.right);
		return;
	}
	static void displayDDL(Doublee ptr){
		while(ptr!=null){
			System.out.print(ptr.data+" ");
			ptr = ptr.back;
		}
	}
	public static void main(String args[]){
	root = new Node(10);
	root.left = new Node(12);
	root.right = new Node(15);
	root.left.left = new Node(25);
	root.left.right = new Node(30);
	root.right.left =new Node(36);
	funBuiltDLL(root);
	System.out.print("\n");
	displayDDL(head);
	System.out.print("\n");
	}
}