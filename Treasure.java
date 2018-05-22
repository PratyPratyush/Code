import java.io.*;
import java.util.*;
class Treasure{
	static void fun(int[][] arr,int i,int j,int value,int m,int n){

		if(i>m-1||i<0||j>n-1||j<0)
			return;
		value = value+arr[i][j];
		//System.out.println("hello"+" "+value);
		if(value>max) max=value;
		fun(arr,i,j+1,value,m,n);
		fun(arr,i-1,j,value,m,n);
	}
	static int max=-1;
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] arr =new int[m][n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.print("\n");
		}
		fun(arr,m-1,0,0,m,n);
		System.out.println(max);
	}
}