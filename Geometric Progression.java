package training;
import java.util.Scanner;
public class Sample4 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int num = 2;
        int result = 1; 
        System.out.println("Enter the range: ");
        int n = sc.nextInt();     
        System.out.println("The series are: ");
        for (int i = 0; i < n; i++) 
        {
            System.out.println(result);
            result *= num;
        }
    }
}
