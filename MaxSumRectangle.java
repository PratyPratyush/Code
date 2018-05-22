//===========Maximum Sum Rectangular Submatrix in Matrix dynamic programming/2D kadane======
import java.io.*;
import java.util.*;
class MaxSumRectangle{
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
		int t =fr.nextInt();
		while(t-->0){
			int r=fr.nextInt();
			int c=fr.nextInt();
			int[][] arr =new int[r][c];
			for(int i=0;i<r;i++){
				for(int j=0;j<c;j++){
					arr[i][j]=fr.nextInt();
				}
			}
			int[] kd_arr = new int[r];
			int max_l=0,max_r=0,max_up=0;max_dn=0;
			for(int i=0;i<c;i++){

				// for(int p=0;p<r;p++)
				// 	kd_arr[p]=arr[r][i];
				for(j=i;j<c;j++){
					for(int p=0;p<r;p++)
						kd_arr[i]=kd_arr[i]+arr[p][j];
					int max=Integer.MIN_VALUE,temp=0;
					for(int p=0;p<r;p++){
						if()
					}
				}
			}
		}
	}
}