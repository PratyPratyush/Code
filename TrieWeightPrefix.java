import java.io.*;
import java.util.*;
class TrieWeightPrefix{
	static TrieNode root;
	static boolean check;
	static int value;
	static class TrieNode{
		int weight;
		TrieNode[] data;
		public TrieNode(){
			weight=-1;
			data =new TrieNode[26];
		}
	}
	static void insert(String s,int wt){
		TrieNode current=root;
		int index;
		for(int i=0;i<s.length();i++){
			index = s.charAt(i)-'a';
			if(current.data[index]==null)
				current.data[index]=new TrieNode();
			current=current.data[index];
		}
		current.weight=wt;
	}
	static void display(TrieNode ptr){
		if(ptr.weight>0){
			if(ptr.weight>value) value = ptr.weight;
			//return;
		}
		for(int i=0;i<26;i++){
			if(ptr.data[i]!=null)
				display(ptr.data[i]);
		}
	}
	static void search(String s){
		TrieNode current = root;
		int index;
		for(int i=0;i<s.length();i++){
			index = s.charAt(i)-'a';
			if(current.data[index]==null){
				check=false;
				break;
			}
			current = current.data[index];
		}
		if(check){
			display(current);
			System.out.println(value);
		}
		else System.out.println(value);
	}
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		root =new TrieNode();
		check = true;
		value=-1;
		int t = sc.nextInt();
		while(t-->0){
			String s = sc.next();
			int d = sc.nextInt();
			insert(s,d);
		}
		String str = sc.next();
		search(str);
	}
}