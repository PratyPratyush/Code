import java.io.*;
import java.util.*;
class DistanceKFromLeaf{
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
	static int disp(Node ptr,int k){
		if(ptr==null) return Integer.MAX_VALUE;
		else if(ptr.left==null&&ptr.right==null)
			return 1;
		int left = disp(ptr.left,k);
		int right = disp(ptr.right,k);
		if(left==k||right==k)
			System.out.print(ptr.data+" ");
		return (left<right?left:right)+1;
	}
	public static void main(String args[]){
		head =new Node(1);
		head.left =new Node(2);
		head.right =new Node(3);
		head.left.left =new Node(6);
		head.left.right =new Node(9);
		head.right.left =new Node(4);
		head.right.right =new Node(5);
		head.right.left.left =new Node(7);
		//head.right.right.right =new Node(8);
		int p =disp(head,1);
		System.out.println(" ");
	}
}