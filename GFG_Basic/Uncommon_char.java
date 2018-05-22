import java.util.*;
import java.io.*;
class Uncommon_char
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			String s1 = sc.next();
			String s2 = sc.next();
			StringBuilder sb_s1 = new StringBuilder(s1);
			StringBuilder sb_s2 = new StringBuilder(s2);

			for(int i=0;i<s2.length();i++)
			{
				char c = s2.charAt(i);
				boolean check = true;
				boolean check_s1 = true;
				boolean check_s2 = true;
				if(sb_s1.indexOf(String.valueOf(c))>-1)
				{
					while(check)
					{
						int value_s1 = sb_s1.indexOf((String.valueOf(c)));
						int value_s2 = sb_s2.indexOf((String.valueOf(c)));
						if(value_s1>-1){
							sb_s1.deleteCharAt(value_s1);
						}
						else{
							check_s1 = false;
						}
						if(value_s2>-1){
							sb_s2.deleteCharAt(value_s2);
							i=0;
						}
						else{
							check_s2 = false;
						}
						if(check_s1 == false && check_s2 == false){
							check = false;
						}
					}
				}
				
			}
			sb_s1.append(sb_s2);
			String s = sb_s1.toString();
			char[] ch_arr = s.toCharArray();
			Arrays.sort(ch_arr);
			s = s.valueOf(ch_arr);
			//System.out.println(s);
			for(int i=0;i<s.length();i++)
			{
				int l =s.lastIndexOf(String.valueOf(s.charAt(i)));
				if(i==l)
					System.out.print(s.charAt(i));
				else{
					System.out.print(s.charAt(i));
					i=l;
				}
				
			}
			t--;
			System.out.println(" ");
		}
	}
}