package Arrays;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;


public class SortDescending {

    public void fillArrayWithRandom() {
        int[] arr = new int[10];
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(arr));


    }

}
