import java.io.*;
import java.util.*;
class TreePBT{
	static Node root=null;
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int d){
			data=d;
			left=null;right=null;
		}
	}
	static void printSpecificTraversal(Node ptr){
		LinkedList<Node> ls =new LinkedList<Node>();
		if(ptr==null)
			return;
		System.out.print(ptr.data+" ");
		ls.add(ptr.left);
		ls.add(ptr.right);
		Node temp1,temp2;
		while(!ls.isEmpty()){
			temp1 = ls.poll();
			temp2 = ls.poll();
			System.out.print(temp1.data+" ");
			System.out.print(temp2.data+" ");
			if(temp1.left!=null&&temp2.right!=null){
				ls.add(temp1.left);ls.add(temp2.right);
			}
			if(temp1.right!=null&&temp2.left!=null){
				ls.add(temp1.right);
				ls.add(temp2.left);
			}
		}
	}
	public static void main(String args[]){
		root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
  
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
  
        root.left.left.left = new Node(8);
        root.left.left.right = new Node(9);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(11);
        root.right.left.left = new Node(12);
        root.right.left.right = new Node(13);
        root.right.right.left = new Node(14);
        root.right.right.right = new Node(15);

        root.left.left.left.left = new Node(16);
        root.left.left.left.right = new Node(17);
        root.left.left.right.left = new Node(18);
        root.left.left.right.right = new Node(19);
        root.left.right.left.left = new Node(20);
        root.left.right.left.right = new Node(21);
        root.left.right.right.left = new Node(22);
        root.left.right.right.right = new Node(23);
        root.right.left.left.left = new Node(24);
        root.right.left.left.right = new Node(25);
        root.right.left.right.left = new Node(26);
        root.right.left.right.right = new Node(27);
        root.right.right.left.left = new Node(28);
        root.right.right.left.right = new Node(29);
        root.right.right.right.left = new Node(30);
        root.right.right.right.right = new Node(31);
        printSpecificTraversal(root);
        System.out.println(" ");

	}
}