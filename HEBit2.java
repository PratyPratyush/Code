//  =========Monk and the box of cookies=======================
import java.io.*;
import java.util.*;
class HEBit2{
	static class FastReader{
		BufferedReader br;
		StringTokenizer st;
		public FastReader(){
			br =new BufferedReader(new InputStreamReader(System.in));
		}
		String next()throws IOException{
			while(st==null||!st.hasMoreTokens()){
				st =new StringTokenizer(br.readLine());
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
		while(t-->0){
			int n = fr.nextInt();
			//int[] arr =new int[n];
			int[] bit = new int[32];
			for(int i=0;i<n;i++){
				int a=fr.nextInt();
				int j=0;
				while(a>0){
					if((a&1)>0) bit[j]++;
					a=a>>1;j++;
				}
				//while()
			}
			// for(int i=0;i<32;i++){
			// 	for(int j=0;j<n;j++){
			// 		if(((arr[j])&(1<<i))>0) bit[i]++;
			// 	}
			// }
			int max=0,index=-1;
			for(int i=0;i<32;i++){
				if(max<bit[i]){
					max=bit[i];
					index=i;
				}
				//System.out.print(bit[i]+" ");;
			}
			//System.out.println(" ");
			System.out.println(index);
			//System.out.println("max : "+max+" "+"index : "+index);
		}
	}
}