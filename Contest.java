//
import java.io.*;
import java.util.*;
class Contest{
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
        long nextLong()throws IOException{
            return Long.parseLong(next());
        }
    } 
	public static void main(String args[])throws IOException{
		 FastReader fr =new FastReader();
		//Scanner fr = new Scanner(System.in);
		 System.out.println("Enter the degree of polynomial: ");
		 int n=fr.nextInt();
		 long x=(long)n;
		 System.out.println("Enter the value at which the polynomial is to be evaluated : ");
		 long y=fr.nextLong();
		 long i=0;
		 long[] arr =new long[n+1];
		 System.out.println("Enter the coefficients of the polynomial starting with lowest degree : ");
		 for(int j=0;j<n+1;j++){
		 	arr[j]=fr.nextLong();
		 }
		 System.out.print("The coefficients of polynomial are : ");
		 for(int j=n;j>=0;j--)
		 	System.out.print(arr[j]+" ");
		 System.out.println(" ");
		 long sum=0;
		 int j=0;
		 while(i<=x){
		 	sum+=Math.pow(y,i)*arr[j];
		 	j++;
		 	i++;
		 }
		 System.out.print("The value of polynomial at x=");
		 System.out.print(y+" is ");
		 System.out.println(sum);

	}
}