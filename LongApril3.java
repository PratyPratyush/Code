//
import java.io.*;
import java.util.*;
class LongApril3{
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
    } 
	public static void main(String args[])throws IOException{
		FastReader fr =new FastReader();
		int t = fr.nextInt();
		StringBuilder sb =new StringBuilder("");
		while(t-->0){
			char[] ch = fr.next().toCharArray();
			int n = fr.nextInt();
			int a=0,b=0;
			int count=0;
			for(int i=0;i<n;i++){
				for(int j=0;j<ch.length;j++){
					if(ch[j]=='b') b++;
					else a++;
					if(a>b) count++;
				}
			}
			//System.out.println(count);
			sb.append(count).append("\n");
		}
		System.out.print(sb.toString());
	}
}