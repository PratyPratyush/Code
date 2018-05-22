import java.io.*;
import java.util.*;
class array_subset
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0){
			int n_1 = sc.nextInt();
			int n_2 = sc.nextInt();
			Integer[] arr_1 = new Integer[n_1];
			Integer[] arr_2 = new Integer[n_2];
			boolean check = true;
			LinkedHashSet<Integer> lh = new LinkedHashSet<Integer>();
			for(int i=0;i<n_1;i++){
				arr_1[i] = sc.nextInt();
				lh.add(arr_1[i]);
			}
			for(int j=0;j<n_2;j++){
				arr_2[j] = sc.nextInt();
			}
			for(int i=0;i<n_2;i++){
				if(!lh.contains(arr_2[i])){check = false;break;}
			}
			if(check){System.out.println("Yes");}
			else{System.out.println("No");}
			t--;
		}
	}
}