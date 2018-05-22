import java.io.*;
import java.util.*;
class Code2{
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
		while(t-->0){
			int n = fr.nextInt();
			int k =fr.nextInt();
			HashMap<Integer,Integer> hm =new HashMap<Integer,Integer>();
			for(int i=0;i<n;i++){
				int value=fr.nextInt();
				if(hm.containsKey(value))
					hm.put(value,hm.get(value)+1);
				else
					hm.put(value,1);
			}
			long sum=0;
			boolean check=true;
			for(Map.Entry<Integer,Integer> e:hm.entrySet()){
				if(e.getValue()==k){sum+=e.getKey();check=false;} 
			}
			//System.out.println(hm);
			if(check) System.out.println(-1);
			else System.out.println(sum);
		}
	}
}