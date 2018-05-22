//=====
import java.io.*;
import java.util.*;
class HEBSearch3{
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
		int[] tm =new int[100000];
		long[] wt =new long[100000];
		int t = fr.nextInt();
		int i=1;
		while(t-->0){
			int q = fr.nextInt();
			int index=-1;
			if(q==1){
				wt[i]=wt[i-1]+fr.nextLong();
				tm[i]=fr.nextInt();
				i++;
			}
			else{
				int value = fr.nextInt();
				int time = fr.nextInt();
				int lo=1,hi=i-1,mid;
				while(lo<=hi){
					mid = (lo+hi)/2;
					if(tm[mid]<value){
						index=mid;
						lo=mid+1;
					}
					else if(tm[mid]>value) hi=mid-1;
					else{
						index=mid;break;
					}
				}
				System.out.println(wt[index]);
			}
		}
	}
}