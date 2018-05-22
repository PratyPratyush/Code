import java.io.*;
import java.util.*;
class DE {
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
    public static void main(String args[] ) throws Exception {
       FastReader fr =new FastReader();
       int t =fr.nextInt();
       int max=1000000007;
       while(t-->0){
            int n =fr.nextInt();
            int[] arr =new int[n];
            long cal=0;
            for(int i=0;i<n;i++)
                arr[i]=fr.nextInt();
            for(int i=1;i<(1<<n);i++){
                long sum=-1;
                for(int j=0;j<n;j++){
                    if((i&(1<<j))>0){
                        if(sum==-1) sum=arr[j];
                        else{
                            sum=(sum&arr[j]);
                        }
                    }
                }
                System.out.print(sum+" ");
                cal = (cal+sum)%max;
            }
            System.out.print(" ");
            System.out.println(cal);
       }
       

    }
}
