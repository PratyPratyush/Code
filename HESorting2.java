//==============Bubble Sort==================
//=======Shubham and Xor==============
import java.io.*;
import java.util.*;
class HESorting2{
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
		HashMap<Long,Long> hm =new HashMap<Long,Long>();
        int n = fr.nextInt();
        for(int i=0;i<n;i++){
            long a = fr.nextLong();
            if(hm.containsKey(a))
                hm.put(a,(long)hm.get(a)+1);
            else
                hm.put(a,(long)1);
        }
        long sum=0;
        for(Map.Entry<Long,Long> e:hm.entrySet()){
            if(e.getValue()>=2){
                long  p =  e.getValue()-1;
                sum=sum+((p*(p+1))/2);
            }
        }
        System.out.println(sum);
	}
}