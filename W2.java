// Java program to find all distinct palindrome
// sub-strings of a given string
import java.util.Map;
import java.util.TreeMap;

public class W2
{	 
	static void palindromeSubStrs(String s)
	{
		TreeMap<String , Integer> m = new TreeMap<>();
		int n = s.length();
	
		
		int[][] R = new int[2][n+1];
	
		s = "@" + s + "#";
	
		for (int j = 0; j <= 1; j++)
		{
			int rp = 0; 
			R[j][0] = 0;
	
			int i = 1;
			while (i <= n)
			{
				
				while (s.charAt(i-rp-1) == s.charAt(i+j+rp))
					rp++; 
	
				
				R[j][i] = rp;
				int k = 1;
				while ((R[j][i - k] != rp - k) && (k < rp))
				{
					R[j][i + k] = Math.min(R[j][i-k],rp-k);
					k++;
				}
				rp = Math.max(rp - k,0);
				i += k;
			}
		}
		s = s.substring(1, s.length()-1);

		m.put(s.substring(0,1), 1);
		for (int i = 1; i < n; i++)
		{
			for (int j = 0; j <= 1; j++)
				for (int rp = R[j][i]; rp > 0; rp--)
					m.put(s.substring(i-rp-1,i-rp-1+2*rp+j), 1);
			m.put(s.substring(i, i + 1), 1);
		}
	
	System.out.println("Below are "+(m.size())+" palindrome sub-strings");
		
	for (Map.Entry<String, Integer> ii:m.entrySet())
		System.out.println(ii.getKey());
	}
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		String s = 
		
	}
}
