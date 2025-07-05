package java_fundamentals;
import java.util.*;
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		if(n1>0)
		{
			System.out.println("Positive");
		}
		else if(n1<0)
		{
			System.out.println("Negative");
		}
		else
		{
			System.out.println("Zero");
		}
	}

}
