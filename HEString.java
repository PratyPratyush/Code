import java.io.*;
import java.util.*;
class HEString {
    static class FastReader{
		BufferedReader br;
		StringTokenizer st;
		public FastReader(){
			br = new BufferedReader(new InputStreamReader(System.in));
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
    public static void main(String args[] ) throws Exception {
     FastReader fr= new FastReader();
     int n = fr.nextInt();
     int[] arr = new int[n];
     for(int i=0;i<n;i++){
         arr[i]=fr.nextInt();
     }
     int max=1;
     int count=1;
     for(int i=1;i<n;i++){
         if(arr[i]==arr[i-1]) {count++;
            System.out.println("hello"+" "+count);
         }
         else{
             //System.out.println("byeee"+" "+count);
             if(count>max) max=count;
             count=1;
         }
     }
     //if(count>max) max=count;
     System.out.println(max+" "+count);

    }
}
