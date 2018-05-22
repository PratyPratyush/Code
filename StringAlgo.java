//==============KMP Algorithm======================
import java.io.*;
import java.util.*;
class StringAlgo{
	static class FastReader{
		BufferedReader br;
		StringTokenizer st;
		public FastReader(){
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		String next()throws IOException{
			while(st==null||!st.hasMoreTokens()){
				st = new StringTokenizer(br.readLine());
			}
			return st.nextToken();
		}
		int nextInt()throws IOException{
			return Integer.parseInt(next());
		}
		long nextLong()throws IOException{
			return Long.parseLong(next());
		}
	}
	static int[] fun(String pattern){
		int len = pattern.length();
		char[] ch = pattern.toCharArray();
		int[] arr = new int[len];
		int index=0;
		for(int i=1;i<len;){
			if(ch[index]==ch[i]){
				arr[i]=index+1;
				i++;index++;
				//System.out.println("hello");
			}
			else{
				if(index!=0)
					index=arr[index-1];
				else{
					arr[i]=0;
					i++;
				}
			}
		}
		//System.out.println("Exceute");
		return arr;
	}
	public static void main(String args[])throws IOException{
		FastReader fr =new FastReader();
		int t = fr.nextInt();
		while(t-->0){
			String pattern = fr.next();
			char[] char_pattern = pattern.toCharArray();
			String text = fr.next();
			char[] char_text = text.toCharArray();
			int[] arr = fun(pattern);
			int i=0,j=0;
			for(int p=0;p<arr.length;p++){
				System.out.print(arr[p]+" ");
			}
			System.out.println(" ");
			while((i<char_text.length)&&(j<char_pattern.length)){
				if(char_text[i]==char_pattern[j]){
					i++;j++;
				}
				else{
					if(j!=0)
						j = arr[j-1];
					else{
						i++;
					}
				}
				// if(j==pattern.length()){
				// 	System.out.println("Yes : "+i);
				// 	j=0;
				// }
				if(j==pattern.length()){
					System.out.println("Yes index: "+(i-1));
					j=arr[j-1];
				}

			}
			// if(j==pattern.length())
			// 	System.out.println("Yes : "+i);
			// else
			// 	System.out.println("not Exist");
		}
	}
}