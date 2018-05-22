import java.util.*;
import java.io.*;
class Infix_to_postfix
{
	int fun(char ch)
	{
		if(ch=='+'|| ch=='-' ){
			return 1;
		}
		else if(ch=='*' || ch=='/')
		{
			return 2;
		}
		else if(ch=='^'){
			return 3;
		}
		else{
			return -1;
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Infix_to_postfix a = new Infix_to_postfix();
		String s = sc.next();
		char[] stack_arr = new char[s.length()];
		char[] char_arr = s.toCharArray();
		//System.out.println(stack_arr.length);
		//System.out.println(char_arr[0]);
		int top = -1;
		for(int i=0;i<char_arr.length;i++)
		{
			if(char_arr[i]=='(' || char_arr[i]==')'){
				if(char_arr[i] == '('){
					top++;
					stack_arr[top] = char_arr[i];
				}
				else if(char_arr[i] == ')'){
					boolean check = true;
					while(check){
						if(stack_arr[top] == '('){
							top--;
							check = false;
						}
						else{
							System.out.print(stack_arr[top]);
							top--;
						}
					}
				}
			}
			else if(a.fun(char_arr[i]) == -1){
				System.out.print(char_arr[i]);
			}
			else{
				if(top == -1){
					top++;
					stack_arr[top] = char_arr[i];
				}
				else{
					boolean check_2 = true;
					while(check_2){
						if(top == -1){
							top++;
							stack_arr[top] = char_arr[i];
							check_2 = false;
						}
						else{
							int stack_value = a.fun(stack_arr[top]);
							int char_value = a.fun(char_arr[i]);
							if(char_value > stack_value){
								top++;
								stack_arr[top] = char_arr[i];
								check_2 = false;
							}
							else{
								System.out.print(stack_arr[top]);
								top--;
							}
						}
						
					}
					
				}
			}
		}
		 for(int i=0;i<=top;i++)
		 {
		 	System.out.println(stack_arr[top]);
		 	top--;
		 }
	}
}