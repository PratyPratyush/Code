import java.util.*;
import java.io.*;
class First_program
{
	int fun(int n)
	{
		if(n==1)
			return 1;
		//System.out.println(fun(n-1));
		return(n+fun(n-1));
		//return n;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		First_program a = new First_program();
		int n = sc.nextInt();
		System.out.println(a.fun(n));
	}
}