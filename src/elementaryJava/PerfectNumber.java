package elementaryJava;

public class PerfectNumber {
    public static boolean isPerfectNumber(int number){
        if(number < 1){
            return false;
        }
        int ans = 0;
        for(int i = 1; i<number; i++){
            if(number % i == 0){
                ans = ans + i;
            }
        }
        return (ans == number);
    }
}