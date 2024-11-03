package elementaryJava;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){
        if (first<10 || second<10){
            return -1;
        }
        int i=1;
        int greatest=0;
        while(i<=first || i<=second){
            if(first%i==0 && second%i==0){
                greatest=i;
            }
            i++;
        }return greatest;
    }
}