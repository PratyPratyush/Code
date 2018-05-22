//=====
import java.io.*;
import java.util.*;
class HEBSearch{
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
	public static void main(String args[])throws IOException{
		FastReader fr =new FastReader();
		int n = fr.nextInt();
		int q =fr.nextInt();
		long[] arr =new long[n+1];
		int a;
		for(int i=1;i<=n;i++){
			 a= fr.nextInt(); 
			arr[i]=a+arr[i-1];
		}
		while(q-->0){
			long value= fr.nextLong();
			int index=0;
			// for(int i=1;i<=n;i++){
			// 	if(arr[i]>=value) {index=i;break;}
			// }
			int lo=0,hi=n,mid=0;
			while(lo<=hi){
				//System.out.println(lo+" "+hi);
				mid = (lo+hi)/2;
				//System.out.println(mid);
				if(arr[mid]>value){index=mid;hi=mid-1;}
				else if(arr[mid]<value) lo=mid+1;
				else{index=mid;break;}
			}
			System.out.println(index);
		}
		// for(int i=1;i<=n;i++){

		// }
		// for(int i=0;i<=n;i++)
		// 	System.out.print(arr[i]+" ");
		// System.out.println(" ");
	}
}