
import java.io.*;
import java.util.*;
public class GreenStack6
{
	
	static int CountPS(char str[], int n)
	{
		int dp[][] = new int[n][n];
		boolean P[][] = new boolean[n][n];
	
		for (int i= 0; i< n; i++)
			P[i][i] = true;
	
		for (int i=0; i<n-1; i++)
		{
			if (str[i] == str[i+1])
			{
				P[i][i+1] = true;
				dp[i][i+1] = 1 ;
			}
		}
	
		for (int gap=2 ; gap<n; gap++)
		{
			for (int i=0; i<n-gap; i++)
			{
				int j = gap + i;

				if (str[i] == str[j] && P[i+1][j-1] )
					P[i][j] = true;
	
				if (P[i][j] == true)
					dp[i][j] = dp[i][j-1] + dp[i+1][j] + 1 - dp[i+1][j-1];
				else
					dp[i][j] = dp[i][j-1] + dp[i+1][j] - dp[i+1][j-1];
			}
		}
		return dp[0][n-1];
	}
	
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		String s= "abaab";
		int l = sc.nextInt();
		int h = sc.nextInt();
		String str = s.substring(l-1,h);
		int x = CountPS(str.toCharArray(), str.length());
		x = x+str.length();
		System.out.println(x);
	}
}
