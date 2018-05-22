import java.io.*;
import java.util.*;
class EasyChalange{
	static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader() throws IOException{
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
	public static void main(String args[])throws IOException{
		FastReader fr =new FastReader();
		StringBuilder sb =new StringBuilder("");
		int t = fr.nextInt();
		while(t-->0){
			int n = fr.nextInt();
			int q = fr.nextInt();
			char[] ch = fr.next().toCharArray();
			while(q-->0){
				int a = fr.nextInt();
				int b = fr.nextInt();
				a--;b--;
				if(b<a){
					a=a^b;b=a^b;a=a^b;
				}
				char c=ch[a];
				int count1=0,count2=0;
				for(int i=a;i<=b;i++){
					if(c!=ch[i]){
						c=ch[i];count1++;
					}
				}
				c=ch[b];
				boolean check=false;
				while(true){
					if(b>n-1) b=0;
					if(b==a) check=true;
					if(ch[b]!=c){
						c=ch[b];count2++;
					}
					if(check) break;
					b++;
				}
				int min=(count1>count2?count2:count1);
				sb.append(min).append("\n");
			}
		}
		System.out.print(sb.toString());
	}
}