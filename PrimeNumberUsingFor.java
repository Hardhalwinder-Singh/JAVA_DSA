public class PrimeNumberUsingFor {
    public static void main(String[] args) {

        int num=5;
        Boolean isPrime=true;


            for (int i = 2; i < num; i++) {
                if (num % i == 0)
                {
                    isPrime = false;
                }
            }
             System.out.println(num + " is " + ":" + isPrime);



    }
}
