import java.io.*;
import java.util.*;
class HackerRank3{
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
		int t =fr.nextInt();
		//System.out.println("hello");
		while(t-->0){
			//System.out.println("hello");
			int sum=0;int result=0;
			for(int i=0;i<26;i++){
				int a = fr.nextInt();
				//System.out.print(a+" ");
				sum+=a;
			}
			//System.out.println(" ");
			if(sum%2==0){
				result = (sum/2)-1;
			}
			else result = sum/2;
			System.out.println(result);
		}
	}
}