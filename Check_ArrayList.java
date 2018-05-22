import java.util.*;
import java.io.*;
class Check_ArrayList{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		//System.out.println(s);
		String s1 = Character.toString(s.charAt(0));
		System.out.println(s1);
		s = s.replaceAll(s1,"");
		System.out.println("After Rplace");
		System.out.println(s);
	}
}