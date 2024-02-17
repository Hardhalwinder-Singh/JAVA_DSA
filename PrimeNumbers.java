import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {

//        System.out.println("Input Number");
//        Scanner scan = new Scanner(System.in);
//
//        Integer number = scan.nextInt();
//        int two =2;
//        Boolean isPrime=true;
//        while((Math.sqrt(number))>two)
//        {
//            if(number%two==0)
//            {
//                isPrime=false;
//            }
//                two++;
//        }
////        if(isPrime)
//        System.out.println("Prime Number" +" :" +isPrime);
////        else
////        System.out.println("Not Prime Number");




        int num=11;
        Boolean primeFlag =true;

        for(int i=2; i<num; i++)
        {
            if(num%i==0)
            {
                primeFlag=false;
            }
        }
        System.out.println("Number is :" + primeFlag);
    }
}
