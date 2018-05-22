import java.io.*;
import java.util.*;
class DistTwoNode{
	static Node head=null;
	static int leaf1 = -1;
	static int leaf2 =-1;
	static int ances = -1;
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
	// static int funLCA(Node ptr,int a,int b){
	// 	if(ptr==null)
	// 		return -1;
	// 	else if(ptr.data==a||ptr.data==b)
	// 		return ptr.data;
	// 	int left = funLCA(ptr.left,a,b);
	// 	int right =funLCA(ptr.right,a,b);
	// 	if(left!=-1&&right!=-1)
	// 		return ptr.data;
	// 	else
	// 		return(left>right?left:right);
	// }
	static Node funLCA(Node ptr,int a,int b,int d){
		if(ptr==null)
			return null;
		if(ptr.data==a){
			leaf1=d;
			return ptr;
		}
		if(ptr.data==b){
			leaf2=d;
			return ptr;
		}
		Node left = funLCA(ptr.left,a,b,d+1);
		Node right = funLCA(ptr.right,a,b,d+1);
		if(left!=null&&right!=null){
			ances = d;
			return ptr;
		}
		return (left!=null?left:right);
	}
	static int funDist(Node ptr,int a,int d){
		if(ptr==null)
			return -1;
		else if(ptr.data==a)
			return d;
		int left = funDist(ptr.left,a,d+1);
		if(left>-1) return left;
		int right = funDist(ptr.right,a,d+1);
		return (left>right?left:right);

	}
	///static int funDist(Node ptr,int )///
	static void funCal(Node ptr,int a,int b){
		if(ptr==null)
			System.out.println("Ancestor is not available");
		else if(leaf1!=-1&&leaf2!=-1){
			int d = (leaf1+leaf2)-2*(ances);
			System.out.println("Distance is : "+d);
		}	
		else if(leaf1==-1){
			int d = funDist(ptr,a,0);
			System.out.println("Distance is : "+d);
		}
		else if(leaf2==-1){
			int d = funDist(ptr,b,0);
			System.out.println("Distance is : "+d);
		}
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		head = new Node(1);
		head.left = new Node(2);
		head.right =new Node(3);
		head.left.left =new Node(4);
		head.left.right =new Node(5);
		head.right.left = new Node(6);
		head.right.right =new Node(7);
		head.right.left.right =new Node(8);
		// int lca = funLCA(head,7,8);
		//System.out.println(lca);
		// int d = funDist(head,8,0);
		// System.out.println(d);
		Node p = funLCA(head,a,b,0);
		funCal(p,a,b);
		if(p!=null)
			System.out.println("LCA : "+p.data);
		System.out.println("The value is ");
		System.out.println(leaf1+" "+leaf2+" "+ances);


	}
}