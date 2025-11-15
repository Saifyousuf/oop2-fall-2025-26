package Practice;

public class Product {
    String productName;
    int productId;
    double price;
    int quantity;
    String category;

    // Constructor
    Product(String productName, int productId, double price, int quantity, String category) {
        this.productName = productName;
        this.productId = productId;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }
}
