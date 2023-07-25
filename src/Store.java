import java.util.ArrayList;

public class Store {
    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();

    public static void main(String[] args) {

        storeProducts.add(new ArtObject("oil painting", 1372, "wow this is amazing"));
        storeProducts.add(new ArtObject("Sulpture", 4225, "Also this is amazing, what an beautiful piece of art"));
        listProducts();
    }

    public static void listProducts() {

        for (var item : storeProducts) {
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }
}
