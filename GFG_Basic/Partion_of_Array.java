import java.util.*;
import java.lang.*;
import java.io.*;

class Partion_of_Array {
	public static void main (String[] args) {
		Scanner sc =new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i] = sc.nextInt();
		    }
		    int big = 0;
		    int value = -1;
		    boolean check = false;
		    for(int i=0;i<n-1;i++)
		    {
		        if(arr[i]<arr[i+1]){
		            if(arr[i]>big){
		                check = true;
		            }
		        }
		        else{
		            if(arr[i]>big){
		                big = arr[i];
		            }
		        }
		        if(check) {
		            value = arr[i];
		            for(int j=i+1;j<n;j++){
		                if(value>arr[j]){
		                    check = false;
		                    i=j;
		                    value = -1;
		                    break;
		                }
		                else{
		                    big = arr[j];
		                    }
		                    i=j;
		                }
		            }
		        }
		        System.out.println(value);
		        t--;
		    }
		}
		
	}