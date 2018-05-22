import java.io.*;
import java.util.*;
class minimum_index
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		HashSet h = new HashSet();
		String str_one = sc.next();
		String str_second = sc.next();
		boolean check = true;
		for(int i=0;i<str_second.length();i++)
		{
			h.add(str_second.charAt(i));
		}
		for(int i=0;i<str_one.length();i++)
		{
			if(h.add(str_one.charAt(i)))
				h.add(str_one.charAt(i));
			else
			{
				System.out.println(str_one.charAt(i));
				check = false;
				break;
			}
		}
		if(check)
		{
			System.out.println("No character present");	
		}
		

	}
}