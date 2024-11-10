package LinkedListIterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

record Place(String name, int distance) {
    @Override
    public String toString(){
        return String.format("%S (%d)", name, distance);
    }
}

public class Main {
    LinkedList <Place> places = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);
    String command;
    public Main() {
        Place Sofia = new Place("Sofia", 0);
        Place Plovdiv = new Place("Plovdiv", 132);
        Place Tarnovo = new Place("Tarnovo", 219);
        Place Burgas = new Place("Sofia", 383);
        Place Varna = new Place("Sofia", 525);

        places.add(Sofia);
        places.add(Plovdiv);
        places.add(Tarnovo);
        places.add(Burgas);
        places.add(Varna);
    }

    public static void main(String[] args) {
        Main app = new Main();
        boolean flag = true;
        while (flag) {
            app.command = app.scanner.nextLine();
            app.command = app.command.toUpperCase();
            switch (app.command) {
                case "F" -> app.iterForward();
                case "B" -> app.iterBackward();
                case "L" -> app.listItems();
                case "Q" -> flag = true;
                default -> System.out.println("Wrong command");
            }
        }
    }
    public void iterForward() {
        ListIterator<Place> iterator = places.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    public void iterBackward() {
        ListIterator<Place> iterator = places.listIterator(places.size());
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
    public void listItems() {
        System.out.println(places);
    }
}