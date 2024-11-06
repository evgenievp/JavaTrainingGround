package Restaurant;

public class Meal extends Product{
    private Drink drink;
    private Burger burger;
    private SideItem sideItem;
    private double price;

    public Meal(String type, double price, Burger burger, Drink drink, SideItem sideItem) {
        super(type);
        this.price = calculatePrice();
        this.burger = burger;
        this.drink = drink;
        this.sideItem = sideItem;
    }

    public double calculatePrice() {
        return burger.getPrice() + sideItem.getPrice() + drink.getPrice();
    }

    public double getPrice() {
        return price;
    }

}
