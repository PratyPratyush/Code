import java.io.*;
import java.util.*;
class HEEasy{
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
		long nextDouble()throws IOException{
			return Long.parseLong(next());
		}
	}
	public static void main(String args[])throws IOException{
		FastReader fr =new FastReader();
		int t =fr.nextInt();
		while(t-->0){
			double h = fr.nextDouble();
			double x = fr.nextDouble();
			double z = fr.nextDouble();
			double t1 = x/z;
			double t2 = Math.sqrt((h*2)/32);
			if(t1==t2) System.out.println("Rahul");
			else if(t1<t2) System.out.println("Rahul");
			else System.out.println("Raj");
			//System.out.println(t1+" "+t2);
		}
	}
}