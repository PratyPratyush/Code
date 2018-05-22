//============Rajan and Odd frequency number===================
import java.io.*;
import java.util.*;
class HEBit3{
	static class FastReader{
		BufferedReader br;
		StringTokenizer st;
		public FastReader(){
			br =new BufferedReader(new InputStreamReader(System.in));
		}
		String next()throws IOException{
			while(st==null||!st.hasMoreTokens()){
				st =new StringTokenizer(br.readLine());
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
		int n = 2*t+1;
		int p=0;
		for(int i=0;i<n;i++){
			int a = fr.nextInt();
			p=p^a;
		}
		System.out.println(p);
	}
}