import java.util.*;
import java.io.*;
class Evalutaion_of_postfix
{
	int fun(char ch)
	{
		if(ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='^'){
			return 0;
		}
		else{
			return 1;
		}
	}
	int fun2(int a,int b,char ch){
		if(ch == '+'){
			return b+a;
		}
		else if(ch == '*'){
			return b*a;
		}
		else if(ch == '-'){
			return b-a;
		}
		else if(ch == '/'){
			return b/a;
		}
		else if(ch == '^'){
			return b^a;
		}
		else
			return 0;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int top = -1;
			String s = sc.next();
			Evalutaion_of_postfix a = new Evalutaion_of_postfix();
			int[] stack_arr = new int[s.length()];
			char[] char_arr = s.toCharArray();
			for(int i=0;i<char_arr.length;i++)
			{
				if(a.fun(char_arr[i]) == 1){
					top++;
					stack_arr[top] = Character.getNumericValue(char_arr[i]);
				}
				else{
					int value = a.fun2(stack_arr[top],stack_arr[top-1],char_arr[i]);
					top = top-1;
					stack_arr[top] = value;
				}
			}
			//System.out.println((int)char_arr[0]);
			//System.out.println(Character.getNumericValue(char_arr[0]));
			System.out.println(stack_arr[top]);
			t--;
		}
	}
}