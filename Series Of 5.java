package training;
import java.util.Scanner;
public class sample2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range:");
		int n=sc.nextInt();
		  for(int i=0;i<n;i+=5)
		  {
			  System.out.println(i);
		  }
	}
}
