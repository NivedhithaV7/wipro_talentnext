package java_fundamentals;
import java.util.*;
public class Question18 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=n;
		int sum=0;
		while(x!=0)
		{
			int temp=x%10;
			sum=sum+temp;
			x/=10;
		}
		System.out.println(sum);
	}

}
