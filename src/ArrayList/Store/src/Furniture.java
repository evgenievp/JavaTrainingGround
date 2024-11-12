public class Furniture extends ProductForSale{

    public Furniture(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.printf("The price is $%6.2f %n", price);
        System.out.println("Description: " + description);
    }


}
