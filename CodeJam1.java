import java.io.*;
import java.util.*;
class CodeJam1{

    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
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
        StringBuilder sb=new StringBuilder("");
        int t = fr.nextInt();
        for(int k=1;k<=t;k++){
            int n = fr.nextInt();
            int[] arr =new int[n*2];
            for(int i=0;i<n*2;i++){
                arr[i]=fr.nextInt();
            }
            sb.append("Case #").append(k).append(": ");
            //System.out.print("Case #"+k+": ");
            int nt = fr.nextInt();
            while(nt-->0){
                int tn = fr.nextInt();
                int count=0;
                for(int i=0;i<n*2;i+=2){
                    if(tn>=arr[i]&&tn<=arr[i+1]) count++;
                }
                sb.append(count).append(" ");
                //System.out.print(count+" ");
            }
            //System.out.println(" ");
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}