import java.util.*;
import java.io.*;
class Weight_u_s{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = "abcdefghijklmnopqrstuvwxyz";
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26} ;
		int[] value = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		String s_input = sc.next();
		char temp_char = s_input.charAt(0);
		int position = s.indexOf(temp_char);
		int temp_value = value[position]+arr[position];
		for (int i=1;i<s_input.length() ;i++ ) {

			//System.out.println(arr[s.indexOf(s_input.charAt(i))]);
			if(temp_char==s_input.charAt(i))
			{
				temp_value = temp_value+arr[position];
			}
			else
			{
				value[position] = temp_value;
				temp_char = s_input.charAt(i);
				position = s.indexOf(temp_char);
				temp_value = value[position];
				temp_value = temp_value+arr[position];
			}

			
		}
		value[position] = temp_value;
		for (int i=0;i<6 ;i++ ) {
			System.out.println(value[i]);
		}
		System.out.println("Enter vale to be checked");
		int n_input = sc.nextInt();
		for (int i=0;i<26 ;i++ ) {
			if (value[i]>0) {
				if(n_input==value[i]){
					System.out.println("Yes");
					break;
				}
				else if(value[i]%n_input==0)
				{
					int check = 0;
					int q = value[i];
					System.out.println(q);
					while(q>=n_input)
					{
						q = q/n_input;
						System.out.println(q);
						if(q%n_input != 0)
						{
							check = 1;
							break;
						}

					}
					if(check == 0)
					{
						System.out.println("Yes");
					}
					else{
						System.out.println("No");
					}
					break;
				}
				
			}
				
			}
		// System.out.println("Howm many u input");
		// int n = sc.nextInt();
		// for (int i=0;i<n ;i++ ) {
		// 	System.out.println("Enter your no");
		// 	int n_input = sc.nextInt();

			
		// }

	}
}