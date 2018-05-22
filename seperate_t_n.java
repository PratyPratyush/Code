import java.util.*;
import java.io.*;
class seperate_t_n{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
// 		String s_input = sc.next();
// 		int i=0;
// 		int j=1;
// 		int value = Integer.pareseInt(charAt(i));

// 		while(j<s_input.length())
// 		{
// 			String inc_str = Integer.toString(value+1) ;
// 			int len = inc_str.length();
// 			if(j+len>s_input.length())
// 			{
// 				break;
// 			}
// 			String sub_str = s_input.substring(j,j+len);
// 			if(Integer.pareseInt(inc_str) == Integer.pareseInt(sub_str))
// 			{
// 				value = Integer.pareseInt(inc_str);
// 				j = j+len;
// 			}
// 			else{
// 			check =1;
// 			}
// ============================================================================================
			String s_input = sc.next();
			int i=0;
			int p=0;
			int check = 0;
			int start_value = 0;
			int begin_value = 0;
			int value = Integer.parseInt(Character.toString(s_input.charAt(0)));
			if (s_input.length()>1) 
			{
				if(value==0)
				{
				check = 1;
				}
				else if(value>0)
				{
					for( i=0;i<s_input.length() ;i++ ) {
						 value = Integer.parseInt(s_input.substring(0,i+1));
						String inc_str = Integer.toString(value+1);
						if(i+inc_str.length()>=s_input.length())
						{
							check =1;
							break;
						}
						String sub_str = s_input.substring(i+1,i+1+inc_str.length());
						if(Integer.parseInt(inc_str)==Integer.parseInt(sub_str))
						{
							start_value  = value;
							begin_value = Integer.parseInt(sub_str);
							p=1;
							i = i+inc_str.length()+1;
							break;
						}
					
					}
				}	
			}
			else{
				check =1;
			}
			
			if(p==1)
			{
				while(i<s_input.length())
				{
					String inc_str = Integer.toString(begin_value+1);
					if(i+inc_str.length()-1>s_input.length())
					{
						break;
					}
					String sub_str = s_input.substring(i,i+inc_str.length());
					if(Integer.parseInt(inc_str) == Integer.parseInt(sub_str))
					{
						i=i+sub_str.length();
						begin_value = Integer.parseInt(sub_str);
					}
					else{
						check = 1;
						break;
					}
				}
			}
			if(check==1)
			{
				System.out.println("NO");
			}
			else{
				System.out.print("YES ");
				System.out.println(start_value);
			}

		}
		
}