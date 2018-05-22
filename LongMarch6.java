import java.io.*;
import java.util.*;
class LongMarch6{
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
	static void fun(int value,TreeMap<Integer,Integer> hm){
			if(hm.containsKey(value))
				hm.put(value,hm.get(value)+1);
			else hm.put(value,1);
	}
	public static void main(String args[])throws IOException{
		FastReader fr =new FastReader();
		int t = fr.nextInt();
		StringBuilder sb =new StringBuilder("");
		while(t-->0){
			int n = fr.nextInt();
			long[] arr1 = new long[n];
			long[] arr2 =new long[n];
			TreeMap<Integer,Integer> hm =new TreeMap<Integer,Integer>();
			arr1[0]=fr.nextLong();
			arr2[0]=arr1[0];
			hm.put(0,0);
			for(int i=1;i<n;i++){
				arr1[i]=fr.nextLong();
				arr2[i]=arr2[i-1]+arr1[i];
				hm.put(i,0);
			}
			for(int i=0;i<n;i++){
				if(i-1>=0)
					fun(i-1,hm);
				if(i+1<n)
					fun(i+1,hm);
				for(int j=i+2;j<n;j++){
					long value= arr2[j]-(arr2[i]+arr1[j]);
					if(value<=arr1[i])
						fun(j,hm);
					if(value<=arr1[j])
						fun(i,hm);
				}
			}
			for(Map.Entry<Integer,Integer> e:hm.entrySet()){
				sb.append(e.getValue()).append(" ");
			}
			sb.append("\n");

			//System.out.println(hm);
		}
		System.out.print(sb.toString());
	}
}