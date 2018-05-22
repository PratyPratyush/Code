import java.io.*;
import java.util.*;
class In_first_but_second
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0){
			int n_1 = sc.nextInt();
			int n_2 = sc.nextInt();
			Integer[] arr_1 = new Integer[n_1];
			Integer[] arr_2 = new Integer[n_2];
			LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
			for(int i=0;i<n_1;i++){
				arr_1[i] = sc.nextInt();
			}
			for(int i=0;i<n_2;i++){
				arr_2[i] = sc.nextInt();
				hs.add(arr_2[i]);
			}
			for(int i=0;i<n_1;i++){
				if(!hs.contains(arr_1[i])){System.out.print(arr_1[i]+" ");}

			}
			System.out.println(" ");
			t--;
		}
	}
}