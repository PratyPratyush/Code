//
import java.io.*;
import java.util.*;
class Ramj{
	
	public static void main(String args[])throws IOException{
		// FastReader fr =new FastReader();
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String[] str1 =br.readLine().split(" ");
		String[] str2 = br.readLine().split(" ");
		int n1=str1.length;
		int n2=str2.length;
		int[] a = new int[n1];
		int[] b = new int[n2];
		for(int i=0;i<n1;i++){
			a[i]=Integer.parseInt(str1[i]);
		}
		for(int i=0;i<n2;i++){
			b[i]=Integer.parseInt(str2[i]);
		}
		int i,j;
		for(i=0,j=0;(i<n1)&&(j<n2);){
			if(a[i]==b[j]){
				i++;j++;
			}
			else if(a[i]>b[j]) {
				//System.out.print(a[i]+" ");
				j++;

			}
			else if(a[i]<b[j]){
				System.out.print(a[i]+" ");
				i++;
			}
		}
		while(i<n1){
			System.out.print(a[i]+" ");i++;
		}
		// int k;
		// if((j>n2-1)&(i<n1)) k=i+1;

		// for(int k=i;k<n1;k++){
		// 	System.out.print(a[i]+" ");
		// }
		// System.out.println(" ");
		// System.out.println(i+" "+j);
	}
}