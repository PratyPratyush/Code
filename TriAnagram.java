import java.io.*;
import java.util.*;
class TriAnagram{
	//;
	static class StrNode{
		String data;
		int index;
		public StrNode(String s,int i){
			data = s;
			index=i;
		}
	}
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
			int n = sc.nextInt();
			String[] str = new String[n];
			for(int i=0;i<n;i++){
				str[i]=sc.next();
			}
			StrNode[] arr = new StrNode[n];
			for(int i=0;i<n;i++){
				char[] ch = str[i].toCharArray();
				Arrays.sort(ch);
				arr[i]=new StrNode(String.valueOf(ch),i);
			}
			Arrays.sort(arr,new Comparator<StrNode>(){
				public int compare(StrNode p1,StrNode p2){
					return p1.data.compareTo(p2.data);
				}
			});
			for(int i=0;i<n;i++){
				//System.out.println(arr[i].data+" --- "+arr[i].index);
				System.out.print(str[arr[i].index]+" ");
			}
			System.out.println(" ");
		}
	}
}