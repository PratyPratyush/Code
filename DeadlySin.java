//
import java.io.*;
import java.util.*;
class DeadlySin{
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
    static int gcd(int a,int b){
    	if(a%b==0)
    		return b+b;
    	return gcd(b,a%b);
    }
	public static void main(String args[])throws IOException{
		FastReader fr =new FastReader();
		int t =fr.nextInt();
		while(t-->0){
			int a = fr.nextInt();
			int b =fr.nextInt();
			int value=gcd(a,b);
			System.out.println(value);
		}
	}
}