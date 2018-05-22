import java.util.*;
import java.io.*;
class sum_equal_sum
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			Integer[] arr = new Integer[n];
			for(int i=0;i<n;i++){
				arr[i] = sc.nextInt();
			}
			boolean check = false;
			LinkedHashSet<Integer> lh = new LinkedHashSet<Integer>();
			 for(int i=0;i<n;i++){
			 	for(int j=i+1;j<n;j++){
			 		if(lh.add(arr[i]+arr[j])){

			 		}
			 		else{
			 			check = true;
			 			i=n;
			 			break;
			 		}
			 	}
			 }
			 if(check)
			 	System.out.println(1);
			 else
			 	System.out.println(0);
			t--;
		}
	}
}