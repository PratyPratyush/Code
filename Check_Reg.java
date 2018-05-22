import java.util.*;
import java.util.regex.*;
import java.io.*;
class Check_Reg{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Pattern p = Pattern.compile("ab{3}");
		Matcher m = p.matcher(s);
		if(m.find())
		{
			System.out.println("yes");
		}
		else{
			System.out.println("No");
		}
	}
}