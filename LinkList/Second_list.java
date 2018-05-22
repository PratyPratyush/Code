import java.util.*;
import java.io.*;
class Second_list
{
	Node head,temp;
	class Node
	{
		int data;
		Node next;
		Node(int item){
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
		else
		{
			temp.next = new Node(data);
			temp = temp.next;
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Second_list ob = new Second_list();
		int n = sc.nextInt();
		ob.head = null;
		ob.temp = null;
		while(n>0){
			int data = sc.nextInt();
			ob.push(data);
			n--;
		}
		ob.temp = ob.head;
		while(ob.temp!=null){
			System.out.print(ob.temp.data);
			ob.temp = ob.temp.next;
			if(ob.temp != null)
				System.out.print("->");
		}
		System.out.println(" ");
	}
}