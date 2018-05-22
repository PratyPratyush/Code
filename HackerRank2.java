//
import java.io.*;
import java.util.*;
class HackerRank2{
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
		int t = fr.nextInt();
		long cal=0;
		while(t-->0){
			String s = fr.next();
			long value=fr.nextLong();
			if(s.equals("add")&&(value>0)){
				cal+=value;
			}
			else if(s.equals("set")&&(value>cal)){
				cal=value;
			}
			else{

			}
		}
		System.out.println(cal);
	}
}