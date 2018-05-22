//=====BooBoo and Upsolving============
import java.io.*;
import java.util.*;
class HEBSearch2{
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
		int n =fr.nextInt();
		long[] arr =new long[n];
		int t = fr.nextInt();
		int sum=0;
		long max=-1;
		for(int i=0;i<n;i++){
			arr[i]=fr.nextLong();
			if(max<arr[i]) max=arr[i];
		}
		if(sum%t==0) System.out.println(sum/t);
		else System.out.println((sum/t)+1);
	}
}