import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

class Product   
{
    private String name;
    private double price;

    public Product(String n, double p) {
        this.name = n;
        this.price = p;
    }

    public String getName() {
        return name;
    }
    public void setName(String n) {
        this.name = n;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double p) {
        this.price = p;
    }

    public String toString() {
        return name + " : Rs." + price;
    }
}

public class OnlineShoppingCart   
{
    ArrayList<Product> cart;

    OnlineShoppingCart() {
        cart = new ArrayList<Product>();
    }

    static int menu() {
        System.out.println("\n1. Add \n2. Remove \n3. Display \n4. Calculate \n5. Quit");
        System.out.print("Enter choice: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public void addProduct(Product p) {
        cart.add(p);
        System.out.println(" Product added to cart");
    }

    public void removeProduct(String name) {
        Iterator<Product> itr = cart.iterator();
        while (itr.hasNext()) {
            Product p = itr.next();
            if (p.getName().equalsIgnoreCase(name)) { 
                itr.remove();
                System.out.println(" Product Removed");
                return;
            }
        }
        System.out.println("⚠️ Product name not found in cart");
    }

    public void displayCart() {
        if (cart.isEmpty()) {
            System.out.println("🛒 Empty Cart");
            return;
        }
        System.out.println("📦 Products in your cart:");
        for (Product p : cart) {
            System.out.println(p);
        }
    }

    public void calculate() {
        double total = 0.0;
        for (Product p : cart) {
            total += p.getPrice();
        }
        double discount = 0.0;
        if (total > 100000.00) {
            discount = 0.1 * total;  
        }
        System.out.println("Total cost: " + total);
        System.out.println("Discount: " + discount);
        System.out.println("Grand Total: " + (total - discount));
    }

    // Main method
    public static void main(String args[]) {
        OnlineShoppingCart obj = new OnlineShoppingCart();
        Scanner sc = new Scanner(System.in);
        String n;
        double p;

        while (true) {
            int ch = menu();
            switch (ch) {
                case 1:
                    System.out.print("Enter Product Name and Price: ");
                    n = sc.next();
                    p = sc.nextDouble();
                    Product newProduct = new Product(n, p);
                    obj.addProduct(newProduct);
                    break;

                case 2:
                    System.out.print("Enter Product Name to Remove: ");
                    n = sc.next();
                    obj.removeProduct(n);
                    break;

                case 3:
                    obj.displayCart();
                    break;

                case 4:
                    obj.calculate();
                    break;

                case 5:
                    System.out.println(" Exiting...");
                    System.exit(0);
            }
        }
    }
}
