import java.io.*;
import java.util.*;
class W4{
	static int gcd(int a,int b){
		if(a%b==0) return b;
		return gcd(b,a%b);
	}
	public static void main(String args[])throws IOException{
		Scanner sc = new Scanner(System.in);;
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = gcd(a,b);
		int result=  (a*b)/x;
		System.out.println(result);
	}
}