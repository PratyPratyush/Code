import java.io.*;
import java.util.*;
class K_th_Distinct
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t>0){
			int n= sc.nextInt();
			int k = sc.nextInt();
			Integer[] arr = new Integer[n];
			Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
				if(hm.containsKey(arr[i])==false)
					hm.put(arr[i],1);
				else{
					hm.put(arr[i],hm.get(arr[i])+1);
				}
			}
			Set<Integer> key = hm.keySet();
			int value=0;
			for(Map.Entry m:hm.entrySet()){
				System.out.println(m.getKey()+" -----> ");
			}
			for(Integer i:key){
				if(hm.get(i)==1){
					//System.out.println(i);
					value++;
					if(value==k)
						System.out.println(i);
				}
			}
			t--;
		}
	}
}