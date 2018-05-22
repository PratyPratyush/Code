//
import java.io.*;
import java.util.*;
class MaxSumArray{
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
    } 
	public static void main(String args[])throws IOException{
		FastReader fr =new FastReader();
		int t =fr.nextInt();
		while(t-->0){
			int n = fr.nextInt();
			int[] arr =new int[n];
			for(int i=0;i<n;i++){
				arr[i]=fr.nextInt();
			}
			int max = Integer.MIN_VALUE;
			int temp=0;
			int lo=-1,hi=-1;
			for(int i=0;i<n;i++){
				temp+=arr[i];
				if(lo==-1) lo=i;
				//if(hi==-1) hi=i;
				if(temp<0){
					if(max<temp){max=temp;hi=p;}
					temp=0;
					lo=-1;
				}
				else if(max<temp){max=temp;hi=p;}
			}
			System.out.println(max);
		}
	}
}