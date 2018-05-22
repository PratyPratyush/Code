import java.util.*;
import java.io.*;
// class Node
// {
// 	int data;
// 	Node next;
// 	void
// }
class First_Linklist
{
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		First_Linklist l_list = new First_Linklist();
		l_list.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		l_list.head.next = second;
		second.next = third;
		Node point = l_list.head;
		while(point!=null)
		{
			System.out.println(point.data);
			point = point.next;
		}

	}
}