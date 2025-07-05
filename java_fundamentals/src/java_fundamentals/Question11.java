package java_fundamentals;
import java.util.*;
public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char a1=sc.next().charAt(0);
		if(a1>='a' && a1<='z')
		{
			System.out.println(a1 +"->"+(char)(a1-32));
		}
		else if(a1>='A' && a1<='Z')
		{
			System.out.println(a1 +"->"+(char)(a1+32));
		}
	}

}
