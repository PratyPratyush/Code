//
import java.io.*;
import java.util.*;
class HEGraph{
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
		int n = fr.nextInt();
		int[][] arr =new int[n+1][n+1];
		int e =fr.nextInt();
		
		for(int i=0;i<e;i++){
			int x = fr.nextInt();
			int y = fr.nextInt();
			arr[x][y]=1;arr[y][x]=1;
		}
		int q =fr.nextInt();
		for(int i=0;i<q;i++){
			int a = fr.nextInt();
			int b = fr.nextInt();
			if(arr[a][b]==1) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}