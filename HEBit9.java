//====================Jarvis and Lone Integer=================

import java.io.*;
import java.util.*;
class HEBit9{
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
		int t =fr.nextInt();
		while(t-->0){
			int n = fr.nextInt();
			long sum=0;
			while(n-->0){
				long a=fr.nextLong();
				sum=sum^a;
			}
			if(sum==0) System.out.println(-1);
			else System.out.println(1);
		}
	}
}