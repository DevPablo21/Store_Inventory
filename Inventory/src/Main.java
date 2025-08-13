public class Main {
    public static void main(String[] args) {
        Product eStore = new Product();

        eStore.addProduct(new Inventory(1, "HP", 40, 4999.99));
        eStore.addProduct(new Inventory(2, "Lenovo", 30, 5999.99));

        eStore.displayProductList();
        eStore.removeProduct("ph");


        eStore.displayProductList();
        eStore.updateProductDetails(new Inventory(1, "Dell", 50, 6999.99));
        eStore.displayProductList();

    }
}
