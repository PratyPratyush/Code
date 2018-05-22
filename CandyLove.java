//==========Code cheaf CandyLove competiton============
import java.io.*;
import java.util.*;
class CandyLove{
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
		int t =fr.nextInt();
		while(t-->0){
			int n = fr.nextInt();
			int odd=0;
			for(int i=0;i<n;i++){
				int a = fr.nextInt();
				if(a%2!=0) odd++;
			}
			if(odd%2!=0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}