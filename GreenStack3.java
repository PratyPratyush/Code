//
import java.io.*;
import java.util.*;
class GreenStack3{
	static class FastReader{
		BufferedReader br;
		StringTokenizer st;
		public FastReader(){
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		String next()throws IOException{
			while(st==null||!st.hasMoreTokens()){
				st = new StringTokenizer(br.readLine());
			}
			return st.nextToken();
		}
		int nextInt()throws IOException{
			return Integer.parseInt(next());
		}
	}
	static int check=1;
	static boolean valid(int x,int y,int n){
		if((x>=0&&x<=n-1)&&(y>=0&&y<=n-1))
			return true;
		return false;
	}
	static int value(int x,int y,int[][] arr,int value,int n){
		int r=0;int d=0;
		if(!(valid(x,y,n)&&arr[x][y]<value)){
			if(check!=1) return 0;
		}
		check=2;
		r = value(x,y+1,arr,value,n);
		d = value(x+1,y,arr,value,n);
		return (r>d?r:d)+1;
	}
	static void fun(int n,int[][] arr){
		//int[][] cal = new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				int value = arr[i][j];
				check=1;
				int v =value(i,j,arr,value,n);
				System.out.print(v+" ");
			}
			System.out.println(" ");
		}
		// for(int i=0;i<n;i++){
		// 	for(int j=0;j<n;j++){
		// 		System.out.print(cal[i][j]+" ");
		// 	}
		// 	System.out.println(" ");
		// }
	}
	public static void main(String args[])throws IOException{
		FastReader fr =new FastReader();
		int n = fr.nextInt();
		int[][] arr =new int[n][n];
		int[][] cl = new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				arr[i][j]=fr.nextInt();
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(arr[i][j]+" "); 
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		fun(n,arr);
	}
}