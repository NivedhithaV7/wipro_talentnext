package java_fundamentals;
import java.util.*;
public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int age=sc.nextInt();
		if(s.equals("Female"))
		{
			
			if(age>=1 && age<=58)
			{
				System.out.println("8.2%");
			}
			else if(age>=59 && age<=100)
			{
				System.out.println("9.2%");
			}
		}
		else if(s.equals("Male"))
		{
			if(age>=1 && age<=58)
			{
				System.out.println("8.4%");
			}
			else if(age>=59 && age<=100)
			{
				System.out.println("10.5%");
			}
		}
	}

}
