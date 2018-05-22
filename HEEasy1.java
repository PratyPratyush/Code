import java.io.*;
import java.util.*;
class HEEasy1{
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
    static int no_bit(long n){
    	int count=0;
    	while(n>0){
    		count++;
    		n=n>>1;
    	}
    	return count;
    }
	public static void main(String args[])throws IOException{
		FastReader fr=new FastReader();
		int len=1001;
		int[] arr =new int[len];
		for(int i=1;i<len;i++){
			int co=0;
			int ch=i;
			while(ch>0){
				co++;
				ch=ch>>1;
			}
			arr[i]=co;
		}
		// for(int i=0;i<=10;i++){
		// 	System.out.print(arr[i]+" ");
		// }
		// System.out.println(" ");
		int t =fr.nextInt();
		while(t-->0){
			long n = fr.nextLong();
			long value=1;
			int count=0;
			while(value<=n){
				int count1=0;int count2=0;
				long r = n/value;
				if(r<=1000) count1=arr[(int)r];
				else count1 = no_bit(r);
				if(value<=1000) count2=arr[(int)value];
				else count2 = no_bit(value);
				if(count2>=count1) count++;
				value++;
			}
			System.out.println(count);
		}
	}
}