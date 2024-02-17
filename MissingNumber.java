import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {

        int[] ar = {1,2,3,4,6,7,8,9,10};
        boolean noMissingNumber=true;
        int missingNumber=0;
        for (int i=0 ; i < ar.length-1 ; i++)
        {
            int second = ar[i+1];
            int first = ar[i];

            if((second-first)!=1)
            {
                System.out.println("Missing Number between  : " + first + "  "+ second);
                missingNumber=first;
                noMissingNumber=false;
                continue;
            }

        }
        if (noMissingNumber==false)
        {
        System.out.println(missingNumber=missingNumber+1);
        }
        else
        {
            System.out.println("No Missing Number");
        }

    }
}
