package JavaOOP.Restaurant;

public class Burger {
    private String type;
    private double basePrice;
    private int maximumToppings;
    private double price;
    private String size;

    public Burger(String type, double basePrice, String size) {
        this.type = type;
        this.basePrice = basePrice;
        this.maximumToppings = 3;
        this.size = size.toLowerCase();
    }

    public void setAppropriatePrice() {
        if (size.equals("small")) {
            price = 1 * basePrice;
        }
        else if (size.equals("medium")) {
            price = 1.5 * basePrice;
        }
        else if (size.equals("big")) {
            price = 3 * basePrice;
        }
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public int getMaximumToppings() {
        return maximumToppings;
    }

}
