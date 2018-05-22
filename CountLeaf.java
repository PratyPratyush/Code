//
import java.io.*;
import java.util.*;
class CountLeaf{
	 static Node head;
	 static int count=0;
	static class Node{
		int data;
		Node left;Node right;
		public Node(int a){
			data=a;left=null;right=null;
		}
	}
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
    static  void printValue(Node ptr){
    	if(ptr==null) return;
    	if(ptr.left==null&&ptr.right==null) count++;
    	//System.out.print(ptr.data+" ");
    	printValue(ptr.left);
    	printValue(ptr.right);
    }
	public static void main(String args[])throws IOException{
		FastReader fr =new FastReader();
		int n = fr.nextInt();
		int[] arr =new int[n];
		for(int i=0;i<n;i++)
			arr[i]=fr.nextInt();
		int x =fr.nextInt();
		Node[] ptr = new Node[n];
		for(int i=0;i<n;i++){
			ptr[i]=new Node(i);
			if(arr[i]==-1) head=ptr[i];
		}
		for(int i=0;i<n;i++){
			if(arr[i]!=-1){
				if(ptr[arr[i]].left==null){
					ptr[arr[i]].left=ptr[i];
					//System.out.println(ptr[arr[i]].data+" left "+ptr[i].data)
				}
				else if(ptr[arr[i]].right==null){
					ptr[arr[i]].right=ptr[i];
					//System.out.println(ptr[arr[i]].data+" left "+ptr[i].data)
				}
			}
		}
		if(arr[x]==-1){
			count=0;
		}
		else{
			if(ptr[arr[x]].left==ptr[x])
				ptr[arr[x]].left=null;
			else if(ptr[arr[x]].right==ptr[x])
				ptr[arr[x]].right=null;
			printValue(head);
		}
		System.out.println(count);
		

	}
}