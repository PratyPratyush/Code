import java.util.*;
import java.io.*;
class Missing_number
{
	public static void main(String args[])
	{
		 Scanner sc = new Scanner(System.in);
		 int t = sc.nextInt();
		 while(t>0)
		 {
		 	int temp = 0;
		 	int n = sc.nextInt();
		 	int[] arr = new int[n-1];
		 	for(int i=0;i<arr.length;i++)
		 	{
		 		arr[i] = sc.nextInt();
		 	}
		 	Arrays.sort(arr);
		 	// for(int i=0;i<n;i++)
		 	// {
		 	// 	System.out.println(arr[i]);
		 	// }
		 	for(int i=0;i<arr.length-1;i++)
		 	{
		 		if(arr[i]+1 != arr[i+1])
		 		{
		 			// System.out.println("Inside");
		 			temp = arr[i]+1;
		 			break;
		 		}
		 	}
		 	if(temp != 0)
		 		System.out.println(temp);
		 	t--;
		 }
		

	}
}