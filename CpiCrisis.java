//
import java.io.*;
import java.util.*;
class CpiCrisis{
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
    static class Node{
    	int a,index;
    	float ratio;
    	public Node(int p,int in){
    		a=p;index=in;ratio=a/index;
    	}
    }
	public static void main(String args[]){
		FastReader fr =new FastReader();
		int t =fr.nextInt();
		while(t-->0){
			int n =fr.nextInt();int x=fr.nextInt();
			PriorityQueue<Node> pq =new PriorityQueue<Node>(10,new Comparator<Node>(){
				public int compare(Node p1,Node p2){
					if(p1.ratio>p2.ratio) return 1;
					else if(p1.ratio<p2.ratio) return -1;
					else return 0;
				}
			});
			for(int i=1;i<=n;i++){

			}
		}
	}
}