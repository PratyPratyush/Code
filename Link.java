import java.io.*;
import java.util.*;
class Link{
	// static Node head;
	// static class Node{
	// 	int data;
	// 	Node ptr;
	// 	public Node(int a){
	// 		data = a;
	// 		ptr=null;
	// 	}
	// }
	// static int gcd(int a,int b){
	// 	if(a%b==0) return b;
	// 	return gcd(b,a%b);
	// }
	public static void main(String args[])throws IOException{
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		while(n%2==0){
			System.out.print(2+" ");
			n/=2;
		}
		for(int i=3;i<=Math.sqrt(n);i+=2){
			//if(n%i==0){
				while(n%i==0){
					System.out.print(i+" ");
					n/=i;
				}
			//}
		}
		// boolean[] arr =new boolean[n+1];
		// for(int i=0;i<=n;i++)
		// 	arr[i]=true;
		// for(int p=2;p<=Math.sqrt(n);p++){
		// 	if(arr[p]==true){
		// 		for(int j=p*2;j<=n;j+=p){
		// 			arr[j]=false;
		// 		}
		// 	}

		// }
		// for(int i=2;i<=n;i++){
		// 	if(arr[i]!=false)
		// 		System.out.print(i+" ");
		// }
		// System.out.println(" ");
		// int  a= 31;
		// int b = 2;
		// int g = gcd(a,b);
		// System.out.println(g);
		// int result = arr[0];
		// for(int i=1;i<n;i++){
		// 	result = gcd(arr[i],)
		// }
		// Node prev=null;
		// for(int i=0;i<n;i++){
		// 	int p = sc.nextInt();
		// 	Node temp = new Node(p);
		// 	if(head==null){
		// 		head = temp;
		// 	}
		// 	if(prev!=null)
		// 		prev.ptr = temp;
		// 	prev = temp;
		// }
		// Node temp = head;
		// while(temp!=null){
		// 	System.out.print(temp.data+" ");
		// 	temp = temp.ptr;
		// }
		// LinkedList<Integer> ls =new LinkedList<Integer>();
		// for(int i=0;i<n;i++){
		// 	ls.add(sc.nextInt());
		// }
		// while(ls.size()>0){
		// 	System.out.print(ls.poll()+" ");
		// }
		// Stack<Integer> st =new Stack<Integer>();
		// for(int i=0;i<n;i++){
		// 	st.push(sc.nextInt());
		// }
		// while(st.size()>0){
		// 	System.out.print(st.pop()+" ");
		// }
	}
}