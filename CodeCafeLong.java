import java.io.*;
import java.util.*;
class CodeCafeLong{
	public static void main(String args[])throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int t =Integer.parseInt(br.readLine());
		while(t-->0){
			int n = Integer.parseInt(br.readLine());
			int[][] arr =new int[n][n];
			int k=0;
			for(int p=0;p<n;p++){
				String[] str = br.readLine().split(" ");
				int[] a =new int[n];
				for(int i=0;i<str.length;i++)
						a[i] = Integer.parseInt(str[i]);
				Arrays.sort(a);
				//i=i-1;
				for(int j=0;j<n;j++)
						arr[k][j] = a[j];
				k++;
			}
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					System.out.print(arr[i][j]+" ");
				}
				System.out.println(" ");
			}
			//System.out.println(" ");
			long sum=0;
			int count = 0;
			int prev = -1;
			int j=n-1;
			for(int i=n-1;i>=0;i--){

				boolean check= false;
				if(arr[i][j]<prev||prev==-1){
					prev = arr[i][j];sum+=arr[i][j];count++;
				}
				else{
					j--;
					while(true){
						if(j==-1){
							check=true;
							break;
						}
						if(arr[i][j]<prev){
							prev = arr[i][j];sum+=arr[i][j];count++;break;
							}
						j--;
					}

				}
				if(check) break;
				j = n-1;
			}
			//System.out.println(count+" "+sum);
			if(count==n)
				System.out.println(sum);
			else
				System.out.println(-1);
		}
	}
}