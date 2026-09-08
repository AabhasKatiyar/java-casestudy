package case_studies;

import java.util.ArrayList;
import java.util.Scanner;

public class CaseStudy04_ShoppingCart {

    public static class Product {

        private String productId;
        private String productName;
        private double price;
        private int quantity;

        public Product(String productId, String productName, double price, int quantity) {
            this.productId = productId;
            this.productName = productName;
            this.price = price;
            this.quantity = quantity;
        }

        public double getTotalCost() {
            return price * quantity;
        }

        public void displayProduct() {
            System.out.printf("%s\t%s\t%.2f\t%d\t%.2f%n",
                    productId, productName, price, quantity, getTotalCost());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Product> cart = new ArrayList<>();

        System.out.println("Online Shopping Cart");

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.println("\nProduct " + (i + 1));

            System.out.print("Enter Product ID: ");
            String id = sc.nextLine();

            System.out.print("Enter Product Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Price: ");
            double price = sc.nextDouble();

            System.out.print("Enter Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            Product product = new Product(id, name, price, quantity);
            cart.add(product);
        }

        double total = 0;

        System.out.println("\nShopping Cart");
        System.out.println("------------------------------------------");
        System.out.println("ID\tName\tPrice\tQty\tTotal");

        for (Product product : cart) {
            product.displayProduct();
            total += product.getTotalCost();
        }

        System.out.println("------------------------------------------");
        System.out.printf("Total: ₹%.2f%n", total);

        double discount = 0;

        if (total > 5000) {
            discount = total * 0.10;
            System.out.printf("Discount: ₹%.2f%n", discount);
        }

        double finalAmount = total - discount;

        System.out.printf("Final Bill: ₹%.2f%n", finalAmount);

        sc.close();
    }
}
