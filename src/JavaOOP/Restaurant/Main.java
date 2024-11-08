package JavaOOP.Restaurant;

public class Main {
    public static void main(String[] args) {
        Burger cheeseBurger = new Burger("CheeseBurger", 2.3, "middle");
        SideItem fries = new SideItem("Fries", 3.20);
        Drink coke = new Drink("Coke", 1.20, "Big");
        Meal order = new Meal("lunch", 8, cheeseBurger, coke, fries);
        System.out.println(order.getPrice());

    }
}