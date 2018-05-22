import java.util.*;
import java.io.*;
class Amazon
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int mid = 0;
		int m = 0;
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		m = arr[n-1];
		m = m+1;
		if(m%2 == 0)
		{
			if(m==2)
				mid = 0;
			else{
				mid = m-4;
				mid = (mid+2)*2+m;
			}
		}
		else{
			if(m==1)
				mid = 0;
			else{
				mid = m-3;
				mid = (mid+1) *2+m;
			}
		}
		if(mid>0)
		{
			//System.out.println(n-2);
			//try{
				for(int i=n-2;i>=0;i--)
				{
					mid = (arr[i]+1)*mid;
				}	
			//}
			//catch(ArrayIndexOutOfBoundsException e){
			//	System.out.println(n-2);
			//}
			
		}
		System.out.println(mid);
	}
}