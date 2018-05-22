import java.io.*;
import java.util.*;
class PriorityDemo2{
	public static void main(String args[])throws IOException{
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		// PriorityQueue<Integer> pq =new PriorityQueue<>(10,new Comparator<Integer>(){
  //          public int compare(Integer p1,Integer p2){
  //              return p2.compareTo(p1);
  //          }
  //      });
		TreeMap<Integer,Integer> tm =new TreeMap<Integer,Integer>();
		while(n-->0){
			int a = sc.nextInt();
			if(tm.containsKey(a))
				tm.put(a,tm.get(a)+1);
			else
				tm.put(a,1);
		}
		System.out.println(tm);
		for(Map.Entry<Integer,Integer> e:tm.entrySet()){
			System.out.println(e.getValue()+" "+e.getKey());
		}
		
	}
}