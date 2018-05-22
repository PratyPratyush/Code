//  ===============Maximum AND==================
import java.io.*;
import java.util.*;
class HEBit4{
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
			long a= fr.nextLong();
			long b=fr.nextLong();
			long result=0;
			if(b%2==0){
				if(b-2>=a){
					result=(b-1)&(b-2);
				}
				else{
					result=a&b;
				}
			}
			else{
				result=(b-1)&b;
			}
			System.out.println(result);
		}
	}
}