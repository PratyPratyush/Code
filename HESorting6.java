//============Sorting=========Insetion Sort=====
import java.io.*;
import java.util.*;
class HESorting6{
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
		int[] arr =new int[n];
		for(int i=0;i<n;i++){
			arr[i]=fr.nextInt();
		}
		for(int i=0;i<n;i++){
			//int index=i;
			int temp=arr[i];
			int j=i;
			while(j>0&&(temp<arr[j-1])){
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=temp;
		}
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}

	}
}