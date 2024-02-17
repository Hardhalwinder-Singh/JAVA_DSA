import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num= input.nextInt();

        int n=0;
       int n1=1;
       int n2;
       for(int i=0; i<num;i++)
       {
//         System.out.println(n);
           n2=n+n1;
           n=n1;
           n1=n2;
       }
        System.out.println(n);


    }
}
