import java.io.*;
import java.util.*;
class CheckTreePost_Inorder{
	static Node head=null;
	static int count=0;
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int d){
			data = d;
			left=null;
			right=null;
		}
	}
	static int find(int[] inorder,int s,int d,int data){
		for(int i=s;i<=d;i++){
			if(inorder[i]==data)
				return i;
		}
		//if(inorder[i])
		return 0;
	}
	static Node builtTree(int[] inorder,int[] postorder,int s,int d){
		//System.out.println(count);
		Node ptr = new Node(postorder[count]);
		count--;
		if(s==d)
			return ptr;
		int index = find(inorder,s,d,ptr.data);
		if(index+1<=d)
			ptr.right = builtTree(inorder,postorder,index+1,d);
		if(index-1>=s)
			ptr.left = builtTree(inorder,postorder,s,index-1);
		return ptr;
	}
	static void printPreorder(Node ptr){
		if(ptr==null)
			return;
		System.out.print(ptr.data+" ");
		printPreorder(ptr.left);
		printPreorder(ptr.right);
		return;
	}
	public static void main(String args[]){
		int[] inorder = {8,4,9,2,1,6,3,7};
		int[] postorder = {8,9,4,2,6,7,3,1};
		count = inorder.length-1;
		head = builtTree(inorder,postorder,0,inorder.length-1);
		printPreorder(head);
		System.out.println(" ");
	}
}