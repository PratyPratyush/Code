import java.util.*;
import java.io.*;
class Sreduce{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s_one = sc.nextLine();
		//System.out.println(s_one);
		char[] arr = s_one.toCharArray();
		Arrays.sort(arr);
		String s = String.valueOf(arr);
		//System.out.println("After accending order");
		//System.out.println(s);
		int p=0;
			for (int i=0;i<s.length();) {
				int j=s.lastIndexOf(s.charAt(i));
				//System.out.println(i);
				//System.out.println(j);
				if((j-i+1)%2==0) 
					{
						i=j+1;
					}
				else{
					System.out.println(s.charAt(i));
					p=1;
					i=j+1;
				}
			}
			if(p==0){
				System.out.println("Empty String");
			}
		
	}
}