import java.util.ArrayList;

public class Product {
    private ArrayList<Inventory> products;

    public Product(){
        products = new ArrayList<>();
    }

    public void addProduct(Inventory product){
        products.add(product);
        System.out.println("Product added: " + product);
        //int countId = product.getUniqueID()++;
    }

    public boolean removeProduct(String nameP){
        for (Inventory p : products){
            if(p.getName().equalsIgnoreCase(nameP)){
                products.remove(nameP);
                System.out.println("Removed Product: " + nameP);
                return true;
            } else {
                System.out.println("The product that you have tried to remove is not found");
                return false;
            }
        }
        return false;
    }

    public Inventory updateProductDetails(Inventory product){
        //product = updateProductDetails();
        String name = "";
        if(product.getName().equalsIgnoreCase(name)) {
            if (product != null) {
                product.setName(product.getName());
                product.setQuanity(product.getQuanity());
                product.setPrice(product.getPrice());

                System.out.println("Product Updated");
            }
        }
        return product;
    }



    public void displayProductList(){
        System.out.println("=============Product List================");
        products.forEach(p -> System.out.println(p));
    }
}
