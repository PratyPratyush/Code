//  ================Escape the Night===================
import java.io.*;
import java.util.*;
class HEBit5{
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
			long n=fr.nextLong();
			long i=3;
			long sum=0;
			while(i<=n){
				if(i%2==0){
					if(((i)&(i-1))>0){
						sum=(sum+i)%100000007;
					}
				}
				else{
					sum=(sum+i)%100000007;
				}
				i++;
			}
			System.out.println(sum);
		}
	}
}