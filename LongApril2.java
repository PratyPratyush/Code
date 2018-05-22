//
import java.io.*;
import java.util.*;
class LongApril2{
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
		StringBuilder sb =new StringBuilder("");
		while(t-->0){
			int n =fr.nextInt();
			int[] arr =new int[n];
			int odd=0;int even=0;
			HashSet<Integer> hs =new HashSet<Integer>();
			for(int i=0;i<n;i++){
				arr[i]=fr.nextInt();
				if(arr[i]%2==0) even++;
				else odd++;
				hs.add(arr[i]);
			}
			//System.out.println(hs);
			int[] ev = new int[even];
			int[] od =new int[odd];
			int o=0,e=0;
			for(int i=0;i<n;i++){
				if(arr[i]%2==0){
					ev[e]=arr[i];e++;
				}
				else{
					od[o]=arr[i];o++;
				}
			}
			// for(int i=0;i<ev.length;i++)
			// 	System.out.print(ev[i]+" ");
			// System.out.println(" ");
			// for(int i=0;i<od.length;i++)
			// 	System.out.print(od[i]+" ");
			// System.out.println(" ");
			int count=0;
			for(int i=0;i<even-1;i++){
				for(int j=i+1;j<even;j++){
					int value = ev[i]+ev[j];
					if(((value)%2==0)&&hs.contains(value/2)){
						count++;
					}
				}
			}
			for(int i=0;i<odd-1;i++){
				for(int j=i+1;j<odd;j++){
					int value = od[i]+od[j];
					if(((value)%2==0)&&hs.contains(value/2)){
						count++;
					}
				}
			}
			sb.append(count).append("\n");
			//System.out.println(count);
		}
		System.out.print(sb.toString());
	}
}