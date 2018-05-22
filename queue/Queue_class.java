import java.util.*;
import java.io.*;
class Queue_class
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		q.add(1);
		q.add(2);
		q.add(3);
		System.out.println(q.poll());
		System.out.println(q.isEmpty());
		System.out.println(q.size());
		System.out.println(q.peek());
	}
}