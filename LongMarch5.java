import java.io.*;
import java.util.*;
class LongMarch5{
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
		int n = fr.nextInt();
		int q =fr.nextInt();
		StringBuilder sb =new StringBuilder("");
		int[] arr =new int[n];
		for(int i=0;i<n;i++){
			arr[i]=fr.nextInt();
		}
		while(q-->0){
			int[] zero=new int[31];
			int[] one = new int[31];
			int[] cal =new int[31];
			for(int i=0;i<31;i++){
				cal[i]=-1;
			}
			int a=fr.nextInt();a--;
			int b= fr.nextInt();b--;
			int min=32;
			for(int i=a;i<=b;i++){
				int value=arr[i];
				int p=30;
				while(value>0){
					if((value&1)==1)
						one[p]++;
					else
						zero[p]++;
					p--;
					value=value>>1;
				}
				//System.out.println(i+" ----- "+p);
				if(min>p+1) min=p+1;
				for(int j=p;j>=0;j--)
					zero[j]++;
			}
			//System.out.println("min : "+min);
			for(int i=30;i>=min;i--){
				//if(zero[i]==0&&one[i]==0) break;
				if(zero[i]<one[i]) cal[i]=0;
				else if(zero[i]>one[i]) cal[i]=1;
				else cal[i]=0;
			}
			// System.out.println("zero");
			// for(int i=0;i<31;i++){
			// 	System.out.print(zero[i]+" ");
			// }
			// System.out.println(" ");
			// System.out.println("one");
			// for(int i=0;i<31;i++)
			// 	System.out.print(one[i]+" ");
			// System.out.println(" ");
			// System.out.println("cal");
			// for(int i=0;i<31;i++)
			// 	System.out.print(cal[i]+" ");
			int sift=0;
			int sum=0;
			for(int i=30;i>=0;i--){
				if(cal[i]!=0){
					sum=sum|1<<sift;
				}
				sift++;
			}
			//System.out.println(" ");
			sb.append(sum).append("\n");
			//System.out.println(sum);
			//System.out.println("====================================");
		}
		System.out.print(sb.toString());
	}
}