// Delet Node in Binary Search Tree
import java.io.*;
import java.util.*;
class BSearchTree{
	static Node head=null;
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
	static Node insert(Node ptr,int data){
		if(ptr==null){
			Node p = new Node(data);
			return p;
		}
		if(ptr.data<data)
			ptr.right=insert(ptr.right,data);
		else
			ptr.left = insert(ptr.left,data);
		return ptr;
	}
	static void printTree(Node ptr){
		if(ptr==null) return;
		System.out.print(ptr.data+" ");
		printTree(ptr.left);
		printTree(ptr.right);
	}
	static Node pri(Node ptr,int data){
		if(ptr==null) return null;
		// if(ptr.data==data){
		// 	// System.out.print("Current : "+ptr.data+" Prev : "+prev.data);
		// 	// return;
		// }
		//prev=ptr;
		if(ptr.data<data)
			ptr.right=pri(ptr.right,data);
		else if(ptr.data>data)
			ptr.left=pri(ptr.left,data);
		else{
			if(ptr.left==null)
				return ptr.right;
			else if(ptr.right==null)
				return ptr.left;
			else if(ptr.left!=null&&ptr.right!=null){
				Node temp = fun(ptr.right);
				if(prev==null)
					temp.left = ptr.left;
				else{
					prev.left=temp.right;
					temp.left=ptr.left;
					temp.right = ptr.right;
				}
				return temp;
			}
		}
		return ptr;
	}
	static Node fun(Node ptr){
		if(ptr.left==null)
			return ptr;
		prev=ptr;
		return(ptr.left);

	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
			int data = sc.nextInt();
			head = insert(head,data);
		}
		int t1 = sc.nextInt();
		while(t1-->0){
			int d = sc.nextInt();
			head=pri(head,d);
		}
		
		//System.out.println(" ");
		printTree(head);
		System.out.println(" ");
	}
}