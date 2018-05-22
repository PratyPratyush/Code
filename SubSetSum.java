import java.io.*;
import java.util.*;
class SubSetSum{
	static boolean fun(int[] arr,int p){
		int row = arr.length+1;
		int col = p+1;
		boolean[][] check = new boolean[row][col];
		for(int i=1;i<col;i++)
			check[0][i]=false;
		for(int i=0;i<row;i++)
			check[i][0]=true;
		for(int i=1;i<row;i++){
			for(int j=1;j<col;j++){
				if(arr[i-1]>j)
					check[i][j]=check[i-1][j];
				else if(check[i-1][j]==true)
					check[i][j]=true;
				else
					check[i][j]=check[i-1][j-arr[i-1]];
			}
		}
		System.out.println("Printing Part");
		for(int i=1;i<row;i++){
			for(int j=1;j<col;j++){
				System.out.print(check[i][j]+" ");
			}
			System.out.println(" ");
		}
		return check[row-1][col-1];
	}
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr =new int[n];
		int sum=0;
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		if(sum%2!=0)
			System.out.println("No");
		else{
			boolean b = fun(arr,sum/2);
			System.out.println(b);
		}

	}
}