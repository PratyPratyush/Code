//
import java.io.*;
import java.util.*;
class HEChallenge{
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
		int n = fr.nextInt();
		int q= fr.nextInt();
		//int[] arr =new int[n];
		long[] cal =new long[n];
		ArrayList<Integer> al =new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			//arr[i]=fr.nextInt();
			int value=fr.nextInt();
			al.add(value);
		}
		// int count=0;
		// for(int i=1;i<al.size();i++){
		// 	if(al.get(i-1)>al.get(i)) count++;
		// }
		// System.out.println(count);
		//===========================

		int lo=-1;
		int hi=-1;
		int time=0;
		while(q-->0){
			int k=fr.nextInt();
			while(time<=k){
				long sum=0;
				lo=-1;hi=-1;
				for(int j=0;j<al.size();j++){
					//int data = al.get()
					if(al.get(j)!=-1){
						if(lo==-1&&hi==-1){
							lo=j;hi=j;
						}
						else{
							if(al.get(j)<al.get(lo)) lo=j;
							if(al.get(j)>=al.get(hi)) hi=j;
						}
						sum+=al.get(j);
					}
				}
				//System.out.println("select : "+lo+" "+hi);
				cal[time]=sum;
				int data = al.get(hi)-al.get(lo);
				if(hi>lo){
					al.remove(hi);
					al.remove(lo);
				}
				else if(lo>hi){
					al.remove(lo);
					al.remove(hi);
				}
				else {
					al.remove(lo);
				}
				al.add(data);
				
				//arr[hi]=arr[hi]-arr[lo];
				//arr[lo]=-1;
				time++;
			}
			System.out.println(cal[k]);
		}


		//==================================
		// for(int i=0;i<n;i++){
		// 	long sum=0;
		// 	lo=-1;hi=-1;
		// 	for(int j=0;j<n;j++){
		// 		if(arr[j]!=-1){
		// 			if(lo==-1&&hi==-1){
		// 				lo=j;hi=j;
		// 			}
		// 			else{
		// 				if(arr[j]<arr[lo]) lo=j;
		// 				if(arr[j]>arr[hi]) hi=j;
		// 			}
		// 			sum+=arr[j];
		// 		}
		// 	}
		// 	cal[i]=sum;
		// 	arr[hi]=arr[hi]-arr[lo];
		// 	arr[lo]=-1;
		// }
		// for(int i=0;i<q;i++){
		// 	int index=fr.nextInt();
		// 	System.out.println(cal[index]);
		// }
		// for(int i=0;i<n;i++)
		// 	System.out.print(cal[i]+" ");
		// System.out.println(" ");
	}
}