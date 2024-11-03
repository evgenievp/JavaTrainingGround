package elementaryJava;

public class NumberToWords {
    public static int getDigitCount(int number) {
        int count = 0;
        if (number == 0) {
            return 1;
        }
        else if (number<0){
            return -1;
        }
        else{
            while (number > 0) {
                number = number / 10;
                count++;
            }
            return count;
        }
    }
    public static int reverse(int number){
        int reverse=0;
        int lastDigit=0;
        int num = number;
        while(number!=0){
            lastDigit = number%10;
            reverse = reverse*10 + lastDigit;
            number = number/10;
        }
        return reverse;
    }
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int remainder ;
        int reversed = reverse(number);
        int counted = getDigitCount(number);
        while (counted > 0) {
            remainder = reversed % 10;
            String word = switch (remainder) {
                case 0 -> "Zero";
                case 1 -> "One";
                case 2 -> "Two";
                case 3 -> "Three";
                case 4 -> "Four";
                case 5 -> "Five";
                case 6 -> "Six";
                case 7 -> "Seven";
                case 8 -> "Eight";
                case 9 -> "Nine";
                default -> "";
            };
            System.out.println(word);
            counted--;
            reversed/= 10;
        }
    }
}