import java.io.*;
import java.util.*;
class W1{
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
	public static void main(String arsg[]){
		FastReader fr =new FastReader();
		int t = fr.nextInt();
		String s = fr.next();
	}
}