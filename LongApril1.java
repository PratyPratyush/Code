//
import java.io.*;
import java.util.*;
class LongApril1{
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
		int n =fr.nextInt();
		int max1=1000000,max2=1000000,max3=1000000;
		int[] coin = new int[n];
		int[] worker = new int[n];
		for(int i=0;i<n;i++)
			coin[i]=fr.nextInt();
		for(int i=0;i<n;i++)
			worker[i]=fr.nextInt();
		for(int i=0;i<n;i++){
			if(worker[i]==1){
				if(max1>coin[i]) max1=coin[i];
			}
			else if(worker[i]==2){
				if(max2>coin[i]) max2=coin[i];
			}
			else if(worker[i]==3){
				if(max3>coin[i]) max3=coin[i];
			}
		}
		//System.out.println(max1+" "+max2+" "+max3);
		if((max2+max1)>max3) System.out.println(max3);
		else System.out.println(max2+max1);
	}
}