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

class ShoppingCart {
    Product[] products;

    public ShoppingCart(Product[] products) {
        this.products = products;
    }

    public double calculateTotalBill() {
        double total = 0;
        for (Product p : products) {
            total += p.getTotalCost();
        }
        return total;
    }

    public double calculateDiscount(double totalBill) {
        if (totalBill > 5000) {
            return totalBill * 0.10;
        }
        return 0;
    }

    public void displayBill() {
        double totalBill = calculateTotalBill();
        double discount = calculateDiscount(totalBill);
        double finalAmount = totalBill - discount;

        System.out.println("\n--- Shopping Bill ---");
        for (Product p : products) {
            System.out.println(p.productName + " (" + p.quantity + " x " + p.price + ") = " + p.getTotalCost());
        }
        System.out.println("\nSubtotal: " + totalBill);
        if (discount > 0) {
            System.out.println("10% Discount applied: -" + discount);
        }
        System.out.println("Final Bill Amount: " + finalAmount);
    }
}

public class CaseStudy04_ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        Product[] products = new Product[n];

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

            products[i] = new Product(id, name, price, qty);
        }

        ShoppingCart cart = new ShoppingCart(products);
        cart.displayBill();

        sc.close();
    }
}
