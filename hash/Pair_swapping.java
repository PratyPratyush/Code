import java.util.*;
import java.io.*;
class Pair_swapping{
	boolean fun(Integer[] small,int smallValue,Integer[] big,int bigValue){
		HashSet<Integer> hs = new HashSet<Integer>();
		boolean check = false;
		for(int i=0;i<big.length;i++){
			hs.add(big[i]);
		}
		int value = (bigValue - smallValue)/2;
		for(int i=0;i<small.length;i++){
			if(hs.contains(small[i]+value)){
				check = true;
				break;
			}
		}
		return check;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0){
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			int sum1 = 0;
			int sum2 = 0;
			boolean check;
			Integer[] arr1 = new Integer[n1];
			Integer[] arr2 = new Integer[n2];
			Pair_swapping obj = new Pair_swapping();
			for(int i=0;i<n1;i++){
				arr1[i] = sc.nextInt();
				sum1 +=arr1[i];
			}
			for(int i=0;i<n2;i++){
				arr2[i] = sc.nextInt();
				sum2 +=arr2[i];
			}
			if(sum1<sum2)
				check = obj.fun(arr1,sum1,arr2,sum2);
			else
				check = obj.fun(arr2,sum2,arr1,sum1);
			if(check)
				System.out.println(1);
			else
				System.out.println(-1);
			t--;
		}
	}
}