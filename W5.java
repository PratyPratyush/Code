import java.io.*;
import java.util.*;
class W5{
	public static void main(String args[])throws IOException{
		Scanner sc =new Scanner(System.in);
		char[] ch =sc.next().toCharArray();
		HashMap<Character,Integer> hm =new HashMap<Character,Integer>();
		for(int i=0;i<ch.length;i++){
			if(hm.containsKey(ch[i]))
				hm.put(ch[i],hm.get(ch[i])+1);
			else
				hm.put(ch[i],1);
		}
		int sum=0,p=0;
		int max=-1;
		for(Map.Entry<Character,Integer> e:hm.entrySet()){
			int value=e.getValue();
			sum+=value;
			if(value>max) max=value;
		}
		//System.out.println(sum+" "+p);
		System.out.println(sum-max);
		//System.out.println(hm.size());
	}
}