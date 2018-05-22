import java.io.*;
import java.util.*;
class Long2Check{
	public static void main(String args[])throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
			String[] str = br.readLine().split(" ");
			int n = Integer.parseInt(str[0]);
			int k = Integer.parseInt(str[1]);
			int q=k;
			str = br.readLine().split(" ");
			int[] arr = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = Integer.parseInt(str[i]);
			long cal = Integer.MIN_VALUE;
			long max = Integer.MIN_VALUE;
			long a=0;long b=0;long c=0;
			int count=1;
			long fin=0;
			boolean check=false;
			while(k-->0){
				for(int i=0;i<n;i++){
					if(cal<0&&arr[i]<0){
						if(arr[i]>cal)
							cal = arr[i];
					}
					else if(cal>-1||arr[i]>-1){
						if(cal<0) cal = arr[i];
						else
							cal = cal+arr[i];
					}
					if(cal>max)
						max=cal;
				}
				if(count<=3){
				    if(count==1)
				        a=max;
				    else if(count==2)
				        b=max;
				    else if(count==3)
				        c=max;
				    count++;
				    if(count==4){
				    	if(a==b&&b==c){
				    		fin=a;
				    		check=true;
				    		//System.out.println("Another function work"+" "+fin);
				    		break;
				    	}
				    	else if(b-a==c-b){
				    		fin = a+(q-1)*(b-a);
				    		check=true;
				    		//System.out.println("Another function work"+" "+fin+" "+a+" "+b+" "+c+" "+q+" ");
				    		break;
				    	}
				    }
				}
				
			}
			if(check)
				System.out.println(fin);
			else
				System.out.println(max);
		}
	}
}