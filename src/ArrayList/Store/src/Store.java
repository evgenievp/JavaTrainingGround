import java.util.ArrayList;
public class Store {
    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();

    public static void main(String[] args) {

        storeProducts.add(new Furniture("sofa", 2550, "90 Angle soft furniture"));

    }
    public static void listProducts() {
        for (var item: storeProducts) {
            System.out.println("-".repeat(20));
            item.showDetails();
        }
    }


}
