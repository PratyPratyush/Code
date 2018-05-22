//
import java.io.*;
import java.util.*;
class CookOff2{
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
			long n = fr.nextLong();
			long prev=0;
			long current=0;
			for(int i=0;;i++){
				current=prev+i+1;
				if(n>=prev&&n<=current){
					if(n==prev) System.out.println(i);
					else if(n==current) System.out.println(i+1);
					else{
						long a=n-prev;
						long b = current-n;
						if(a==b) System.out.println(a+i);
						else if(a<b) System.out.println((a)+i);
						else System.out.println(i+1+b);
					}
					break;
				}
				prev=current;
			}
		}
	}
}