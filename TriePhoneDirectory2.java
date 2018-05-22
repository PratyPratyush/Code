import java.io.*;
import java.util.*;
class TriePhoneDirectory{
	static TireNode root;
	static StringBuilder sb;
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
	static class TireNode{
		boolean endOf;
		TireNode[] data;
		public TireNode(){
			data = new TireNode[26];
			endOf=false;
		}
	}
	
	static void display(TireNode ptr,String str){
		int index;
		if(ptr.endOf==true){sb.append(str).append(" ");}
		for(int i=0;i<26;i++){
			if(ptr.data[i]!=null){
				index=97+i;
				str = str.concat(String.valueOf((char)index));
				display(ptr.data[i],str);
			}
		}
	}
	static void search(String s){
		TireNode current  = root;
		int index;
		int i;
		String prefix="";
		for(i=0;i<s.length();i++){
			index = s.charAt(i)-'a';
			prefix=prefix+s.charAt(i);
			if(current.data[index]==null){
				break;
			}
			current=current.data[index];
			display(current,prefix);
			sb.append("\n");
		}
		for(;i<s.length();i++){
			sb.append("0").append("\n");
		}
		System.out.print(sb.toString());
		
	}
	static void insert(String s){
		TireNode current = root;
		int index;
		for(int i=0;i<s.length();i++){
			index = s.charAt(i)-'a';
			if(current.data[index]==null)
				current.data[index]= new TireNode();
			current = current.data[index];
		}
		current.endOf=true;
	}
	public static void main(String args[])throws IOException{
		FastReader fr =new FastReader();
		sb = new StringBuilder("");
		root = new TireNode();
		int t = fr.nextInt();
		while(t-->0){
		//	System.out.println("Enter for insert");
			int n = fr.nextInt();
			while(n-->0){
				String s = fr.next();
				insert(s);
			}
			String str = fr.next();
			search(str);
		}
	}
}