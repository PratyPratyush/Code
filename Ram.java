//
import java.io.*;
import java.util.*;

class Ram{
	static public fun(int n,int m,int x[][]){
		int arr2 = new int[n+1];
		int arr = new int[n+1];
		for(int i=1;i<n+1;i++){
			arr2[i]=1;
		}
		for(int i=0;i<m;i++){
			arr[x[i][0]] = x[i][1];
		}
		
		

	}
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();
		int m = sc.nextInt();
		int[][] x = new int[m][3];
		for(int i=0;i<m;i++){
			x[i][0] = sc.nextInt();
			x[i][1]=sc.nextInt();
			x[i][2]=sc.nextInt();
		}
		
		
		
	}
}