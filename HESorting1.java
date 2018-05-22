//==============Bubble Sort==================
import java.io.*;
import java.util.*;
class HESorting1{
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
		int n = fr.nextInt();
		int[] arr =new int[n];
		for(int i=0;i<n;i++){
			arr[i]=fr.nextInt();
		}
		int count=0;
		for(int i=n-2;i>=0;i--){
			for(int j=0;j<=i;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					count++;
				}
			}
		}
		// for(int i=0;i<n;i++){
		// 	System.out.print(arr[i]+" ");
		// }
		// System.out.println("");
		System.out.println(count);
	}
}