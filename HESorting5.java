//===========
import java.io.*;
import java.util.*;
class HESorting5{
	static class FastReader{
		BufferedReader br;
		StringTokenizer st;
		public FastReader(){
			br = new BufferedReader(new InputStreamReader(System.in));
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
		int n = fr.nextInt();
		int[] arr =new int[n];
		for(int i=0;i<n;i++)
			arr[i]=fr.nextInt();
		int index;
		for(int i=0;i<n;i++){
			index=i;
			for(int j=i+1;j<n;j++){
				if(arr[j]<arr[index]) index=j;
			}
			int temp=arr[i];
			arr[i]=arr[index];
			arr[index]=temp;
		}
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		System.out.println(" ");
	}
}