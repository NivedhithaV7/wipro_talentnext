package java_fundamentals;
import java.util.*;
public class Question16 {
	public static boolean isPrime(int n)
	{
		boolean prime=true;
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		for(int i=10;i<=99;i++)
		{
			if(isPrime(i))
			{
				System.out.println(i);
			}
		}
		
	}

}
