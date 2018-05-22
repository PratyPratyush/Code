import java.io.*;
import java.util.*;
class TreeCheck{
	static Node head=null;
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int d){
			data =d;
			left=null;
			right=null;
		}
	}
	static Node insert(Node ptr,int data){
		if(ptr == null){
			Node p = new Node(data);
			return p;
		}
		else if(ptr.data<data)
			ptr.right=insert(ptr.right,data);
		else if(ptr.data>data)
			ptr.left=insert(ptr.left,data);
		return ptr;
	}
	static void print_tree(Node ptr){
		if(ptr!=null){
			print_tree(ptr.left);
			System.out.println(ptr.data);
			print_tree(ptr.right);
		}
	}
	static int heightTree(Node ptr){
		if(ptr==null) return -1;
		int left = heightTree(ptr.left);
		int right = heightTree(ptr.right);
		return (left>right?left:right)+1;
	}
	static void printPattern(Node head){
		Node temp=null;
		LinkedList<Node> ls =new LinkedList<Node>();
		ls.add(head);
		ls.add(temp);
		while(!ls.isEmpty()){
			Node p = ls.poll();
			if(p==null){
				System.out.print("\n");
				ls.add(temp);
				p = ls.poll();
				if(p==null) break;
			}
			System.out.print(p.data);
			if(p.left!=null)
				ls.add(p.left);
			if(p.right!=null)
				ls.add(p.right);
		}
	}
	static void printLevelIterative(Node ptr,int level){
		if(ptr==null)
			return;
		else if(level==1){
			System.out.print(ptr.data);
			return;
		}
		printLevelIterative(ptr.left,level-1);
		printLevelIterative(ptr.right,level-1);

	}
	static void printDifferentMethod(Node ptr){
		LinkedList<Node> ls =new LinkedList<Node>();
		int count =0;
		if(ptr==null) return;
		ls.add(ptr);
		while(true){
			count = ls.size();
			if(count==0) break;
			while(count-->0){
				Node temp=ls.poll();
				System.out.print(temp.data);
				if(temp.left!=null)
					ls.add(temp.left);
				if(temp.right!=null)
					ls.add(temp.right);
			}
			System.out.print("\n");
		}
	}
	static void printInorderStack(Node ptr){
		Node temp = ptr;
		//LinkedList<Node> ls =new LinkedList<Node>();
		Stack<Node> st = new Stack<Node>();
		while(true){
			while(temp!=null){
				st.push(temp);
				temp = temp.left;
			}
			if(!st.empty()){
				Node p = st.pop();
				System.out.print(p.data+" ");
				temp = p.right;
			}
			else
				break;
		}
	}
	static void printPreOrderStack(Node ptr){
		Node temp = ptr;
		Stack<Node> st =new Stack<Node>();
		while(true){
			while(temp!=null){
				System.out.print(temp.data+" ");
				st.push(temp);
				temp = temp.left;
			}
			if(!st.empty()){
				Node p = st.pop();
				temp = p.right;
			}
			else 
				break;
		}
	}
	static void printPostSingleStack(Node ptr){
		Stack<Node> st =new Stack<Node>();
		if(ptr==null)
			return;
		st.push(ptr);
		Node prev=null;
		while(!st.empty()){
			Node current = st.peek();
			if(prev==null||prev.left==current||prev.right==current){
				if(current.left!=null)
					st.push(current.left);
				else if(current.right!=null)
					st.push(current.right);
				else{
					System.out.print(current.data+" ");
					st.pop();
				}
			}
			else if(current.left==prev){
				if(current.right!=null)
					st.push(current.right);
				else{
					System.out.print(current.data+" ");
					st.pop();
				}
			}
			else if(current.right==prev){
				System.out.print(current.data+" ");
				st.pop();
			}
			prev=current;
		}
	}
	static void printPostDoubleStack(Node ptr){
		Stack<Node> st1 =new Stack<Node>();
		Stack<Node> st2 =new Stack<Node>();
		st1.push(ptr);
		while(!st1.empty()){
			Node temp = st1.pop();
			if(temp.left!=null)
				st1.push(temp.left);
			if(temp.right!=null)
				st1.push(temp.right);
			st2.push(temp);
		}
		while(!st2.empty()){
			Node temp=st2.pop();
			System.out.print(temp.data+" ");
		}
	}
	static void printDaigonal(Node ptr){
		LinkedList<Node> ls =new LinkedList<Node>();
		Node temp = null;
		if(ptr==null)
			return;
		ls.add(ptr);
		ls.add(temp);
		while(true){
			Node p = ls.poll();
			if(p==null){
				ls.add(temp);
				System.out.print("\n");
				p = ls.poll();
				if(p==null) break;
			}
			while(p!=null){
				System.out.print(p.data+" ");
				if(p.left!=null) ls.add(p.left);
				p = p.right;
			}
		}
	}
	static void printLeafNode(Node ptr){
		if(ptr.left==null&&ptr.right==null){
			System.out.print(ptr.data+" ");
			return;
		}
		if(ptr.left!=null) printLeafNode(ptr.left);
		if(ptr.right!=null) printLeafNode(ptr.right);
		return;
	}
	//=====================================================
	static void printLeft(Node ptr){
		if(ptr==null) return;
		if(ptr.left==null&&ptr.right==null)
			return;
		if(ptr.left!=null){
			System.out.print(ptr.data+" ");
			printLeft(ptr.left);
		}
		else if(ptr.right!=null){
			System.out.print(ptr.data+" ");
			printLeft(ptr.right);
		}
		return;
	}
	static void printLeaf(Node ptr){
		if(ptr==null) return;
		if(ptr.left==null&&ptr.right==null)
			System.out.print(ptr.data+" ");
		if(ptr.left!=null)
			printLeaf(ptr.left);
		if(ptr.right!=null)
			printLeaf(ptr.right);
		return;
	}
	static void printRight(Node ptr){
		if(ptr==null) return;
		if(ptr.left==null&&ptr.right==null)
			return;
		if(ptr.right!=null){
			printRight(ptr.right);
			System.out.print(ptr.data+" ");
		}
		else if(ptr.left!=null){
			printRight(ptr.left);
			System.out.print(ptr.data+" ");
		}
		return;
	}
	static void printBoundary(Node ptr){
		if(ptr==null)
			return;
		System.out.print(ptr.data+" ");
		printLeft(ptr.left);
		System.out.println(" ");
		printLeaf(ptr.left);
		System.out.println(" ");
		 printLeaf(ptr.right);
		System.out.println(" ");
		 printRight(ptr.right);
		System.out.println(" ");
	}
	//======================================================
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		// int t = sc.nextInt();
		// while(t-->0){
		// 	int data = sc.nextInt();
		// 	 head=insert(head,data);
		// }
		//print_tree(head);
		System.out.println("=========================");
		head=new Node(1);
		head.left = new Node(2);
		head.right=new Node(3);
		head.left.left = new Node(4);
		head.left.right =new Node(5);
		head.left.right.left =new Node(7);
		head.left.right.right =new Node(8);
		//head.left.right.right.left =new Node(8);
		head.right.right =new Node(6);
		head.right.right.left =new Node(9);
		System.out.println("Print level order using Queue with null seprator");
		printPattern(head);
		// int h = heightTree(head);
		// System.out.println("Height of tree is : "+h);
		// System.out.println("Different way");
		// for(int i=1;i<=h+1;i++){
		// 	printLevelIterative(head,i);
		// 	System.out.println(" ");
		// }
		// System.out.println("Print level order using Queue with size method");
		// printDifferentMethod(head);
		// System.out.println("Inorde traversal using Stack");
		// printInorderStack(head);
		// System.out.println(" ");
		// System.out.println("Preorder Traversal using stack");
		// printPreOrderStack(head);
		// System.out.println(" ");
		// System.out.println("Postorder using single Stack");
		// printPostSingleStack(head);
		// System.out.println(" ");
		// System.out.println("Postorder using Double Stack");
		// printPostDoubleStack(head);
		// System.out.println(" ");
		// System.out.println("Print Daigonal of Tree");
		// printDaigonal(head);
		// System.out.println("Display All leaf Node");
		// printLeafNode(head);
		// System.out.println(" ");
		System.out.println("Boundary");
		printBoundary(head);
	}
}