import java.io.*;
import java.util.*;
class Womesh{
	static Node head;
	static class Node{
		int data;
		Node next;
		public Node(int d){
			data = d;
			next=null;
		}
	}
	static void traverse(Node ptr){
		while(ptr!=null){
			System.out.print(ptr.data+" ");
			ptr=ptr.next;
		}
		System.out.println(" ");
	}
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int t = sc.nextInt();
		head=null;
		Node prev=null;
		while(t-->0){
			int n =sc.nextInt();
			Node current = new Node(n);
			if(prev!=null){
				prev.next=current;
				prev=current;
			}
			if(head==null){
				head = current;
				prev=current;
			}
		}
		traverse(head);
	}
}
