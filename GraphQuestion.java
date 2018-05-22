//====Codegladiator=====================
import java.io.*;
import java.util.*;
class GraphQuestion{
	static int[] arr;
	static int[] barr;
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
    static boolean find(Graph g,int src,int des){
    	if(src==des){
    		arr[src]++;
    		return true;
    	}
    	Iterator<Integer> itr2 = g.list[src].listIterator();
    	while(itr2.hasNext()){
    		int n1 = itr2.next();
    		if(barr[n1]==0&&n1==des){
    			arr[src]++;arr[n1]++;
    			return true;
    		}
    	}
    	Iterator<Integer> itr = g.list[src].listIterator();
    	while(itr.hasNext()){
    		int n = itr.next();
    		if(barr[n]==0){
    			barr[n]=1;
    			if(find(g,n,des)){
    				arr[src]++;
    				return true;
    			}
    		}
    	}
    	return false;
    }
    static void count(Graph g,int src,int des){
    	if(barr[src]==0){
    		barr[src]=1;
    		boolean b= find(g,src,des);
    		// if(find(g,src,des)){
    		// 	arr[src]++;
    		// }
    	}
    	// for(int i=1;i<arr.length;i++){
    	// 	System.out.print(arr[i]+" ");
    	// }
    	// System.out.println(" ");
    } 
    static class Graph{
    	int v;
    	LinkedList<Integer> list[];
    	Graph(int a){
    		v=a;
    		list = new LinkedList[v+1];
    		for(int i=1;i<=v;i++)
    			list[i]=new LinkedList<Integer>();
    	}
    }
    static void insert(Graph g,int src,int des){
    	g.list[src].add(des);
    	g.list[des].add(src);
    }
	public static void main(String args[])throws IOException{
		FastReader fr =new FastReader();
		int v = fr.nextInt();
		int c = fr.nextInt();
		arr = new int[v+1];
		int e =v-1;
		Graph g =new Graph(v);
		for(int i=0;i<e;i++){
			int src =fr.nextInt();
			int des=fr.nextInt();
			insert(g,src,des);
		}
		//System.out.println(" count data ");
		for(int i=0;i<c;i++){
			int src1 =fr.nextInt();
			int des1 =fr.nextInt();
			barr = new int[v+1];
			count(g,src1,des1);
		}
		int max=-1;
		for(int i=1;i<arr.length;i++){
			if(arr[i]>max) max=arr[i];
		}
		System.out.println(max);
		// System.out.println(" Last print Garaph ");
		// for(int i=1;i<=v;i++){
		// 	LinkedList<Integer> temp= g.list[i];
		// 	while(temp.size()>0){
		// 		int p = temp.poll();
		// 		System.out.print(p+" ");
		// 	}
		// 	System.out.println(" ");
		// }
	}
}