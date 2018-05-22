//
import java.io.*;
import java.util.*;
class PriorityDemo1{
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
		int t = fr.nextInt();
		while(t-->0){
			int n = fr.nextInt();
			int a=0;
			HashMap<Integer,Integer> hm =new HashMap<Integer,Integer>();
			for(int i=0;i<n;i++){
				a = fr.nextInt();
				if(hm.containsKey(a))
					hm.put(a,hm.get(a)+1);
				else
					hm.put(a,1);
			}
			System.out.println(hm);
			PriorityQueue<Map.Entry<Integer,Integer>> pq =new PriorityQueue<>(10,new Comparator<Map.Entry<Integer,Integer>>(){
				public int compare(Map.Entry<Integer,Integer> p1,Map.Entry<Integer,Integer> p2){
					return p2.getValue().compareTo(p1.getValue());
				}
			});
			for(Map.Entry<Integer,Integer> e:hm.entrySet()){
			    pq.add(e);
			}
			while(pq.size()>0){
			    Map.Entry<Integer,Integer> temp = pq.poll();
			    System.out.println(temp.getKey()+" "+temp.getValue());
			}
		}
	}
}