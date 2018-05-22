import java.io.*;
import java.util.*;
class LongMarch3{
	static class FastReader{
		BufferedReader br;
		StringTokenizer st;
		public FastReader(){
			br =new BufferedReader(new InputStreamReader(System.in));
		}
		String next()throws IOException{
			while(st==null||!st.hasMoreTokens()){
				st =new StringTokenizer(br.readLine());
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
		StringBuilder sb =new StringBuilder("");
		while(t-->0){
			int n = fr.nextInt();
			HashMap<Integer,Integer> hm =new HashMap<Integer,Integer>();
			while(n-->0){
				int v = fr.nextInt();
				if(hm.containsKey(v))
					hm.put(v,hm.get(v)+1);
				else
					hm.put(v,1);
			}
			int count=0;
			for(Map.Entry<Integer,Integer> e:hm.entrySet()){
				if(e.getValue()>1){
					count=count+(e.getValue()-1);
				}
			}
			sb.append(count).append("\n");
		}
		System.out.print(sb.toString());
	}
}