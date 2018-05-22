import java.util.*;
import java.lang.*;
import java.io.*;
class KnapSack
 {
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
	public static void main (String[] args)throws IOException{
	    FastReader fr =new FastReader();
	    int t =fr.nextInt();
	    while(t-->0){
	        int n = fr.nextInt();
	        int m=fr.nextInt();
	        int[] value = new int[n];
	        int[] wt = new int[n];
	        for(int i=0;i<n;i++) value[i]=fr.nextInt();
	        for(int i=0;i<n;i++) wt[i]=fr.nextInt();
	        int[][] arr =new int[n+1][m+1];
	        for(int i=0;i<=n;i++){
	            for(int j=0;j<=m;j++){
	                if(i==0||j==0)
	                    arr[i][j]=0;
	               else if(wt[i-1]>j) arr[i][j]=arr[i-1][j];
	               else{
	                   arr[i][j]=Math.max(value[i-1]+arr[i-1][j-wt[i-1]],arr[i-1][j]);
	               }
	            }
	        }
	        for(int i=0;i<=n;i++){
	            for(int j=0;j<=m;j++){
	                System.out.print(arr[i][j]+" ");
	            }
	            System.out.println(" ");
	        }
	        System.out.println(arr[n][m]);
	    }
	 }
}