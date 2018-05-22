import java.io.*;
import java.util.*;
class LongMarch4{
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
			long max=-1;
			long[] arr = new long[n];
			long sum=0;
			for(int i=0;i<n;i++){
				arr[i]=fr.nextInt();
				sum+=arr[i];
				if(arr[i]>max) max=arr[i];
			}
			//System.out.println("max value : "+max);
			//System.out.println("sum value : "+sum);
			if(time==n){
				//System.out.println(max);
				sb.append(max).append("\n");;
			}
			else{
				long value=0;
				if(sum%time==0)
					value=sum/time;
				else
					value=(sum/time)+1;
				//System.out.println("value : "+value);
				long count;
				while(true){
					count=0;
					for(int i=0;i<n;i++){
						if(arr[i]%value==0) count=count+arr[i]/value;
						else count+=(arr[i]/value)+1;
					}
					//System.out.println(count);
					if(count<=time) break;
					else{
						if(count%n==0) value=value+(count/n);
						else{
							//long demo=((count-time)/n)+1;
							//System.out.println(n+"===="+value+"----"+demo+"-------"+count);
							value=value+((count-time)/n)+1;

						}
					}
					//System.out.println("hello");
					//value++;
				}
				//System.out.println("count value : "+value);
				sb.append(value).append("\n");
			}
			//System.out.println("===============");
		}
		System.out.print(sb.toString());
	}
}