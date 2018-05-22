import java.util.*;
import java.io.*;
import java.Math.*;
class Rabin_karp
{
	int prime = 101;
	void fun(char[] pattern,char[] text){
		long patternHash = creat_hash(pattern);
		//System.out.println(patternHash);
		long textHash = creat_hash(text);
		//System.out.println(textHash);
		int n = text.length;
		int m = pattern.length;
		for(int i=1;i<n-m+1;i++){
			if(patternHash == textHash){
				System.out.println(i+" find at");
			}
			textHash = recal_hash(i-1,i+m-1,text,textHash,m);
		}
	}
	long recal_hash(int oldIndex,int newIndex,char[] text,long oldHash,int patlen){
		long newHash = 0;
		newHash = oldHash- text[oldIndex];
		newHash = newHash/prime;
		newHash +=text[newIndex]+Math.pow(prime,patlen-1);
		return newHash;
	}
	long creat_hash(char[] str){
		long hashvalue=0;
		for(int i=0;i<str.length;i++){
			hashvalue +=str[i]+Math.pow(prime,i);
		}
		return hashvalue;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		char[] pattern = sc.next();
		char[] text = sc.next();
		Rabin_karp rb = new Rabin_karp();
		rb.fun(pattern,text);
	}
}