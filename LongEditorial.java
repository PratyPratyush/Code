//======CodeCheaf====LongChallenge March=======Minions and Voting============
import java.io.*;
import java.util.*;
class LongEditorial{
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
		int t =fr.nextInt();
		while(t-->0){
			int n = fr.nextInt();
			int[] s = new int[n+1];
			int[] SS = new int[n+1];
			int[] res = new int[10];
			SS[0]=0;
			for(int i=1;i<=n;i++){
				s[i]=fr.nextInt();
				SS[i]=SS[i-1]+s[i];
			}
			for(int i=1;i<=n;i++){
				{
				int lo=1,hi=i-1,where=i;
				while(lo<=hi){
					int mid = (lo+hi)/2;
					System.out.println("Backward"+" "+mid);
					if(s[i]>=SS[i-1]-SS[mid]){
						where=mid;hi=mid-1;
					}
					else{
						lo=mid+1;
					}
				}
				res[where]++;
				res[i]--;
				System.out.println(where);
				System.out.println("=======PArt 1=======");
				}
				{
				int lo=i,hi=n,where=i+1;
				while(lo<=hi){
					int mid=(lo+hi)/2;
					System.out.println("Forward"+" "+mid);
					if(s[i]>=SS[mid-1]-SS[i]){
						where=mid;lo=mid+1;
					}
					else{
						hi=mid-1;
					}
				}
				res[i+1]++;
				res[where+1]--;
				System.out.println(where+" ");
				System.out.println("=======PArt 2=======");
				}
			}
			for(int i=0;i<10;i++){
				System.out.print(res[i]+" ");
			}
			System.out.println(" ");
			int total=0;
			for(int i=1;i<=n;i++){
				total+=res[i];
				System.out.print(total);
			}
			System.out.println(" End Of Task");
		}
	}
}