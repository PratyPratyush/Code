import java.io.*;
import java.util.*;
class LongMarch4Demo{
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
	public static void main(String args[])throws IOException{
		FastReader fr =new FastReader();
		int t = fr.nextInt();
		StringBuilder sb =new StringBuilder("");
		while(t-->0){
			int n = fr.nextInt();
			int time=fr.nextInt();
			int max=-1;
			int[] arr = new int[n];
			long sum=0;
			for(int i=0;i<n;i++){
				arr[i]=fr.nextInt();
				sum+=arr[i];
				if(arr[i]>max) max=arr[i];
			}
			if(time==n){
				sb.append(max).append("\n");;
			}
			else{
				int value=0;
				if(sum%time==0){
					long l = sum/time;
					long intmax=Integer.MAX_VALUE;
					if(l>intmax) System.out.println(5/0);
					value=(int)l;
				}
				else{
					long l=((sum/time)+1);
					long intmax=Integer.MAX_VALUE;
					if(l>intmax) System.out.println(5/0);
					value=(int)l;
				}
				int count;
				while(true){
					count=0;
					for(int i=0;i<n;i++){
						if(arr[i]%value==0) count=count+(arr[i]/value);
						else count+=(arr[i]/value)+1;
					}
					if(count<=time) break;
					value++;
				}
				sb.append(value).append("\n");
			}
		}
		System.out.print(sb.toString());
	}
} 