//
import java.io.*;
import java.util.*;
class CookOff1{
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
		while(t-->0){
			int n = fr.nextInt();
			long sum1=0,sum2=0;
			int max=-1;
			int a=0;
			for(int i=0;i<n;i++){
				a = fr.nextInt();
				sum1+=a;
				if(max<a) max=a;
			}
			sum1-=max;
			//System.out.println(sum1);
			max=-1;
			for(int i=0;i<n;i++){
				a = fr.nextInt();
				sum2+=a;
				if(max<a) max=a;
			}
			sum2-=max;
			//System.out.println(sum2);
			if(sum1<sum2) System.out.println("Alice");
			else if(sum1>sum2) System.out.println("Bob");
			else System.out.println("Draw");
		}
	}
}