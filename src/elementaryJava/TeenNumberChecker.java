package elementaryJava;

public class TeenNumberChecker {

    public static boolean hasTeen(int first, int second, int third){

        return isTeen(first) || isTeen(second) || isTeen(third);

    }

    public static boolean isTeen (int first){

        return (first >= 13 && first <= 19);

    }

}