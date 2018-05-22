import java.io.*;
import java.util.*;
class TrieHackerEarth2{
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
        boolean endOf;
        TreeMap<Character,TrieNode> data;
        public TrieNode(){
            endOf=false;
            data =new TreeMap<Character,TrieNode>();
        }
    }
    static void insert(String s){
    	TrieNode current = root;
    	for(int i=0;i<s.length();i++){
    		char ch = s.charAt(i);
    		if(!current.data.containsKey(ch))
    			current.data.put(ch,new TrieNode());
    		current = current.data.get(ch);
    	}
    	current.endOf =true;
    }
    static void display(TrieNode ptr,String str){
    	if(ptr.endOf){
            sb.append(str).append("\n");
            //System.out.println(str);
    	}
    	for(Map.Entry<Character,TrieNode> e:ptr.data.entrySet()){
    		display(e.getValue(),str+e.getKey());
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
    		display(current,s);
    	}
    	else{
            //System.out.println("No suggestions");
            sb.append("No suggestions").append("\n");
    		insert(s);
        }
    }
	public static void main(String args[])throws IOException{
		FastReader fr =new FastReader();
		root = new TrieNode();
        int t = fr.nextInt();
        sb =new StringBuilder("");
        while(t-->0){
            String str = fr.next();
            //int d = fr.nextInt();
            insert(str);
        }
        int q =fr.nextInt();
        while(q-->0){
            value=-1;
            String s = fr.next();
            search(s);
        }
        System.out.print(sb.toString());
	}
}