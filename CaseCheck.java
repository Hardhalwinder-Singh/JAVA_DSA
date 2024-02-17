import java.util.Scanner;
import java.util.stream.IntStream;

public class CaseCheck {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char st = input.next().charAt(0);

        if(st>='a' && st<='z')
        {
            System.out.println("LowerCase");
        }else
            System.out.println("UpperCase");


    }
}
