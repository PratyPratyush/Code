//
import java.io.*;
import java.util.*;
class GreenStack4{
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
	}
	static void fun(int n,int[][] arr){
		
	}
	public static void main(String args[])throws IOException{
		FastReader fr =new FastReader();
		int f = fr.nextInt();
		int m = fr.nextInt();
		int[] female = new int[f];
		int[] male = new int[m];
		for(int i=0;i<f;i++)
			female[i]=fr.nextInt();
		for(int i=0;i<m;i++)
			male[i]=fr.nextInt();
		Arrays.sort(female);
		Arrays.sort(male);
		int j=0,i=0;
		int count=0;
		while(i<m&&j<f){
			int diff = male[i]-female[j];
			if(diff>4) j++;
			else if(diff<=0) i++;
			else{
				count++;i++;
				j++;
			}
		}
		System.out.println(count);
	}
}