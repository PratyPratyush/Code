import java.io.*;
import java.util.*;
class CheckTreeParentArray{
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
	//static void 
	static void printPreorder(Node ptr){
		if(ptr==null)
			return;
		System.out.print(ptr.data+" ");
		printPreorder(ptr.left);
		printPreorder(ptr.right);
		return;
	}
	public static void main(String args[]){
		int[] arr = {1,5,5,2,2,-1,3};
		Node[] ptr = new Node[arr.length];
		for(int i=0;i<arr.length;i++){
			ptr[i] = new Node(i);
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=-1){
				if(ptr[arr[i]].left==null)
					ptr[arr[i]].left = ptr[i];
				else
					ptr[arr[i]].right = ptr[i];
			}
			else
				head = ptr[i];
		}
		printPreorder(head);
		System.out.println("\n");
	}
}