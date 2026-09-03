package case_studies;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Case Study 4: Online Shopping Cart
 * Problem:
 * An online shopping application stores products in a shopping cart.
 * Create a Product class containing:
 * - Product ID
 * - Product name
 * - Price
 * - Quantity
 * Calculate the total cost of each product and the total bill.
 * If the total bill exceeds ₹5,000, provide a 10% discount.
 */
public class CaseStudy04_ShoppingCart {

    public static class Product {
        private final String productId;
        private final String productName;
        private final double price;
        private final int quantity;

        public Product(String productId, String productName, double price, int quantity) {
            this.productId = productId;
            this.productName = productName;
            this.price = Math.max(price, 0.0);
            this.quantity = Math.max(quantity, 0);
        }

        public double getTotalCost() {
            return price * quantity;
        }

        public String getProductId() {
            return productId;
        }

        public String getProductName() {
            return productName;
        }

        public double getPrice() {
            return price;
        }

        public int getQuantity() {
            return quantity;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("     CASE STUDY 4: ONLINE SHOPPING CART           ");
        System.out.println("==================================================");

        List<Product> cart = new ArrayList<>();

        System.out.print("Enter number of products to add to cart: ");
        int numItems = scanner.hasNextInt() ? scanner.nextInt() : 3;
        scanner.nextLine(); // consume newline

        if (numItems <= 0) {
            // Add default sample items if 0 entered
            System.out.println("Loading demo shopping cart items...");
            cart.add(new Product("P101", "Wireless Headphones", 2499.00, 2));
            cart.add(new Product("P102", "Mechanical Keyboard", 3200.00, 1));
            cart.add(new Product("P103", "Gaming Mouse", 850.00, 1));
        } else {
            for (int i = 0; i < numItems; i++) {
                System.out.println("\n[Item " + (i + 1) + "]");
                System.out.print("Product ID: ");
                String id = scanner.nextLine().trim();
                System.out.print("Product Name: ");
                String name = scanner.nextLine().trim();
                System.out.print("Price (₹): ");
                double price = scanner.nextDouble();
                System.out.print("Quantity: ");
                int qty = scanner.nextInt();
                scanner.nextLine(); // consume newline

                cart.add(new Product(id, name, price, qty));
            }
        }

        double subtotal = 0;
        System.out.println("\n====================== INVOICE ======================");
        System.out.printf("%-8s %-22s %-10s %-6s %-12s%n", "ID", "Product Name", "Price(₹)", "Qty", "Total(₹)");
        System.out.println("-----------------------------------------------------");
        for (Product item : cart) {
            double itemTotal = item.getTotalCost();
            subtotal += itemTotal;
            System.out.printf("%-8s %-22s %-10.2f %-6d %-12.2f%n",
                    item.getProductId(), item.getProductName(), item.getPrice(), item.getQuantity(), itemTotal);
        }
        System.out.println("-----------------------------------------------------");
        System.out.printf("Subtotal:                                  ₹%,10.2f%n", subtotal);

        double discount = 0;
        if (subtotal > 5000.0) {
            discount = 0.10 * subtotal; // 10% discount on orders exceeding ₹5,000
            System.out.printf("Discount (10%% for orders > ₹5,000):       -₹%,10.2f%n", discount);
        } else {
            System.out.println("Discount (Orders <= ₹5,000):                ₹      0.00");
        }

        double finalBill = subtotal - discount;
        System.out.println("=====================================================");
        System.out.printf("FINAL BILL AMOUNT:                         ₹%,10.2f%n", finalBill);
        System.out.println("=====================================================");

        scanner.close();
    }
}
