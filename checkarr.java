import java.util.*;
import java.io.*;
class checkarr
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		 int r = sc.nextInt();
		 int c = sc.nextInt();
		 int t = sc.nextInt();
		 int[][] arr = new int[r][c];
		 int[] sum = new int[r];
		 for(int i=0;i<arr.length;i++)
		 {
		 	sum[i] = c; 
		 }
		 for(int i=0;i<t;i++)
		 {
		 	int wch_row = sc.nextInt();
		 	int c1 = sc.nextInt();
		 	int c2 = sc.nextInt();
		 	for(int j=c1-1;j<c2;j++)
		 	{
		 		if(arr[wch_row-1][j]!=1)
		 		{
		 			arr[wch_row-1][j] = 1;
		 			sum[wch_row-1] = sum[wch_row-1]-1;

		 		}
		 	}
		 	
		 }
		 long s=0;
		 for(int p=0;p<sum.length;p++)
		 {
		 	s = sum[p]+s;
		 }
		 System.out.println(s);
		 
		// int[][] arr = new int[3][4];
		// arr[1][2] = 5;
		
	}
}