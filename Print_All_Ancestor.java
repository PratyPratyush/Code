import java.io.*;
import java.util.*;
class Print_All_Ancestor{
	static Node head=null;
	// static boolean leaf1 = false;
	// static boolean leaf2 =false;
	
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int d){
			data=d;
			left =null;
			right=null;
		}
	}
	static void printAll(Node ptr,int a,int b,Stack<Integer> st){
		if(ptr==null)
			return null;
		else if(ptr.data==a){
			leaf1= true;
			return ptr;
		}
		else if(ptr.data==b){
			leaf2 = true;
			return ptr;
		}
		Node left = printAll(ptr.left,a,b,st);
		Node right = printAll(ptr.right,a,b,st);
		if(leaf1==true&&leaf2==true)
			
	}
	public static void main(String args[]){

	}
}