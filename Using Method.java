import java.util.Scanner;
class JavaPractice {
    static int[] a;
    static void constructarray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int size = sc.nextInt();
        a = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
    }

    static void displayarray() {
        System.out.println("Array elements are:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    static void displayodd()
    {
         System.out.println("Odd number: ");
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>0)
            if((a[i]%2)!=0)
            System.out.println(a[i]);
        }
    }
    static void displayeven()
    {
         System.out.println("Even number: ");
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>0)
            if((a[i]%2)==0)
            System.out.println(a[i]);
        }
    }
    static void displaypositive()
    {
        System.out.println("Positive number: ");
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>0)
            System.out.println(a[i]);
        }
    }
    static void displaynegative()
    {
        System.out.println("Negative number: ");
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<0)
            System.out.println(a[i]);
         }
    }

    public static void main(String[] args) {
        constructarray();
        displayarray();
        displayodd();
        displayeven();
        displaypositive();
        displaynegative();
    }
}
