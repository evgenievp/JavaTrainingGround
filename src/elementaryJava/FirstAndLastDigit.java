package elementaryJava;

public class FirstAndLastDigit {
    public static int sumFirstAndLastDigit(int number) {
        int lastDigit = number % 10;
        int firstDigit =1;
        if (number < 0) {
            return -1;
        } else {

            int i = number;
            while (i > 0) {
                if (i <= 10)
                    firstDigit = i;
                i = i / 10;
            }
            return lastDigit + firstDigit;
        }
    }
}
