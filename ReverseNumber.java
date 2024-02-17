import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;

public class ReverseNumber {
    public static void main(String[] args) {
//        int num = 213241;
//        String str = String.valueOf(num);
//        ArrayList<Character> list = new ArrayList<>();
//        for(int i=str.length()-1;i>=0;i--){
//            list.add(str.charAt(i));
//        }
//     String ls=  list.stream().map(Objects::toString).collect(Collectors.joining(""));
//        System.out.println(ls);

//        Another way to reverse

        int n= 123456;
        int answer=0;
        String str= String.valueOf(n);


        for (int i=0; i<str.length();i++)
        {
            int rem = n % 10; /*Will give remainder ex: 6 */
            n = n / 10; /*Will remove last digit of number ex : 123121*/
            answer= answer * 10 + rem;
        }
        System.out.println(answer);
    }
}
