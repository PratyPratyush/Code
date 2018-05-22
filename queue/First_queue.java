import java.io.*;
import java.util.*;
class First_queue
{
	int front,rear,n;
	 void enque_data(int[] arr,int value)
	 {
	 	if(front==-1&&rear==-1)
	 	{
	 		front = rear = 0;
	 		arr[rear] = value;
	 	}
	 	else{
	 		rear = (rear+1)%n;
	 		if(rear == front)
	 			System.out.println("Queue is Overflow");
	 		else
				arr[rear] = value;
	 	}
	 }
	 void deque_data(int[] arr)
	 {
	 	if(front==-1&&rear==-1)
	 	{
	 		System.out.println("Queue is Underflow");
	 	}
	 	else if (front == rear) {
	 		arr[front] = 0;
	 		front = rear = -1;
	 	}
	 	else
	 	{
	 		arr[front] = 0;
	 		front = (front+1)%n;
	 	}
	 }
	 void print_fun(int[] arr)
	 {
	 	for(int i=0;i<n;i++)
	 	{
	 		System.out.print(arr[i]+" ");
	 	}
	 	System.out.println(" ");
	 }
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		First_queue q = new First_queue();
		q.n = sc.nextInt();
		int[] arr = new int[q.n];
		q.front = -1;
		q.rear = -1;
		boolean check = true;
		// for(int i=0;i<n;i++){
		// 	arr[i] = sc.nextInt();
		// }
		while(check)
		{
			
			while(check)
			{
				System.out.println("For Enque 1");
				System.out.println("For Deque 2");
				System.out.println("For exit 3");
				System.out.println("For printl 4");
				int value = sc.nextInt();
				switch(value)
				{
					case 1:
						int data = sc.nextInt();
						q.enque_data(arr,data);
						break;
					case 2:
						q.deque_data(arr);
						break;
					case 3:
						check = false;
						break;
					case 4:
						q.print_fun(arr);
						break;
					default:
						System.out.println("Your input is wrong");
						break;
				}	
			}			
		}
	}
}