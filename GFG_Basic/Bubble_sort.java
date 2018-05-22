import java.util.*;
import java.io.*;
class Bubble_sort
{
	void sorting(int arr[],int index)
	{
		for(int i=arr.length;i>1;i--)
		{
			for(int j=0;j<i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					if(j == index){
						index = index+1;
					}
					else if(j+1 == index){
						index = index-1;
					}
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(index);
	}
	void printElement(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
	}
	public static void main(String args[])
	{
		Bubble_sort bs = new Bubble_sort();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int index = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		bs.sorting(arr,index);
		System.out.println("Sorted order");
		bs.printElement(arr);
	}
}