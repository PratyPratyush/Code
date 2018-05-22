import java.io.*;
import java.util.*;
import java.math.*;
class Test1{
    public static void main(String args[])throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            String[] str = br.readLine().split(" ");
            BigInteger bi = new BigInteger(str[0]).pow(Integer.parseInt(str[1]));
            String s = bi.toString();
            long l=0;
           // System.out.println("Result : "+bi);
            long p=0;
            while(s.length()>1){
               // System.out.println("loop");
                l=0;
                for(int i=0;i<s.length();i++){
                    l=l+Character.getNumericValue(s.charAt(i));
                    // if(l>=10){
                    //     l=l-10;
                    //     p++;
                    // }
                }
                while(l>10){
                    l=l-10;
                    p++;
                }
                l=l+p;
                s=Long.toString(l);
            }
            System.out.println(s.charAt(0));
            //System.out.print("\n");

        }
        
    }
}