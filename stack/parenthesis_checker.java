import java.io.*;
import java.util.*;
class Parenthesis_checker
{
	boolean fun(char ch,char[] stack_arr,int top)
	{
		if(ch==']')
		{
			if(stack_arr[top] == '[')
				return true;
			else
				return false;
		}
		else if(ch=='}')
		{
			if(stack_arr[top] == '{')
				return true;
			else
				return false;
		}
		else if(ch==')')
		{
			if(stack_arr[top] == '(')
				return true;
			else 
				return false;
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Parenthesis_checker pc = new Parenthesis_checker();
		int t= sc.nextInt();
		while(t>0)
		{
			int top = -1;
			String s = sc.next();
			char[] char_arr = s.toCharArray();
			char[] stack_arr = new char[char_arr.length];
			for(int i=0;i<char_arr.length;i++)
			{
				System.out.println(char_arr[i]);
			}
			for(int i=0;i<char_arr.length;i++)
			{
				if(char_arr[i]=='(' || char_arr[i]=='{' || char_arr[i]=='[')
				{
					top++;
					stack_arr[top] = char_arr[i];
				}
				else
				{
					if(pc.fun(char_arr[i],stack_arr,top)){
						top--;
					}
					else{
						System.out.println("not balanced");
						break;
					}
				}
			}
			if(top == -1){
				System.out.println("balanced");
			}
			t--;
		}
	}
}