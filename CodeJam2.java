import java.io.*;
import java.util.*;
class CodeJam2{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        for(int k=1;k<=t;k++){
            int n = sc.nextInt();
            String[] str = new String[n*2];
            String[] temp_str = new String[2];
            HashMap<String,Integer> hm = new HashMap<String,Integer>();
            for(int i=0;i<n*2;i++){
                str[i] = sc.next();
                if(hm.containsKey(str[i])){hm.put(str[i],hm.get(str[i])+1);}
                else{hm.put(str[i],1);}
            }
            int j=0;
            for(Map.Entry<String,Integer> e:hm.entrySet()){
                if(j==2) break;
                if(e.getValue()==1){temp_str[j]=e.getKey();j++;}
            }
            int value=0;
            for(int i=0;i<n*2;i++){
                if(str[i]==temp_str[0]){value=0;break;}
                else if(str[i]==temp_str[1]){value=1;break;}
             i++;   
            }
             String s = temp_str[value];
            int p=n;
            int i=0;
            System.out.print("Case #"+k+": ");
            while(i<n*2&&p>0){
                if(s.equals(str[i])){System.out.print(str[i]+"-"+str[i+1]+" ");s=str[i+1];p--;str[i]=" ";i=0;}
                else
                    i=i+2;
            }
            System.out.println(" ");
        }
       
       
    }
} 