package elementaryJava;

public class IsPalindrome {
        public static boolean isPalindrome(int number) {
            // String numStr = Integer.toString(Math.abs(number));
            String numStr = "" + Math.abs(number); // easier hack
            String revStr = "";
            for(int i = (numStr.length() - 1); i >= 0; i--) {
                revStr += numStr.charAt(i);
            }
            return numStr.equals(revStr);
        }
    }
