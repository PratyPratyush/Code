import java.io.*;
import java.util.*;
class Red{
	public static void main(String args[])throws IOException{
		Scanner sc =new Scanner(System.in);
		
		//FileWriter fw=new FileWriter("Demo2.txt");
		long t = sc.nextInt();
		for(int k=1;k<=t;k++){
			FileReader fr=new FileReader("Demo.txt");
			String s = sc.next();
			//long n=sc.nextLong();
			long n = Long.parseLong(s);
			int i =fr.read();
			long count=0;
			System.out.print("Case #"+k+": ");
			while(i!=-1){
				count++;
				if(n==count){
					System.out.print((char)i);
					break;
				}
				i =fr.read();
			}
			System.out.println(" ");
			fr.close();
		}
		
		// int i = fr.read();
		// System.out.println(i);
		// i=fr.read();
		// System.out.println(i);
		//========================
		// String rd = "Demo.txt";
		// String wr = "Demo2.txt";
		// int t = sc.nextInt();
		// while(t-->0){
		// 	fr = new FileReader(rd);
		// 	fw = new FileWriter(wr);
		// 	long count=0;
		// 	int i = fr.read();
		// 	while(i!=-1){
		// 		fw.write(i);
		// 		count++;
		// 		//fw.write("\n");
		// 		i=fr.read();
		// 	}
		// 	fr = new FileReader(rd);
		// 	long half=(count+1)/2;
		// 	fw.write(48);
		// 	long count2=0;
		// 	int j = fr.read();
		// 	while(j!=-1){
		// 		count2++;
		// 		if(count2-half==0)
		// 			fw.write(49);
		// 		else
		// 			fw.write(j);
		// 		j=fr.read();
		// 	}
		// 	fr.close();
		// 	fw.close();
		// 	String temp = rd;
		// 	rd = wr;
		// 	wr = temp;
		// }
		

	}
}