import java.io.*;
import java.util.*;
class FoldableTree{
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
	static boolean funFoldable(Node root1,Node root2){
		if(root1==null&&root2==null)
			return true;
		else if(root1!=null&&root2==null||root2!=null&&root1==null)
			return false;
		if(funFoldable(root1.left,root2.right)&&funFoldable(root1.right,root2.left))
			return true;
		else
			return false;
	}
	public static void main(String args[]){
		head = new Node(1);
		head.left = new Node(2);
		head.right = new Node(3);
		//head.left.right = new Node(6);
		head.left.left =new Node(4);
		//head.right.right =new Node(5);//
		head.right.left =new Node(5);
		if(funFoldable(head.left,head.right))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}