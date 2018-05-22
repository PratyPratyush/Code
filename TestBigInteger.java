import java.io.*;
import java.math.*;
import java.util.*;
class TestBigInteger{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		BigInteger n = new BigInteger("22");
		BigInteger result = n.multiply(new BigInteger("3")).add(new BigInteger("3")).mod(new BigInteger("10"));
		System.out.println(result);
		BigInteger a =BigInteger.valueOf(12345L);
		System.out.println(a);
	}
}