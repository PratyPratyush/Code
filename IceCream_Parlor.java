import java.util.*;
import java.io.*;
class IceCream_Parlor
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int p1=0,p2=0;
		boolean test1=true,test2=true;
		int t = sc.nextInt();
		while(t>0)
		{
			test1 = true;
			test2=true;
			p1=0;
			p2=0;

		int m = sc.nextInt();
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] arr_sort = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
			arr_sort[i] = arr[i];
		}
		Arrays.sort(arr_sort);
		m = m-arr_sort[0];
		for(int i=0;i<n;i++)
		{
			if(test1)
			{
				if(arr_sort[0]==arr[i])
				{
					p1=i+1;
					test1 = false;	
				}
				
			}
			else if(test2)
			{
				if(m==arr[i])
				{
					test2 = false;
					p2 = i+1;
				}
			}
		}
		if(p1<p2)
			System.out.print(p1+" ");
		else
			System.out.print(p2+" ");
		if(p1<p2)
			System.out.println(p2);
		else
			System.out.println(p1);
		t--;
		}
	}
}