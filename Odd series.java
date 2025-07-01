package training;
import java.util.Scanner;
public class Sample
{
	public static void main(String[] args)
  {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range: ");
		int n=sc.nextInt();
		System.out.println("The even series are : ");
		for(int i=1;i<=n;i+=2)
		{
			System.out.println(i);
		}
	}
}
