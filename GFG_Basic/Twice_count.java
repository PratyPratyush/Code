import java.util.*;
import java.io.*;
class Twice_count
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			String[] str = new String[n];
			for(int i=0;i<n;i++)
			{
				str[i] = sc.next();
			}
			Arrays.sort(str);
			int p=0;
			int count = 1;
			String s = str[0];
			for(int i=1;i<n;i++)
			{
				if(s.compareTo(str[i]) == 0){
					count++;
				}
				else{
					if(count == 2)
					{
						p++;
					}
					s = str[i];
					count = 1;
				}
			}
			if(count == 2)
				p++;
			System.out.println(p);
			t--;

		}
	}
}