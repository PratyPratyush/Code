//=======
import java.io.*;
import java.util.*;
class CookOffMarch{
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
		long nextLong()throws IOException{
			return Long.parseLong(next());
		}
	}
	public static void main(String args[])throws IOException{
		FastReader fr =new FastReader();
		int t = fr.nextInt();
		int[][] arr =new int[105][105];
		while(t-->0){
			int n = fr.nextInt();
			int m = fr.nextInt();
			boolean bad = false;
			for(int i=1;i<=n;i++){
				for(int j=1;j<=m;j++){
					arr[i][j]=fr.nextInt();
					int b = Math.max(arr[i-1][j],arr[i][j-1]);
					b = Math.max(1,b);
					if(arr[i][j]==-1)
						arr[i][j]=b;
					else if(arr[i][j]<b){
						bad=true;break;
					}
				}
				if(bad) break;
			}
			if(bad)
				System.out.println(-1);
			else{
				for(int i=1;i<=n;i++){
					for(int j=1;j<=m;j++){
						System.out.print(arr[i][j]+" ");
					}
					System.out.println(" ");
				}
			}
		}
	}
}