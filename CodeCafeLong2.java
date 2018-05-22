import java.io.*;
import java.util.*;
class CodeCafeLong2{
	public static void main(String args[])throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
			String[] str = br.readLine().split(" ");
			int k = Integer.parseInt(str[1]);
			int n = Integer.parseInt(str[0]);
			int[] arr =new int[n];
			str = br.readLine().split(" ");
			for(int i=0;i<n;i++)
					arr[i] = Integer.parseInt(str[i]);
			// for(int i=0;i<n;i++)
			// 	System.out.print(arr[i]+" ");
			// System.out.print("\n");
			long max = Integer.MIN_VALUE;
			long cal =0;
			int p=k;
			while(p-->0){
				for(int i=0;i<n;i++){
					//System.out.print(arr[i]+" ");
					cal = cal+arr[i];
					if(cal<0)
						cal=0;
					if(cal>max)
						max=cal;
				}
				// //p=0;
				// System.out.println(" ");
			}
			System.out.println(max);
			



		}
	}
}