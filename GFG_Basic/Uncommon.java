import java.util.*;
import java.io.*;
class Uncommon
{
	public static void main(String args[])
	{

		 Scanner sc = new Scanner(System.in);
		 int t = sc.nextInt();
		 while(t>0)
		 {
		 	int[] arr = new int[26];
		 	String srt_1 = sc.next();
		 	String srt_2 = sc.next();
		 	for(int i=0;i<srt_1.length();i++)
		 	{
		 		int index = srt_1.charAt(i)-'a';
		 		if(arr[index] == 0)
		 			arr[index]=1;
		 	}
		 	for(int i=0;i<srt_2.length();i++)
		 	{
		 		int index = srt_2.charAt(i)-'a';
		 		if(arr[index]==0||arr[index]==1)
		 			arr[index]++;
		 	}
		 	for(int i=0;i<arr.length;i++)
		 	{
		 		if(arr[i]==1)
		 		{
		 			int value = 'a'+i;
		 			System.out.print((char)value);
		 		}
		 	}
		 	System.out.println(" ");
		 	t--;
		 }
		 

		// String s = "character";
		// int i = 'a'-'c';
		// arr['a'-'a'] = 1;
		// arr['b' - 'a'] = 1;
		// //System.out.println(i);
		// //System.out.println()
		// System.out.println(arr[0]);
		// System.out.println(arr[1]);

	}
}