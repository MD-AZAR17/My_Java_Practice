import java.util.Scanner;
class Main {
    public static void main(String[] args) {
       int i,j,sum;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the starting value:");
       i=sc.nextInt();
       System.out.println("Enter the ending value:");
       j=sc.nextInt();
       sum=0;
       if(i>=0 && (j>i && j<=9999 ))
       {
           for(int k=i;k<=j;k++)
           {
               sum+=k;
           }
           System.out.println("SUM is"+sum);
       }
       else
       {
           System.out.println("Invalid input");
       }
    }
