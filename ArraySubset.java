import java.io.*;
import java.util.*;
class ArraySubset{
	static void findSubset(int[] arr,List<List<Integer>> result,List<Integer> subset,int start){
		System.out.println(subset);
		result.add(new ArrayList<>(subset));
		for(int i=start;i<arr.length;i++){
			subset.add(arr[i]);
			findSubset(arr,result,subset,i+1);
			subset.remove(subset.size()-1);
		}
	}
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr =new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(arr);
		List<Integer> subset = new ArrayList<>();
		findSubset(arr,result,subset,0);
		System.out.println(result);
	}
}