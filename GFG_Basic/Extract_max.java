import java.util.*;
import java.io.*;
class Extract_max
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int maxvalue = 0;
			boolean check = false;
			String str = sc.next();
			int start =0,end = 0;
			for(int i=0;i<str.length();i++)
			{
				int value = str.charAt(i);
				if(value>=48&&value<=57)
				{
					start = i;
					check = true;
					while(check)
					{
						i++;
						value = str.charAt(i);
						if(value>=48&&value<=57){

						}
						else{
							end = i;
							check = false;
							String sub_str = str.substring(start,end);
							//System.out.println(sub_str);
							int number = Integer.parseInt(sub_str);
							if(maxvalue < number)
								maxvalue = number;
						}
					}
				}
			}
			System.out.println(maxvalue);
			t--;
		}
	}
}