//===============CodeCheaf=================
//========== Dementia (Rated for Division 2)==================
//=========Strings =========================

import java.io.*;
import java.util.*;
class Code1{
	static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br =new BufferedReader(new InputStreamReader(System.in));
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
		StringBuilder sb =new StringBuilder("");
		StringBuilder sb2 =new StringBuilder("");
		char[] ch =fr.next().toCharArray();
		long value=0;
		long pw=ch.length-1;
		int count=0;
		for(int i=0;i<ch.length;i++){
			if(ch[i]=='1') {value+=Math.pow(2,pw);count++;}
			pw--;
		}
		if(count==1){
			System.out.println(String.valueOf(ch)+" "+"0");
		}
		else{
			//System.out.print("1");
			sb2.append("1");
		for(int i=0;i<ch.length;i++)
			sb2.append("0");
		System.out.print(sb2.toString());
		System.out.print(" ");
		int n = ch.length;
		long a=1<<n;
		long b = a-value;
		long c=2;
		while(b>0){
			if(b%c==0) sb.append("0");
			else sb.append("1");
			b=b/2;
		}
		sb =sb.reverse();
		System.out.println(sb.toString());
		}
	}
}