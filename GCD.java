import java.io.*;
import java.util.*;
class GCD{
	static int gcd(int a,int b){
		if(a%b==0)
			return b;
		return (gcd(b,a%b));
	}
	public static void main(String args[]){
		int a=1701;int b=3768;
		int g = gcd(a,b);
		System.out.println(g);
	}
}