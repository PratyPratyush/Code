import java.io.*;
import java.util.*;
class TrieCamelCase{
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
	static TrieNode root;
	static boolean checkLoop;
	static class TrieNode{
		boolean endOf;
		HashMap<Character,TrieNode> hm;
		public TrieNode(){
			hm = new HashMap<Character,TrieNode>();
			endOf = false;
		}
	}
	static void search(String str){
		TrieNode current=root;
		boolean check=true;
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			if(!current.hm.containsKey(ch)){
				check=false;
				break;
			}
			current = current.hm.get(ch);
		}
		if(current.endOf==true&&check==true) System.out.println("Exist");
		else System.out.println("Not Exist");
	}
	static void find2(TrieNode ptr,String str){
		if(ptr.endOf==true) System.out.println(str);
		for(Map.Entry<Character,TrieNode> e:ptr.hm.entrySet()){
			find2(e.getValue(),str+e.getKey());
		}
	}
	static void find1(TrieNode ptr,String str,String pattern,int index){
		char ch = pattern.charAt(index);
		for(Map.Entry<Character,TrieNode> e:ptr.hm.entrySet()){
			if(pattern.length()-1==index){
				if(e.getKey()==ch){
					ptr=e.getValue();
					find2(e.getValue(),str+ch);
					checkLoop=true;
					break;
				}
			}
			if(e.getKey()==ch)
					index++;
			int t = (int)e.getKey();
			if((t>=65&&t<=90)&&(e.getKey()!=ch)){
				//System.out.println(e.getKey());
			}
			else{
				find1(e.getValue(),str+e.getKey(),pattern,index);
			}
			//if(!(t>=65&&t<=90)&&(e.getKey()!=ch)){
				
			//}
		}
	}
	static void insert(String str){
		TrieNode ptr=root;
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			if(!ptr.hm.containsKey(ch))
				ptr.hm.put(ch,new TrieNode());
			ptr = ptr.hm.get(ch);
		}
		ptr.endOf = true;
	}
	public static void main(String args[])throws IOException{
		FastReader fr =new FastReader();
		root = new TrieNode();
		checkLoop=false;
		int t =fr.nextInt();
		while(t-->0){
			int n = fr.nextInt();
			while(n-->0){
				String st = fr.next();
				insert(st);
			}
			String str = fr.next();
			TrieNode current =root;
			char ch = str.charAt(0);
			String s = "";
			if(current.hm.containsKey(ch)){
				current = current.hm.get(ch);
				if(str.length()==1){
					find2(current,s+str.charAt(0));
					checkLoop=true;
				}
				else
					find1(current,s+str.charAt(0),str,1);
				//checkLoop=true;
			}
			if(!checkLoop)
				System.out.println("String not exist");
			//search(str);
		}	
	}
}