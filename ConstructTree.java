import java.io.*;
import java.util.*;
class ConstructTree{
	static Node head=null;
	static int count=0;
	static class Node{
		int data;
		Node left;Node right;
		Node(int d){
			data=d;
			left=null;
			right=null;
		}
	}
	static int find(int[] inorder,int s,int e,int data){
		for(int i=s;i<=e;i++){
			if(inorder[i]==data)
				return i;
		}
		return 0;
	}
	static Node builtTree(int[] inorder,int[] preorder,int s,int e){
		Node ptr = new Node(preorder[count++]);
		if(s==e)
			return ptr;
		int index = find(inorder,s,e,ptr.data);
		if(index-1>=s)
			ptr.left = builtTree(inorder,preorder,s,index-1);
		if(index+1<=e)
			ptr.right = builtTree(inorder,preorder,index+1,e);
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
//	Inorder $ 	levelorder
//====================================================
	static int findIndex(int[] inorder,int s,int d,int data){
		for(int i=s;i<=d;i++){
			if(inorder[i]==data)
				return i;
		}
		return 0;
	}
	static Vector<Integer> levelList(int[] inorder,int s,int d,Vector<Integer> ls){
		Vector<Integer> v = new Vector<Integer>(ls);
		HashSet<Integer> hs =new HashSet<Integer>();
		for(int i=s;i<=d;i++) hs.add(inorder[i]);
		for(int i=0;i<v.size();){
			if(!hs.contains((int)v.elementAt(i)))
					v.remove(i);
			else
				i++;
		}
		return v;
	}
	static Node funBuild(Vector<Integer> ls,int[] inorder,int s,int d)
	{
		//System.out.println("hello"+s+" "+d);
		//System.out.println(ls);
		Node ptr = new Node((int)ls.firstElement());
		if(s==d) {
			//System.out.println(ptr.data);
			return ptr;
		}
		int index =findIndex(inorder,s,d,ptr.data) ;
		//System.out.println(index);

		if(index-1>=s){
			Vector<Integer> l = levelList(inorder,s,index-1,ls);
			//System.out.println(l);
			ptr.left = funBuild(l,inorder,s,index-1);
			
		}
		if(index+1<=d){
			//System.out.println((index+1)+" inside "+d);
			//System.out.println(ls);
			Vector<Integer> r =	levelList(inorder,index+1,d,ls);
			//System.out.println(r);
			ptr.right = funBuild(r,inorder,index+1,d);
		}
		return ptr;

	}
	public static void main(String args[]){
		//        Inorder and Preorder
		//================================================== 
		// int[] inorder = {5,4,2,1,3};
		// int[] preorder = {1,2,4,5,3};
		// int len = inorder.length;
		// head = builtTree(inorder,preorder,0,len-1);
		// printPreorder(head);
		// System.out.print("\n");

		//     Inorder and Levelorder
		//=====================================
		int[] inorder = {4,2,7,5,8,1,3,9,6};
		int[] preorder = {1,2,3,4,5,6,7,8,9};
		Vector<Integer> ls = new Vector<Integer>();
		for(int i=0;i<preorder.length;i++)
				ls.add(preorder[i]);
		//System.out.println(ls.size());
		Node h = funBuild(ls,inorder,0,ls.size()-1);
		printPreorder(h);
		System.out.print("\n");
		// Vector<Integer> l = levelList(inorder,6,8,ls);
		// System.out.println(l);


	}
}