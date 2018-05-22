import java.io.*;
import java.util.*;
class CodeChef{
    public static void main(String args[])throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            String[] str = br.readLine().split(" ");
            HashMap<Integer,Integer> hm =new HashMap<Integer,Integer>();
            for(int i=0;i<str.length;i++){
                int a = Integer.parseInt(str[i]);
                if(hm.containsKey(a))
                    hm.put(a,hm.get(a)+1);
                else
                    hm.put(a,1);
            }   
            //System.out.println(hm);
            boolean check = true;
            for(Map.Entry<Integer,Integer> e:hm.entrySet()){
                if(e.getValue()!=2){
                    check=false;
                    break;
                }
            }
            if(check)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
        
    }
}