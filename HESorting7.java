//=========Quick Sort================
import java.io.*;
import java.util.*;
class HESorting7{
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
	static void swap(int[] arr,int a,int b){
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	static int Partition(int[] arr,int lo,int hi){
		int pivot=arr[hi];
		int pIndex=lo;
		for(int i=lo;i<=hi-1;i++){
			if(arr[i]<pivot){
				swap(arr,i,pIndex);
				pIndex++;
			}
		}
		swap(arr,pIndex,hi);
		return pIndex;
	}
	static void QuickSort(int[] arr,int lo,int hi){
		if(lo<hi){
			int part = Partition(arr,lo,hi);
			QuickSort(arr,lo,part-1);
			QuickSort(arr,part+1,hi);
		}
	}
	public static void main(String args[])throws IOException{
		FastReader fr =new FastReader();
		int n= fr.nextInt();
		int[] arr =new int[n];
		for(int i=0;i<n;i++){
			arr[i]=fr.nextInt();
		}
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
		QuickSort(arr,0,n-1);
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");


	}
}