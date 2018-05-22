//
import java.io.*;
import java.util.*;
class Dharm{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		int n= sc.nextInt();
		int l = sc.nextInt();
		int[] arr =new int[l];
		int[] arr2 = new int[100];
		for(int i=0;i<l;i++){
			arr[i]=sc.nextInt();
		}
		int sum=0,k=7,p=0,index=0;
		for(int i=0;i<l;i++){
			int value = arr[i];
			int sift = 8-n;
			value = value<<sift;
			for(int j=0;j<n;j++){
				if(p==8){
					arr2[index]=sum;
					sum=0;
					p=0;k=7;index++;
				}
				if(((value<<j)&1<<7)>0){
					sum=sum+(1<<k);
				}
				p++;k--;
			}
		}
		arr2[index]=sum;
		int v = n*l;
		if(v%8==0)
			index=v/8;
		else
			index = (v/8)+1;
		System.out.println(index);
		for (int i=0; i<index ;i++) {
			System.out.println(arr2[i]);
		}
		//System.out.println(sum);
	}
}