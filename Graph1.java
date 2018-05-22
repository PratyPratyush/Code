import java.io.*;
import java.util.*;
class Graph1{
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
    static class Graph{
    	int v;
    	LinkedList<Integer> list[];
    	Graph(int a){
    		v=a;
    		list = new LinkedList[v];
    		for(int i=0;i<v;i++){
    			list[i]=new LinkedList<Integer>();
    		}
    	}
    }
    static void insert(Graph g,int src,int dest){
    	g.list[src].add(dest);
    	g.list[dest].add(src);
    }
	public static void main(String args[])throws IOException{
		FastReader fr =new FastReader();
		int v =fr.nextInt();
		int e = fr.nextInt();
		Graph g =new Graph(v);
		for(int i=0;i<e;i++){
			int src = fr.nextInt();
			int des = fr.nextInt();
			insert(g,src,des);
		}
		for(int i=0;i<v;i++){
			LinkedList<Integer> temp=g.list[i];
			while(temp.size()>0){
				int a = temp.poll();
				System.out.print(a+" ");
			}
			System.out.println(" ");
		}
	}
}