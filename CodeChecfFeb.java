import java.io.*;
import java.util.*;
import java.util.regex.*;
class CodeChecfFeb{
    static class FastRead{
        BufferedReader br;
        StringTokenizer st;
        public FastRead(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next() throws IOException{
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
        double nextDouble()throws IOException{
            return Double.parseDouble(next());
        }
        String nextLine()throws IOException{
            String s="" ;
            s=br.readLine();
            return s;
        }
    }
   static boolean fun(int i,int n,char[] ch){
       boolean c=false,h=false,e=false,f=false;
       while(i<=n){
        if(ch[i]=='c') c=true;
        else if(ch[i]=='h') h=true;
        else if(ch[i]=='e') e=true;
        else if(ch[i]=='f') f=true;
       }
       if(c&&h&&e&&f)
            return true;
       else
            return false;
   }
    public static void main(String args[])throws IOException{
        FastRead fr =new FastRead();
        int t = fr.nextInt();
        while(t-->0){
            char[] ch = fr.next().toCharArray();
            int count=0;
            int sum=0;
            if(ch.length>=4){
                sum = ch[0]+ch[1]+ch[2]+ch[3];
                if(sum==406){
                    if(fun(0,3,ch))
                        count++;
                } 
                for(int i=0,j=4;j<ch.length;j++,i++){
                    sum = sum+ch[j]-ch[i];
                    if(sum==406){
                        if(fun(i,j,ch))
                            count++;
                    } 
                }
            }
            if(count>0){
                System.out.println("lovely"+" "+count);
            }
            else
                System.out.println("normal");
        }
        
    }
}
