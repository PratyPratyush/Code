import java.io.*;
import java.util.*;
class LCommonAncestor{
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
	static int fun(Node ptr,int a1,int a2){
		if(ptr==null)
			return -1;
		else if(ptr.data==a1||ptr.data==a2)
			return ptr.data;
		int left =fun(ptr.left,a1,a2);
		int right = fun(ptr.right,a1,a2);
		if(left!=-1&&right!=-1)
			return ptr.data;
		else
			return (left==-1?right:left);
	}
	public static void main(String args[]){
		head =new Node(37);
		head.left =new Node(-34);
		head.right =new Node(-48);
		head.left.right =new Node(-100);
		head.right.left =new Node(-100);
		head.right.right =new Node(48);
		head.right.right.right=new Node(-54);
		head.right.right.right.left =new Node(-71);
		head.right.right.right.right =new Node(-22);
		head.right.right.right.right.right =new Node(8);
		int a = fun(head,-100,-71);
		System.out.print(a);
	}
}