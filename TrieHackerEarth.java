import java.io.*;
import java.util.*;
class TrieHackerEarth{
	static TrieNode root;
	static int value;
	static StringBuilder sb;
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
    static class TrieNode{
        int weight;
        HashMap<Character,TrieNode> data;
        public TrieNode(){
            weight=-1;
            data =new HashMap<Character,TrieNode>();
        }
    }
    static void insert(String s,int wt){
    	TrieNode current = root;
    	for(int i=0;i<s.length();i++){
    		char ch = s.charAt(i);
    		if(!current.data.containsKey(ch))
    			current.data.put(ch,new TrieNode());
    		current = current.data.get(ch);
    	}
    	current.weight = wt;
    }
    static void display(TrieNode ptr){
    	if(ptr.weight>0){
    		if(ptr.weight>value) value=ptr.weight;
    	}
    	for(Map.Entry<Character,TrieNode> e:ptr.data.entrySet()){
    		display(e.getValue());
    	}
    }
    static void search(String s){
    	TrieNode current=root;
    	boolean check=true;
    	for(int i=0;i<s.length();i++){
    		char ch = s.charAt(i);
    		if(!current.data.containsKey(ch)){
    			check=false;
    			break;
    		}
    		current=current.data.get(ch);
    	}
    	if(check){
    		display(current);
    		sb.append(value).append("\n");
    		//System.out.println(value);
    	}
    	else
    		sb.append(value).append("\n");
    }
	public static void main(String args[])throws IOException{
		FastReader fr =new FastReader();
		root = new TrieNode();
        int t = fr.nextInt();
        int q =fr.nextInt();
        sb =new StringBuilder("");
        while(t-->0){
            String str = fr.next();
            int d = fr.nextInt();
            insert(str,d);
        }
        while(q-->0){
            value=-1;
            String s = fr.next();
            search(s);
        }
        System.out.print(sb.toString());
	}
}