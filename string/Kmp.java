import java.util.*;
import java.io.*;
class Kmp
{
	void prefix_table(char[] pattern,int[] arr_patt){
		int j=0;
		arr_patt[0]=0;
		int i=1;
		while(i<pattern.length){
			if(pattern[i]==pattern[j]){
				arr_patt[i]=j+1;
				j++;
				i++;
			}
			else if(j>0){
				j=arr_patt[j-1];
			}
			else{
				arr_patt[i]=0;
				i++;
			}
		}
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter pattern");
		String s = sc.next();
		char[] pattern = s.toCharArray();
		int[] arr_patt = new int[pattern.length];
		System.out.println("Enter text");
		s = sc.next();
		char[] text = s.toCharArray();
		Kmp k = new Kmp();
		k.prefix_table(pattern,arr_patt);
		// for(int i=0;i<arr_patt.length;i++){
		// 	System.out.print(arr_patt[i]+" ");
		// }
		// System.out.println(" ");\
		int i=1;
		int j=0;
		while(i<text.length){
			if(pattern[i] == text[i]){
				if(j==pattern.length-1){
					System.out.println(i-j+"index of String value");
					break;
				}
				else{
					i++;
					j++;	
				}
				
			}
			else if(j>0){
				j=arr_patt[j-1];
			}
			else{
				i++;
			}
		}
	}
}