import java.io.*;
import java.util.*;
class TrieInsert{
	static Trienode root;
	static class Trienode{
		boolean endOf;
		Trienode[] data;
		Trienode(){
			data = new Trienode[26];
			endOf=false;
		}
	}
	static void insert(String s){
		Trienode current = root;
		int index;
		//System.out.println("out side forloop");
		for(int i=0;i<s.length();i++){
			//System.out.println("in side forloop");
			index=s.charAt(i)-'a';
			if(current.data[index]==null)
					current.data[index]=new Trienode();
			current=current.data[index];
		}
		current.endOf=true;

	}
	static boolean search(String s){
		int index;
		Trienode current=root;
		for(int i=0;i<s.length();i++){
			index = s.charAt(i)-'a';
			if(current.data[index]==null) return false;
			current=current.data[index];
		}
		return (current!=null&&current.endOf);
	}
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter for insert");
		int t = sc.nextInt();
		root = new Trienode();
		while(t-->0){
			String s = sc.next();
			insert(s);
		}
		System.out.println("Enter for search");
		int p = sc.nextInt();
		while(p-->0){
			String str = sc.next();
			if(search(str)) System.out.println("String is exist");
			else System.out.println("String is not exist");
			
		}
	}
}