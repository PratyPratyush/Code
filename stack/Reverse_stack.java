import java.util.*;
import java.io.*;
class Reverse_stack
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0){
			String s = sc.next();
			char[] char_arr = s.toCharArray();
			Stack s_tack = new Stack();
			for(int i=0;i<char_arr.length;i++)
			{
				s_tack.push((char_arr[i]));	
			}
			while(!s_tack.empty()){
				System.out.print(s_tack.pop());	
			}
			System.out.println(" ");
			t--;
		}
	}
}