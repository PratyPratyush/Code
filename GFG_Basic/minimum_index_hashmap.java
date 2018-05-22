import java.util.*;
import java.io.*;
class minimum_index_hashmap
{
	public static void main(String args[])
	{
		Scanner sc  = new Scanner(System.in);
		String srt_1 = sc.next();
		String str_2 = sc.next();
		boolean check = true;
		HashMap<Character,Integer> hm = new HashMap();
		for(int i=0;i<str_2.length();i++)
		{
			hm.put(str_2.charAt(i),i);
		}
		for(int i=0;i<srt_1.length();i++)
		{
			if(hm.containsKey(srt_1.charAt(i))){
				System.out.println(srt_1.charAt(i));
				check = false;
				break;
			}
		}
		if(check)
			System.out.println("Not Found");
	}
}