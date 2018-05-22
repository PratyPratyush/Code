import java.io.*;
import java.util.*;
class LunchTimeMarch3{
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
		while(t-->0){
			int n =fr.nextInt();
			int k =fr.nextInt();
			int[] arr =new int[n];
			int sum=0;
			for(int i=0;i<n;i++){
				arr[i]=fr.nextInt();
				sum+=arr[i];
			}
			int count=0;
			for(int i=0;i<n;i++){
				if((sum-arr[i])<(arr[i]+k))
					count++;
			}
			System.out.println(count);
		}
	}
}