public abstract class Product {
    protected double price;
    protected String type;
    protected String description;

    public Product(double price, String type, String description) {
        this.price = price;
        this.type = type;
        this.description = description;
    }

    public double getSalesPrice(int quantity) {
        return price * quantity;
    }

    public void printPricedItem(int quantity) {
        System.out.printf("%2d qty at $%8.2f each, %-15s %-35s %n",
                quantity, price, type, description);
    }

    public abstract void showDetails();





}