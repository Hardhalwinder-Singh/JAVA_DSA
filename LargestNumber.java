import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first = input.nextInt();
        int second = input.nextInt();
        int third = input.nextInt();

// First Method
//        int max = first;
//        if(second>max)
//            max=second;
//        else if(third>max)
//            max=third;

// Second Method
        int max=0;
        if(first>second)
            max = first;
        else
            max=second;

        if(third>max)
            max=third;

        System.out.println(max);

    }
}
