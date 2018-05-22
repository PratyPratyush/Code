//
import java.io.*;
import java.util.*;
class SubSet{
	//static int n=0;
	static void sub(int[] arr,ArrayList<Integer> subset,List<List<Integer>> result,int index){
		result.add(new ArrayList<>(subset));
		for(int i=index;i<arr.length;i++){
			subset.add(arr[i]);
			sub(arr,subset,result,i+1);
			subset.remove(subset.size()-1);
		}
	}
	public static void main(String args[])throws IOException{
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr =new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		ArrayList<Integer> subset =new ArrayList<Integer>();
		List<List<Integer>> result = new ArrayList<>();
		sub(arr,subset,result,0);

		System.out.println(result);
	}
}