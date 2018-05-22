import java.io.*;
import java.util.*;
class Mahindra{
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
		int[] arr= new int[n];
		boolean check=false;
		for (int i=0;i<n;i++ ) {
			arr[i]=fr.nextInt();
			if(arr[i]==1)
				check = true;
		}
		int sum=0;
		
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			int value = arr[i];
			int index=i;
			int count=0;
			for(int j=0;j<n;j++){
				if((arr[j]%value==0)&&(index!=j)){
					a[j]=-1;
				}
			}
		}
		for(int i=0;i<n;i++)
			if(a[i]==-1) sum++;
		//System.out.println(sum);
		//}
		System.out.println(sum);
		
	}
}