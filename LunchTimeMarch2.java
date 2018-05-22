//
import java.io.*;
import java.util.*;
class LunchTimeMarch2{
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
    static int gcd(int a,int b){
    	if(a%b==0) return b;
    	return gcd(b,a%b);
    }
	public static void main(String args[])throws IOException{
		FastReader fr =new FastReader();
		int n = fr.nextInt();
		int q =fr.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++){
			arr[i]=fr.nextInt();
		}
		for(int i=0;i<q;i++){
			int lo=fr.nextInt();int hi=fr.nextInt();lo--;hi--;
			int max=0;
			for(int j=lo;j<hi;j++){
				for(int k=j+1;k<=hi;k++){
					int value = gcd(arr[j],arr[k]);
					if(max<value) max=value;
				}
			}
			System.out.println(max);
		}
	}
}