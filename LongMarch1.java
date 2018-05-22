import java.io.*;
import java.util.*;
class LongMarch1{
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
		StringBuilder sb =new StringBuilder("");
		while(t-->0){
			int n = fr.nextInt();
			int[] fig =new int[n];
			int[] slev = new int[n];
			for(int i=0;i<n;i++)
				fig[i]=fr.nextInt();
			for(int i=0;i<n;i++)
				slev[i]=fr.nextInt();
			int j=n-1;
			boolean check1=true;
			boolean check2=true;
			for(int i=0;i<n;i++,j--){
				if(check1){
					if(fig[i]>slev[i])
						check1=false;
				}
				if(check2){
					if(fig[i]>slev[j])
						check2=false;
				}
			}
			if(check1==false&&check2==false)
				sb.append("none").append("\n");
			else if(check1==true&&check2==true)
				sb.append("both").append("\n");
			else if(check1) sb.append("Front").append("\n");
			else sb.append("back").append("\n");
		}
		System.out.print(sb.toString());
	}
}