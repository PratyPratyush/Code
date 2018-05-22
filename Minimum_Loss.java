import java.util.*;
import java.io.*;
class Minimum_Loss
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] short_arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
			short_arr[i] = arr[i];

		}
		Arrays.sort(short_arr);
		int min = 0;
		for (int i=0;i<short_arr.length-1 ;i++ ) 
		{
			boolean test1 = true;
			boolean test2 = true;
			int a = short_arr[i];
			int b = short_arr[i+1];
			int position_a =0;
			int position_b = 0;
			for(int j=0;j<arr.length;j++)
			{
				if(test1)
				{

					if(a == arr[j]){
						position_a = j;
						test1 = false;
					}
				}
				if(test2)
				{
					if(b == arr[j]){
						position_b = j;
						test2 = false;
					}
				}
				if(test1 == false && test2 == false){
					break;
				}
			}
			if(position_a > position_b)
			{

				if(min == 0){
					min = b-a;
				}
				else if(b-a<min){
					min = a-b;
				}
			}
		
		}
		System.out.println(min);
	//	List al = Arrays.asList(arr);
		//System.out.println(al+" ");
		//String s = new String(arr)
		//String arr_not_sort = Arrays.toString(arr);
		//int min = 0;
		//String s = Arrays.toString(short_arr);
		//System.out.println(s);
		//System.out.println(arr_not_sort);
		// for(int i=0;i<s.length-1;i++)
		// {
		// 	int a = Integer.parseInt(charAt(i));
		// 	int b = Integer.parseInt(charAt(i+1));
		// 	if(arr_not_sort.indexOf(s.charAt(i))<arr_not_sort.indexOf(s.charAt(i+1)))
		// 	{

		// 	}
		// 	if(min>a-b)
		// 	{

		// 	}
		// }
		// System.out.println(s);
		//-----------------------------------------
		// int i=0;
		// int a = arr_not_sort.indexOf(s.charAt(i+1));
		// System.out.println(a);
		// System.out.println(s.charAt(i+1));
		// int b = arr_not_sort.indexOf(s.charAt(i),a);
		// System.out.println(b);
		// if(a<b)
		// {
		// 	System.out.println("Yes");
		// }
		// else{
		// 	System.out.println("No");
		// }
	}
}