package case_studies;

import java.util.Scanner;

class Product {
    int productId;
    String productName;
    double price;
    int quantity;

    public Product(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalCost() {
        return price * quantity;
    }
}

public class CaseStudy04_ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        Product[] cart = new Product[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for product " + (i + 1) + ":");
            System.out.print("Product ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Product Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            System.out.print("Quantity: ");
            int qty = sc.nextInt();

            cart[i] = new Product(id, name, price, qty);
        }

        double totalBill = 0;
        System.out.println("\n--- Shopping Bill ---");
        for (int i = 0; i < n; i++) {
            double cost = cart[i].getTotalCost();
            totalBill += cost;
            System.out.println(cart[i].productName + " (" + cart[i].quantity + " x " + cart[i].price + ") = " + cost);
        }

        System.out.println("\nSubtotal: " + totalBill);

        double discount = 0;
        if (totalBill > 5000) {
            discount = totalBill * 0.10;
            System.out.println("10% Discount applied: -" + discount);
        }

        double finalAmount = totalBill - discount;
        System.out.println("Final Bill Amount: " + finalAmount);

        sc.close();
    }
}
