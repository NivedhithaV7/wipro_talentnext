package java_fundamentals;
import java.util.*;
public class Question17 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=2;i<=n/2;i++)
	{
		if(n%i==0)
		{
			System.out.println("Not Prime");
		}
		else
		{
			System.out.println("Prime");
		}
	}
	}
}
