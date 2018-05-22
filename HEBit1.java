//    ===============Subham and Binary Strings========================
import java.io.*;
import java.util.*;
class HEBit1{
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
		StringBuilder sb= new StringBuilder("");
		while(t-->0){
			int n = fr.nextInt();
			char[] ch = fr.next().toCharArray();
			int count=0;
			for(int i=0;i<n;i++){
				if(ch[i]=='0') count++;
			}
			sb.append(count).append("\n");
		}
		System.out.print(sb.toString());
	}
}