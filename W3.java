import java.io.*;
import java.util.*;
class W3{
	public static void main(String args[])throws IOException{
		Scanner sc = new Scanner(System.in);;
		int n = sc.nextInt();
		String s1 = "Stack";
		String s2 = "Green";
		int k=1;int p=0;boolean check=false;
		while(true){
			for(int i=0;i<k;i++){
				if(p==n) {check=true;break;}
				System.out.println(s1);
				p++;
			}
			if(check) break;
			for(int i=0;i<k;i++){
				if(p==n) {check=true;break;}
				System.out.println(s2);
				p++;
			}
			if(check) break;
			k++;
		}
		//System.out.println(" ");
	}
}