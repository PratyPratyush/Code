//
import java.io.*;
import java.util.*;
class HEChallenge2{
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
		int t = fr.nextInt();
		while(t-->0){
			ArrayList<Integer> al =new ArrayList<Integer>();
			ArrayList<Character> cl =new ArrayList<Character>();
			int n =fr.nextInt();
			int k =fr.nextInt();
			char[] ch =fr.next().toCharArray();
			for(int i=0;i<ch.length;i++){
				if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
					al.add(i);
					cl.add(ch[i]);
				}
			}
			//Iterator itr=cl.iterator(); 
			int prev=0;int current=0;
			int j=0;
			//System.out.println(al);
			//System.out.println(cl);
			int max=-1;
			while(j<cl.size()){
			HashSet<Character> hs =new HashSet<Character>();
			
			int count=0;
			int i=j;boolean check=true;
			for(;i<cl.size();i++){
				if(count==k){
					if(!hs.contains(cl.get(i))){
						check=false;break;
					}
				}else{
					if(!hs.contains(cl.get(i))){
						count++;
						hs.add(cl.get(i));
					}
				}
			}
			if(check){
				current = n-1;
			}else{
				current = al.get(i)-1;
			}
			if(j==0)
				prev=0;
			else prev = al.get(j-1)+1;
			// for(int x=prev;x<=current;x++)
			// 	System.out.print(ch[x]+" ");
			int xyz = (current-prev)+1;
			if(max<xyz) max=xyz;
			//System.out.println(" ");
			prev=current+1;
			if(prev>=n) break;
			j++;
			
		}
		System.out.println(max);
		}
	}
}