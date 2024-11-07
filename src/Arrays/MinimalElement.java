package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class MinimalElement {
        private static int readInteger() {
            Scanner keyboard = new Scanner(System.in);
            return keyboard.nextInt();
        }

        private static int[] readElements(int elementAmmount) {
            Scanner keyboard = new Scanner(System.in);
            int[] array = new int[elementAmmount];
            for (int i = 0; i < elementAmmount; i++) {
                array[i] = keyboard.nextInt();
            }
            return array;
        }

        private static int findMin(int[] array) {
            Arrays.sort(array);
            return array[0];
        }
    }

