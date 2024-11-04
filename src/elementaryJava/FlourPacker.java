package elementaryJava;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        int max = bigCount*5 + smallCount*1;
        if(max<goal || goal<0){
            return false;
        }
        else if(max==goal){
            return true;
        }
        else
            return goal%5<=smallCount;
    }
}