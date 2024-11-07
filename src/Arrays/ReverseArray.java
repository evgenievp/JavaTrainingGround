package Arrays;

import java.util.Scanner;

public class ReverseArray {
    private int len;
    Scanner scanner = new Scanner(System.in);

    public int[] setArray(int len) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i ++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public int[] reverseAscSortedArr(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i ++;
            j --;
        }
        return arr;
    }

}
