package ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;


public class ArrayFlowControl {

    Scanner scanner = new Scanner(System.in);
    ArrayList<String> arr = new ArrayList<>();
    public void arrayList() {
        boolean flag = true;

        while (flag) {
            printActions();
            switch (Integer.parseInt(scanner.nextLine())) {
                default -> flag = false;
                case 1 -> addItems();
                case 2 -> removeItems();
                case 0 -> flag = false;
            }
        }
    }
    public void addItems() {
        String[] items = scanner.nextLine().split(" ");
        arr.addAll(List.of(items));
        System.out.println(arr);
    }
    public void removeItems() {
        String[] items = scanner.nextLine().split(" ");
        arr.removeAll(List.of(items));
        System.out.println(arr);
    }
    public void printActions() {
        String text = """
                    Enter 0 - for ShutDown program.
                    Enter 1 - for Add Item/s to ArrayList.
                    Enter 2 - for Remove Item/s from ArrayList.
                    """;
        System.out.println(text);
    }
    public static void main(String[] args) {
        ArrayFlowControl arr = new ArrayFlowControl();
        arr.arrayList();
    }

}




