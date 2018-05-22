import java.io.*;
import java.util.*;
class Row_min_1s
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[][] arr = new int[n][m];
			int[] a = new int[n];
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<m;j++)
				{
					int p = sc.nextInt();
					arr[i][j] = p;
					if(p==1){
						a[i] = a[i]+1;
					}
				}
			}
			int value = 0,index = -1;
			for(int i=0;i<n;i++)
			{
				if(value==0&&a[i]>0){
					index =i;
					value = a[i];
				}
				else if (a[i]<value&&a[i]!=0) {
					index = i;
					value = a[i];
				}
				// System.out.print(a[i]+" ");
			}
			System.out.println(index);
			//System.out.println(" ");
			t--;
		}
		
	}
}