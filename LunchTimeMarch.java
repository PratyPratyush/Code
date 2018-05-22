//
import java.io.*;
import java.util.*;
class LunchTimeMarch{
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
		int n =fr.nextInt();String[] str = new String[n];
		for(int i=0;i<n;i++){
			str[i]=fr.next();
		}
		int count=0;
		for(int i=0;i<n;i++){
			char[] ch =str[i].toCharArray();
			for(int j=0;j<ch.length-1;j++){
				if(ch[j]=='c'&&ch[j+1]=='h'){count++;break;}
				else if(ch[j]=='h'&&ch[j+1]=='e'){count++;break;}
				else if(ch[j]=='e'&&ch[j+1]=='f'){count++;break;}
			}
		}
		System.out.println(count);
	}
}