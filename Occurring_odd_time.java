import java.util.*;
import java.io.*;
class Occurring_odd_time
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		 for(int i=0;i<arr.length;i++)
		 {
		 	System.out.print(arr[i]+" ");
		 }
		 System.out.println(" ");
		
		int value = arr[0];
		int p=1;
		boolean check = true;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i] == value)
			{
				p++;
			}
			else if(arr[i] != value)
			{
				
				if(p%2 != 0)
				{
					System.out.println(value);
					check = false;
					break;
				}
				value = arr[i];
				p=1;
			}
		}
		if(check){
			if(p%2 != 0){
				System.out.println(value);
			}
		}
	}
}