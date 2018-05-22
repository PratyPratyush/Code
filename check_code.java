import java.util.*;
import java.io.*;
class check_code
{
	public static void main(String args[])
	{
		//Scanner sc = Scanner(System.in);
		//String input_s = sc.next();
		//String s = "dfkjdlssasdkljklppskp";
		//System.out.println(s.lastIndexOf('p'));
		//String s_mdfi = s.replace('p','z');
		//System.out.println(s_mdfi);
		String s = "my_be_work";
		StringBuilder sb = new StringBuilder();
		sb.append("my_be_work");
		//sb.setCharAt(3,'z');
		//sb.insert(2,'w');
		sb.reverse();
		String s2 = sb.toString();
		System.out.println(sb);
	}
}