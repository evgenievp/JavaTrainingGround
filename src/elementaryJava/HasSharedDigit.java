package elementaryJava;

public class HasSharedDigit {
    public static boolean hasSharedDigit(int number1, int number2) {
        if (number1 < 10 || number2 > 99 || number1 > 99 || number2 < 10) return false;
        for (int i = 0; i < 2; i++){
            int number1CompareDigit = number1 % 10;
            int copyNumber2 = number2;
            for (int j = 0; j < 2; j++ ) {
                if (number1CompareDigit == copyNumber2 % 10) return true;
                copyNumber2 /= 10;
            }
            number1 /= 10;
        }
        return false;
    }
}

