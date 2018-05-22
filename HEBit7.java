////===================MYSTERY 2=============
import java.io.*;
import java.util.*;
class HEBit7{
	public static void main(String args[])throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String s = br.readLine();
			if(s==null) break;
			long n = Long.parseLong(s);
			long cal=0;
			long i=0;
			while(n>0){
				if((n&1)>0) break;
				n=n>>1;
				i++;
			}
			if(n==0) System.out.println(0);
			else System.out.println(1<<i);
		}
	}
}