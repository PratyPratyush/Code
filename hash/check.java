import java.io.*;
import java.util.*;
class check
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0){

			int n = sc.nextInt();
			String[] s = new String[n];
			for(int i=0;i<n;i++){
				s[i] = sc.next();
			}
			Map<String,Integer> hp = new HashMap<String,Integer>();
			for(int i=0;i<n;i++){
				char[] c= s[i].toCharArray();
				Arrays.sort(c);
				String s_input = String.valueOf(c);
				if(hp.containsKey(s_input)==false){
					hp.put(s_input,1);	
				}
				else if(hp.containsKey(s_input)==true){hp.put(s_input,hp.get(s_input)+1);}

			}
			 /*Set<Map.Entry<String,Integer>> value = hp.entrySet();
			 for(Map.Entry<String,Integer> e:value){
			 	System.out.println(e.getKey()+" -------> "+e.getValue());
			 	//System.out.println(e.getValue+" ");
			}*/
			 Set<String> key = hp.keySet();
			 for(String k:key){
			     System.out.println(hp.get(k));
			 }
			t--;
		}
		
		
	}
}