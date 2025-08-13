public class Inventory {
    private int uniqueID;
    private String name;
    private int quanity;
    private double price;

    public Inventory(int uniqueID, String name, int quanity, double price) {
        this.uniqueID = uniqueID;
        this.name = name;
        this.quanity = quanity;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuanity(int quanity) {
        this.quanity = quanity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getUniqueID() {
        return uniqueID;
    }

    public String getName() {
        return name;
    }

    public int getQuanity() {
        return quanity;
    }

    public double getPrice() {
        return price;
    }

    public String toString(){
        return "Id: " + uniqueID + ", Product Name: " + name + ", Product quanity: " + quanity + " units, Product price: " + price;
    }
}
