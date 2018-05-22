import java.util.*;
import java.io.*;
class String_Ignore
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[122];
		String str_input  = sc.nextLine();
		String str_convert = str_input.toLowerCase();
		for(int i=0;i<str_input.length();i++)
		{
			//System.out.print(str_input.charAt(i)+" ");
			//System.out.println((int)str_input.charAt(i));
			 char c = str_convert.charAt(i);
			 arr[c]++;
			 if(arr[c]%2 !=0)
			 	System.out.print(str_input.charAt(i));
		}
		System.out.println(" ");

		//System.out.println(arr[2]);
		//System.out.println(arr[3]);
		//String s = sc.next();
		// StringBuilder sb = new StringBuilder(s);
		// for(int i=0;i<sb.length();i++)
		// {
		// 	int p = 2;
		// 	String str_sub = String.valueOf(sb.charAt(i));
		// 	int value = sb.indexOf(str_sub,i+1);
		// 	while(value > -1)
		// 	{
		// 		p++;
		// 		if(p%2 == 0)
		// 			sb = sb.deleteCharAt(value);
		// 		value = sb.indexOf(str_sub,value+1);
		// 	}
		// }
	}
}