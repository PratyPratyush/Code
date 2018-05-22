import java.io.*;
import java.util.*;
class Atm
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int withdraw = sc.nextInt();
		double amount = sc.nextDouble();
		if(withdraw%5==0 && amount >(double)withdraw)
		{
			//double value = ;
			//System.out.printf("%.2f\n",Double.parseDouble(amount)-(withdraw)-0.5);
			System.out.println((amount-withdraw)-0.50);
		}
		else
			System.out.println(amount);
	}
}