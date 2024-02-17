import java.util.Enumeration;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("Input Operation you want to do : ");
        Scanner input = new Scanner(System.in);
        char op = input.next().trim().charAt(0);
        int res;
//        if(op=='+' || op=='-' ||op=='*' ||op=='/')
//        {
//
//            System.out.println("Input Numbers : ");
//            int number1=input.nextInt();
//            int number2=input.nextInt();
//            if(op=='+')
//                Add(number1,number2);
//            if(op=='*')
//                Multiply(number1,number2);
//            if(op=='/')
//                if(number2!=0)
//                Divide(number1,number2);
//                else
//                    System.out.println("Number2 Cannot be Zero");
//            if(op=='-')
//                Subtract(number1,number2);
//
//
//        }else
//            System.out.println("Invalid Operator");
        System.out.println("Input Numbers : ");
        int number1=input.nextInt();
        int number2=input.nextInt();


        switch (op)
        {
            case '+':
                res=number1+number2;
                System.out.println(res);
                break;

            case '-':
                res=number1-number2;
                System.out.println(res);
                break;

            case '/':
                res=number1/number2;
                System.out.println(res);
                break;

            case '*':
                res=number1*number2;
                System.out.println(res);
                break;

            default:
                System.out.println("Not valid operation");
        }







    }
    public static int Add(int a, int b)
    {
        int ans= a+b;
        System.out.println();
        return ans;
    }
    public static int Multiply(int a, int b)
    {
        int ans= a*b;
        System.out.println(ans);
        return ans;
    }
    public static float Divide(int a, int b)
    {
        float ans= a/b;
        System.out.println(ans);
        return ans;
    }

    public static int Subtract(int a, int b)
    {
        int ans= a-b;
        System.out.println(ans);
        return ans;
    }
}
