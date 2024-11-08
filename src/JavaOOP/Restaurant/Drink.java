package JavaOOP.Restaurant;

public class Drink extends Product{
    private String size;

    public Drink(String type, double price, String size) {
        super(type, price);
        this.size = size;
        setPriceBasedOnSize();
    }
    private void setPriceBasedOnSize() {
        switch (size.toLowerCase()) {
            case "small":
                super.setPrice(2.5);
                break;
            case "regular":
                super.setPrice(3.5);
                break;
            case "large":
                super.setPrice(5.0);
                break;
            default:
                throw new IllegalArgumentException("Invalid size: " + size);
        }
    }

}
