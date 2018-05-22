//
import java.io.*;
import java.util.*;
class HackerRank4{
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
        long nextLong()throws IOException{
            return Long.parseLong(next());
        }
    }
    static class Node{
    	int k,c;
    	Node next;
    	Node(int a,int b){
    		k=a;c=b;
    		next=null;
    	}
    }
    static Node head = null;
	public static void main(String args[])throws IOException{
		FastReader fr =new FastReader();
		int t = fr.nextInt();
		Node prev=null;
		StringBuilder sb =new StringBuilder();
		LinkedList<Node> list = new LinkedList<Node>();
		while(t-->0){
			String ch =fr.next();
			if(ch.equals("+")){
				int k  = fr.nextInt();
				int c = fr.nextInt();
				Node ptr = new Node(k,c);
				list.add(ptr);
			}
			else if(ch.equals("-")){
				int k = fr.nextInt();
				int c = fr.nextInt();
				ListIterator ltr = list.listIterator();
				int i=0;
				while(ltr.hasNext()){
					Node temp = (Node)ltr.next();
					if(temp.k==k&&temp.c==c){
						list.remove(i);break;
					}
					i++;
				}
			}
			else if(ch.equals("?")){
				int y = fr.nextInt();
				int count=0;
				ListIterator ltr = list.listIterator();
				while(ltr.hasNext()){
					Node temp =(Node)ltr.next();
					int value = y-temp.c;
					if(value%temp.k==0) count++;
				}
				sb.append(count).append("\n");
			}
		}
		System.out.print(sb.toString());
		while(list.size()>0){
			Node temp = list.poll();
			System.out.println(temp.k+" "+temp.c);
		}
		
	}
}