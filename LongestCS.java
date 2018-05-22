//============Longest Common Subsequence================
import java.io.*;
import java.util.*;
class LongestCS{
	static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br =new BufferedReader(new InputStreamReader(System.in));
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
    } 
	public static void main(String args[])throws IOException{
		FastReader fr =new FastReader();
		int t = fr.nextInt();
		while(t-->0){
			int len1 = fr.nextInt();
			int len2 = fr.nextInt();
			char[] col=fr.next().toCharArray();
			char[] row = fr.next().toCharArray();
			int[][] arr =new int[len2+1][len1+1];
			for(int i=0;i<=len2;i++){
				for(int j=0;j<=len1;j++){
					if(i==0||j==0)
						arr[i][j]=0;
					else if(row[i-1]!=col[j-1]){
						arr[i][j]=Math.max(arr[i-1][j],arr[i][j-1]);
					}
					else{
						arr[i][j]=arr[i-1][j-1]+1;
					}
				}
			}
			for(int i=0;i<=len2;i++){
				for(int j=0;j<=len1;j++){
					System.out.print(arr[i][j]+" ");
				}
				System.out.println(" ");
			}
		}
	}
}