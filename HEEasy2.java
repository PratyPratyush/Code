import java.io.*;
import java.util.*;
class HEEasy2{
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
		long nextDouble()throws IOException{
			return Long.parseLong(next());
		}
	}
	public static void main(String args[])throws IOException{
		FastReader fr =new FastReader();
		int t =fr.nextInt();
		HashMap<Integer,Integer> hm =new HashMap<Integer,Integer>();
		while(t-->0){
			int a = fr.nextInt();
			int b= fr.nextInt();
			for(int i=a;i<=b;i++){
				if(hm.containsKey(i))
					hm.put(i,hm.get(i)+1);
				else
					hm.put(i,1);
			}
		}
		//System.out.println(hm);
		int value=-1;
		int count=-1;
		for(Map.Entry<Integer,Integer> e:hm.entrySet()){
			if(value==-1){
				value = e.getKey();
				count = e.getValue();
			}
			else{
				if(count<e.getValue()){
					value = e.getKey();
					count = e.getValue();
				}
				else if(count==e.getValue()&&value>e.getKey()){
					value = e.getKey();
					count = e.getValue();
				}
			}
		}
		System.out.println(value+" "+count);
	}
}