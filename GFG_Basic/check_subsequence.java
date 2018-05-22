import java.util.*;
import java.io.*;
class check_subsequence
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		boolean p = true;
		while(t>0)
		{
			String a = sc.next();
			String b = sc.next();
			//boolean p = true;
			boolean check = true;
			boolean loop = false;
			//StringBuilder sb_a = new StringBuilder(a);
			//StringBuilder sb_b = new StringBuilder(b);
			int index_1 = b.indexOf(String.valueOf(a.charAt(0)));
			//sb_b.deleteCharAt(index_1);
			if(index_1>-1)
			{
				for(int i=1;i<a.length();i++)
				{
					check = true;
					int index_2 = b.indexOf(String.valueOf(a.charAt(i)) );
					if(index_1 < index_2)
					{
						index_1 = index_2;
					}
					else if(index_1 > index_2)
					{
						while(check)
						{
							index_2 = b.indexOf(String.valueOf(a.charAt(i)),index_2+1);
							if(index_1 < index_2){
								index_1 = index_2;
								check = false;
							}
							else if(index_2>-1){
								//b.deleteCharAt(temp);
							}
							else if(index_2 == -1){
								check = false;
								loop = true;
							}	
						}	
					}
					else{
						p = false;
						break;
					}
					if(loop){
						p = false;
						break;
					}
				}
			}
			
			if(p)
				System.out.println(1);
			else
				System.out.println(0);
			t--;
		}
	}
}