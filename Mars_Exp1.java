import java.util.*;
import java.io.*;
class Mars_Exp1{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = "SOS";
		String s_input = sc.next();
		int i=0;
		int j=3;
		int count=0;
		int f_count = 0;
		while(j< s_input.length()+1)
		{
			String sub_string = s_input.substring(i,j);
			  int check = s.compareTo(sub_string);
			  if(check==0)
			  {
			  	count++;
			  }
			  else{
			  	for (int p=0;p<3 ;p++ ) {
			  		if(s.charAt(p)!=sub_string.charAt(p))
			  		{
			  			f_count++;
			  		}
			  		
			  	}

			  }
			//System.out.println(s_input.substring(i,j));
			 i=j;
			 j=j+3;
		}
		 System.out.println(count);
		 System.out.println(f_count);
		 System.out.println(s_input.length()/3);
	}
}