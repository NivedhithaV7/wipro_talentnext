package java_fundamentals;
import java.util.*;
public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char a1=sc.next().charAt(0);
		switch(a1)
		{
		case 'R':
			System.out.println(a1+"->"+"Red");
			break;
		case 'B':
			System.out.println(a1+"->"+"Blue");
			break;
		case 'G':
			System.out.println(a1+"->"+"Green");
			break;
		case 'O':
			System.out.println(a1+"->"+"Orange");
			break;
		case 'Y':
			System.out.println(a1+"->"+"Yellow");
			break;
		case 'W':
			System.out.println(a1+"->"+"White");
		}
	}

}
