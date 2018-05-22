import java.util.*;
import java.io.*;
class Absolute_diff
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int k = sc.nextInt();
			Integer[] arr = new Integer[n];
			LinkedHashMap<Integer,Integer> hm = new LinkedHashMap<Integer,Integer>();
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
				hm.put(arr[i],Math.abs(arr[i]-k));
			}
			Set<Map.Entry<Integer,Integer>> set = hm.entrySet();
			List<Map.Entry<Integer,Integer>> ls = new ArrayList<Map.Entry<Integer,Integer>>(set);
			Collections.sort(ls,new Comparator<Map.Entry<Integer,Integer>>()
			{
				public int compare(Map.Entry<Integer,Integer> a,Map.Entry<Integer,Integer> b){
					return (a.getValue()).compareTo(b.getValue());
				}
			});
		  	for(Map.Entry<Integer,Integer> m:ls)
		  	{
		  		System.out.print(m.getKey()+" ");
		  	}
		  	System.out.println(" ");
			t--;
		}
		
	}
}
// class MyComparator implements Comparator
// {
// 	public int compare(Map.Entry<Integer,Integer> a,Map.Entry<Integer,Integer> b)
// 	{
// 		return (a.getValue()).compareTo(b.getValue());
// 	}
// }