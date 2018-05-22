import java.util.*;
import java.io.*;
class Third_list
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
		if(head == null){
			head = new Node(data);
			temp = head;
		}
		else{
			temp.next = new Node(data);
			temp = temp.next;
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Third_list list = new Third_list();
		list.head = null;
		list.temp = null;
		int n = sc.nextInt();
		while(n>0)
		{
			int data = sc.nextInt();
			list.push(data);
			n--;
		}
		list.temp = list.head;
		while(list.temp!=null)
		{
			System.out.println(list.temp.data);
			list.temp = list.temp.next;
		}

	}
}