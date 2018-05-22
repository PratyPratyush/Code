import java.util.*;
import java.io.*;
class Two_char{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String s1 = s;
		StringBuilder sb = new StringBuilder();
		StringBuilder sb_2 = new StringBuilder(s);
		//System.out.println(s1);
		char[] arr = s1.toCharArray();
		Arrays.sort(arr);
		String sort_str = String.valueOf(arr);
		System.out.println(sort_str);
		int j;
		for(int i=0;i<sort_str.length();)
		{
			sb.append(sort_str.charAt(i));
			j=sort_str.lastIndexOf(sort_str.charAt(i));
			i=j+1;
		}
		System.out.println(sb.toString());
		while(sb_2.indexOf(sb.charAt(0)))
		{
			sb_2.deleteCharAt(sb_2.indexOf(sb.charAt(0)));
		}
	}
}