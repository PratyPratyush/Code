import java.io.*;
import java.util.*;
class Distinct_element{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0){
			int n = sc.nextInt();
			Integer[][] arr = new Integer[n][n];
			Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
			boolean check = true;
			for(int i=0;i<n;i++)
			{
				LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
				// if(!check){
					
				// }
				for(int j=0;j<n;j++)
				{
					arr[i][j] = sc.nextInt();
					if(check){if(hm.containsKey(arr[i][j])==false){hm.put(arr[i][j],n-1);}}
					else{
						hs.add(arr[i][j]);
					}
				}
				if(!check){
					Iterator<Integer> itr = hs.iterator();
					while(itr.hasNext()){
						Integer value = itr.next();
						if(hm.containsKey(value)==true){hm.put(value,hm.get(value)-1);}
					}
					
				}
				check = false;
				//Iterator<Integer> itr = 
			}
			int count=0;
			Set<Integer> key = hm.keySet();
			for(Integer i:key){
				if(hm.get(i)==0)
					count++;
			}
			System.out.println(count);
			// for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
			// 	System.out.println(entry.getKey()+" -----> "+entry.getValue());
			// }
			t--;
		}
		
		// LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
		// while(p>0){
		// 	hs.add(sc.nextInt());
		// 	p--;
		// }
		// Iterator<Integer> itr = hs.iterator();
		// while(itr.hasNext()){
		// 	System.out.println(itr.next());
		// }
	}
}