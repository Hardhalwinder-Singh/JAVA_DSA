public class chatGPTCountOccur {
    public static void main(String[] args) {
        String inputString = "2125212";
        char targetChar = '2';

        int count = countOccurrences(inputString, targetChar);

        System.out.println("The digit " + targetChar + " occurs " + count + " times in the string.");
    }

    private static int countOccurrences(String str, char target) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target)
            {
                count++;
            }
        }

        return count;
    }
}
