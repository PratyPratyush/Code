import java.io.*;
import java.util.*;
import java.math.*;
class Test{
    public static void main(String args[])throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            String[] str = br.readLine().split(" ");
            BigInteger bi = new BigInteger(str[0]).pow(Integer.parseInt(str[1]));
            //System.out.println("Result : "+bi);
            String s = bi.toString();
            long l=0;
            System.out.println("Result : "+bi);
            while(s.length()>1){
            //char[] ch = s.toCharArray();
                // if(k==6)
                //     break;
                l=0;
                //System.out.println(s+"\n");
                for(int i=0;i<s.length();i++){
                    l=l+Character.getNumericValue(s.charAt(i));
                    //System.out.print(l1+" ");
                    //+l1;
                    //System.out.print(Integer.parseInt(ch[i])+" "+"\n");
                }
                //System.out.print("\n");
                s=Long.toString(l);
                // k++;
            }
            System.out.print(s.charAt(0));
            System.out.print("\n");

        }
        
    }
}