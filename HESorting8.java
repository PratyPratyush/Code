//==========Radix Sort===========
import java.io.*;
import java.util.*;
class HESorting8{
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
	static void radixSort(int[] arr,int n,int mal){
		int[] freq = new int[10];
		int[] temp = new int[n];
		for(int i=0;i<n;i++){
			freq[(arr[i]/mal)%10]++;
		}
		for(int i=0;i<10;i++)
			System.out.print(freq[i]+" ");
		System.out.println(" ");
		for(int i=1;i<10;i++)
			freq[i]=freq[i]+freq[i-1];
		for(int i=n-1;i>=0;i--){
			temp[freq[(arr[i]/mal)%10]-1]=arr[i];
			freq[(arr[i]/mal)%10]--;
		}
		for(int i=0;i<n;i++)
			arr[i]=temp[i];
	}
	public static void main(String args[])throws IOException{
		FastReader fr =new FastReader();
		int n = fr.nextInt();
		int[] arr =new int[n];
		int max=-1;
		for(int i=0;i<n;i++){
			arr[i]=fr.nextInt();
			if(max<arr[i]) max=arr[i];
		}
		int mal=1;
		while(max>0){
			radixSort(arr,n,mal);
			mal*=10;
			max/=10;
		}
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}
}