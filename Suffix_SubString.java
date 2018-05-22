import java.io.*;
import java.util.*;
class Suffix_SubString{
	static TrieNode root;
	static class TrieNode{
		TrieNode[] data = new TrieNode[26];
	}
	static void insert(String s,TrieNode current){
		//TrieNode current = root;
		int index;
		if(s.length()>0){
			index = s.charAt(0)-'a';
			if(current.data[index]==null)
				current.data[index] = new TrieNode();
			insert(s.substring(1),current.data[index]);
		}
	}
	static int cal(TrieNode ptr){
		if(ptr==null)
			return 0;
		int count=0;
		for(int i=0;i<26;i++){
			if(ptr.data[i]!=null)
				count+=cal(ptr.data[i]);
		}
		return count+1;
	}
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		root = new TrieNode();
		String s =sc.next();
		for(int i=0;i<s.length();i++){
			insert(s.substring(i),root);
		}
		int count = cal(root);
		System.out.println(count);
	}
}