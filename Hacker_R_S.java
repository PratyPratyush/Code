import java.util.*;
import java.io.*;
class Hacker_R_S
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = "hackerrank";
		//System.out.println(s.charAt(0));
		//int i = s.indexOf(s.charAt(3),4);
		//System.out.println(i);
		String s_input = sc.nextLine();
		int p =0;
		int j=0;
		int check = 0;
		for (int i=0;i<s.length(); i++) {
			check = s_input.indexOf(s.charAt(i),j);
			if(check>-1)
			{
				j=check+1;
				if(j>s_input.length())
				{
					p=1;
					break;
				}
			}
			else{
				p=1;
				break;
			}
			
		}
		if(p==1)
		{
			System.out.println("No");
		}
		else{
			System.out.println("Yes");
		}
	}
}