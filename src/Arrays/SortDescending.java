package Arrays;
import java.util.Arrays;
import java.util.Random;


public class SortDescending {

    public void fillArrayWithRandom() {
        int[] arr = new int[10];
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(arr));
    }

}
