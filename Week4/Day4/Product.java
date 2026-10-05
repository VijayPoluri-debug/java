public class Product {

    int id;
    String name;
    double price;
    int quantity;

    public double calculateBill() {
        return price * quantity;
    }

    public void display() {
        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Bill: " + calculateBill());
    }

    public static void main(String[] args) {

        Product product = new Product();

        product.id = 101;
        product.name = "Laptop";
        product.price = 800.00;
        product.quantity = 2;

        product.display();
    }
}