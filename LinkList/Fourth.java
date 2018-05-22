import java.util.*;
import java.io.*;
class Fourth
{
	Node head,temp;
	class Node
	{
		int data;
		Node next;
		Node(int item)
		{
			data = item;
			next = null;
		}
	}
	void push(int data)
	{
		if(head==null){
			head = new Node(data);
			temp = head;
		}
		else{
			temp.next = new Node(data);
			temp = temp.next;	
		}
	}
	void Reverse()
	{
		temp = head;
		Node temp1=null,nex_node=null;
		while(temp!=null)
		{
			nex_node = temp.next;
			temp.next = temp1;
			temp1 = temp;
			temp = nex_node;
		}
		temp = temp1;
	}
	void print_link(Node ptr)
	{
		while(ptr!=null)
		{
			System.out.print(ptr.data+" ");
			ptr = ptr.next;
		}
		System.out.println(" ");
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Fourth list = new Fourth();
		int n = sc.nextInt();
		list.head = null;
		list.temp = null;
		while(n>0)
		{
			int data = sc.nextInt();
			list.push(data);
			n--;
		}
		list.temp = list.head;
		System.out.println("-------------");
		list.print_link(list.head);
		System.out.println(" ");
		System.out.println("Enter 1 for Reverse of Linklist");
		System.out.println("Enter 2 for Find Middle Element");
		int t = sc.nextInt();
		switch(t)
		{
			case 1:
				list.Reverse();
				list.print_link(list.temp);
				break;
			default:
				System.out.println("Input no Match");

		}
		
	}
}