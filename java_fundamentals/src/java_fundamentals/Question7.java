package java_fundamentals;
import java.util.*;
public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] arr=new String[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.next();
		}
		if(arr.length==0)
		{
			System.out.println("No Values");
		}
		else
		{
			for(int j=0;j<n;j++)
			{
				if(j==arr.length-1)
				{
					System.out.print(arr[j]);
				}
				else
				{
					System.out.print(arr[j]+",");
				}
				
			}
			
		}
	}

}
