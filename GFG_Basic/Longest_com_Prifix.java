import java.util.*;
import java.io.*;
import java.util.regex.*;
class Longest_com_Prifix
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			String str_value = " ";
			int n = sc.nextInt();
			String[] s_arr = new String[n];
			for(int i=0;i<n;i++)
			{
				s_arr[i] = sc.next();
			}
			String s = s_arr[0];
			int check_sec  = 0;
			int j=0;
			for(int i=0;i<s.length();i++)
			{
				j=i;
				boolean check = true;
				int count = 0;
				while(check)
				{
					count = 0;
					String sub_str = s.substring(i,j+1);
					Pattern p = Pattern.compile(sub_str);
					for(int k =1;k<s_arr.length;k++)
					{
						Matcher m = p.matcher(s_arr[k]);
						if(m.find())
						{
							count++;
						}
					}
					if(count == n-1)
					{
						check = true;
						if(check_sec == 0)
						{

							str_value = sub_str;
							//System.out.println(str_value+"check");
							check_sec = 1;
						}
						else{
							if(str_value.length()<sub_str.length()){
								str_value = sub_str;
							}
						}
					}
					else{
						check = false;
					}
					j++;
				}
			}
			System.out.println(str_value);
			t--;
		}
		
		
	}
}