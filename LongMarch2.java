import java.io.*;
import java.util.*;
class LongMarch2{
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
		long nextLong()throws IOException{
			return Long.parseLong(next());
		}
		double nextDouble()throws IOException{
			return Double.parseDouble(next());
		}
	}
	public static void main(String args[])throws IOException{
		FastReader fr =new FastReader();
		int t =fr.nextInt();
		StringBuilder sb =new StringBuilder("");
		while(t-->0){
			int n = fr.nextInt();
			double cal=0.0;
			while(n-->0){
				double p=fr.nextDouble();
				double q =fr.nextDouble();
				double d =fr.nextDouble();
				double value= p+(p*d)/100;
				//System.out.println(value);
				value = value-(value*d)/100;
				//System.out.println(value);
				//System.out.println((p-value)*q);
				cal=cal+(p-value)*q;
				// System.out.println(cal);
				//System.out.println("========");
			}
			sb.append(cal);
 			String s = String.valueOf(cal);
			if(s.length()<12){
			    for(int i=1;i<=12-s.length();i++){
			        sb.append(0);
			    }
			     sb.append("\n");
			}
			else sb.append("\n");
		}
		System.out.print(sb.toString());
	}
}