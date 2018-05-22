import java.util.*;
import java.io.*;
import java.util.regex.*;
class Mars_Exp{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s_input = sc.nextLine();
		int no_word = s_input.length()/3;
		int count = 0;
		Pattern p = Pattern.compile("SOS");
		Matcher m = p.matcher(s_input);
		while(m.find())
		{
			count++;
		}
		System.out.println(no_word);
		System.out.println(count);
		System.out.println(no_word-count);

	}
}