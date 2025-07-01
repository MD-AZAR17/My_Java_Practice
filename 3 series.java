package training;
import java.util.Scanner;
public class Sample 
{
	public static void main(String[] args) 
{
		Scanner sc=new Scanner(System.in);
		long a=3;
		System.out.println("Enter the range: ");
		int n=sc.nextInt();
		System.out.println("The series are : ");
		for(int i=0;i<n;i++)
		{
			System.out.println(a);
			a=(a*10)+3;
		}
	}
}
