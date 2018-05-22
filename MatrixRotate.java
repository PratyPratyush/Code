//
import java.io.*;
import java.util.*;
class MatrixRotate{
	static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br =new BufferedReader(new InputStreamReader(System.in));
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
	public static void main(String args[])throws IOException{
		FastReader fr =new FastReader();
		int t = fr.nextInt();
		while(t-->0){
		int n = fr.nextInt();
		int[][] arr = new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				arr[i][j]=fr.nextInt();
			}
		}
		for(int i=0;i<n/2;i++){
			for(int j=i;j<n-1-i;j++){
				int tem= arr[j][i];
				arr[j][i]=arr[n-1-i][j];
				arr[n-1-i][j]=arr[n-1-j][n-1-i];
				arr[n-1-j][n-1-i]=arr[i][n-1-j];
				arr[i][n-1-j]=tem;
			}
		}
		//System.out.println(" ");
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		int value = arr.length;
		System.out.println(value);
	}
	}
}