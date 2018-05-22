//==============Bubble Sort==================
//=================Easy Going.(Very Easy)===================
import java.io.*;
import java.util.*;
class HESorting3{
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
		int t = fr.nextInt();
		while(t-->0){
			int n = fr.nextInt();
			int m=fr.nextInt();
			int[] arr =new int[n];
			for(int i=0;i<n;i++){
				arr[i]=fr.nextInt();
			}
			Arrays.sort(arr);
			// for(int i=0;i<n;i++){
			// 	System.out.print(arr[i]+" ");
			// }
			int value=n-m;
			long max=0,min=0;
			for(int i=0,j=n-1;i<value;i++,j--){
				max+=arr[j];
				min+=arr[i];
			}
			// System.out.println("");
			// System.out.println("max : "+max+" min: "+min);
			System.out.println(max-min);	
		}
		
	}
}