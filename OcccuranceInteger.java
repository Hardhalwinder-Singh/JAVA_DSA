import java.util.Scanner;

public class OcccuranceInteger {
    public static void main(String[] args) {
        Integer number = 23522222;
       String str = String.valueOf(number);
//        char ch[] = st.toCharArray();

        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Input Number to find Occurance Of");
        char InputNum = inputNumber.next().trim().charAt(0);

        Boolean flag=true;
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == InputNum) {
                count++;
                flag=false;
            }
        }
        if(flag==false){
        System.out.println("Number of Occurances : "+ count);}
        else{
            System.out.println("Number Not found");
        }




//        int count =0;
//
//        while(number>0)
//        {
//            int rem =number%10;
//            if(rem==2)
//            {
//                count++;
//            }
//            number=number/10;
//        }
//    System.out.println(count);

    }
}
