//
import java.io.*;
import java.util.*;
class HESorting4{
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
		int n = fr.nextInt();
		int[] arr1 =new int[n];
		int[] arr2=new int[n];
		int i=0;
		while(i<n){
			arr1[i]=fr.nextInt();i++;
		}
		i=0;
		while(i<n){
			arr2[i]=fr.nextInt();i++;
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		boolean check=true;
		for(i=0;i<n;i++){
			if(arr1[i]<=arr2[i]){
				check=false;break;
			}
		}
		if(check) System.out.println("Yes");
		else System.out.println("No");
	}
}