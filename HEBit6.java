//===================MYSTERY 1=============
import java.io.*;
import java.util.*;
class HEBit6{
	public static void main(String args[])throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String s = br.readLine();
			if(s==null) break;
			long n = Long.parseLong(s);
			int count=0;
			while(n>0){
				n=n&(n-1);
				count++;
			}
			System.out.println(count);
		}
	}
}