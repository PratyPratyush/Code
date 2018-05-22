import java.io.*;
import java.util.*;
class Minimum_distinct
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		// int t = sc.nextInt();
		//  while(t>0)
		//  {
		//  	int n = sc.nextInt();
		//  	Integer[] arr = new Integer[n];
		//  	Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
		//  	for(int i=0;i<n;i++){
		//  		arr[i] = sc.nextInt();
		//  		if(mp.containsKey(arr[i])==false){
		//  			mp.put(a[i],1);
		//  		}
		//  		else if(m.containsKey(arr[i])){
		//  			m.put(a[i],mp.get(a[i])+1);
		//  		}
		//  	}
		//  	t--;
		// }
		int m = sc.nextInt();
		 int n=sc.nextInt();
		 Integer a[] = new Integer[n];
		 Map<Integer,Integer> mp = new HashMap<Integer,Integer>();
		 System.out.println("Enter element in array");
		 for(int i=0;i<n;i++){
		 	a[i] = sc.nextInt();
		 	if(mp.containsKey(a[i])==false){
		 		mp.put(a[i],1);
		 	}
		 	else if(mp.containsKey(a[i])==true){
		 		mp.put(a[i],mp.get(a[i])+1);
		 	}
		 }
		 Set<Map.Entry<Integer,Integer>> value = mp.entrySet();
		 for(Map.Entry<Integer,Integer> e:value){
		 	//System.out.println(e.getKey()+"----> "+e.getValue());
		 	if(e.getKey()<= m){
		 		System.out.println(e.getKey());
		 		m = m - e.getKey();
		 	}
		 }

	}
}