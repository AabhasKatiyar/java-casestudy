package case_studies;

import java.util.ArrayList;
import java.util.List;

/**
 * Case Study 10: E-Commerce Payment System — Polymorphism
 * Problem:
 * An e-commerce website supports different payment methods:
 * - Credit Card
 * - UPI
 * - Net Banking
 * Create a common Payment interface with a pay() method.
 * Implement the interface using different classes.
 */
public class CaseStudy10_PaymentSystem {

    // Common Payment Interface
    public interface Payment {
        void pay(double amount);
        String getPaymentMethodName();
    }

    // Implementation 1: Credit Card Payment
    public static class CreditCardPayment implements Payment {
        private final String cardNumber;
        private final String cardHolderName;

        public CreditCardPayment(String cardNumber, String cardHolderName) {
            this.cardNumber = maskCardNumber(cardNumber);
            this.cardHolderName = cardHolderName;
        }

        private String maskCardNumber(String raw) {
            if (raw == null || raw.length() < 4) return "XXXX-XXXX-XXXX-0000";
            String last4 = raw.substring(raw.length() - 4);
            return "XXXX-XXXX-XXXX-" + last4;
        }

        @Override
        public void pay(double amount) {
            System.out.printf("[Payment Gateway] Processing ₹%,.2f via CREDIT CARD (%s, Card: %s)...%n",
                    amount, cardHolderName, cardNumber);
            System.out.println("  ✓ Card Authorization: SUCCESS");
            System.out.println("  ✓ Transaction ID: CC-" + System.currentTimeMillis() % 1000000);
        }

        @Override
        public String getPaymentMethodName() {
            return "Credit Card";
        }
    }

    // Implementation 2: UPI Payment
    public static class UPIPayment implements Payment {
        private final String upiId;

        public UPIPayment(String upiId) {
            this.upiId = upiId;
        }

        @Override
        public void pay(double amount) {
            System.out.printf("[Payment Gateway] Processing ₹%,.2f via UPI ID: %s...%n", amount, upiId);
            System.out.println("  ✓ UPI Autopay / VPA Verification: SUCCESS");
            System.out.println("  ✓ NPCI Reference ID: UPI-" + System.currentTimeMillis() % 1000000);
        }

        @Override
        public String getPaymentMethodName() {
            return "Unified Payments Interface (UPI)";
        }
    }

    // Implementation 3: Net Banking Payment
    public static class NetBankingPayment implements Payment {
        private final String bankName;
        private final String customerId;

        public NetBankingPayment(String bankName, String customerId) {
            this.bankName = bankName;
            this.customerId = customerId;
        }

        @Override
        public void pay(double amount) {
            System.out.printf("[Payment Gateway] Processing ₹%,.2f via Net Banking (%s, User: %s)...%n",
                    amount, bankName, customerId);
            System.out.println("  ✓ Secure Bank Redirect & 2FA: VERIFIED");
            System.out.println("  ✓ Bank Reference No: NB-" + System.currentTimeMillis() % 1000000);
        }

        @Override
        public String getPaymentMethodName() {
            return "Net Banking";
        }
    }

    // E-Commerce Checkout Service demonstrating runtime polymorphism
    public static void processOrderCheckout(Payment paymentMethod, double orderAmount) {
        System.out.println("\n-------------------------------------------------------------");
        System.out.printf("Initiating Checkout | Method: %s | Amount: ₹%,.2f%n",
                paymentMethod.getPaymentMethodName(), orderAmount);
        System.out.println("-------------------------------------------------------------");
        // Polymorphic method call - dynamically resolved at runtime based on the actual object type
        paymentMethod.pay(orderAmount);
        System.out.println("Order status: ORDER CONFIRMED");
    }

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("   CASE STUDY 10: E-COMMERCE PAYMENT (POLYMORPHISM)");
        System.out.println("==================================================");

        Payment p1 = new CreditCardPayment("4111222233338901", "Aabhas Katiyar");
        Payment p2 = new UPIPayment("aabhas@okhdfcbank");
        Payment p3 = new NetBankingPayment("State Bank of India", "SBI_USER_9941");

        List<Payment> paymentOptions = new ArrayList<>();
        paymentOptions.add(p1);
        paymentOptions.add(p2);
        paymentOptions.add(p3);

        double[] sampleAmounts = { 4599.00, 1250.00, 18900.00 };

        for (int i = 0; i < paymentOptions.size(); i++) {
            processOrderCheckout(paymentOptions.get(i), sampleAmounts[i]);
        }
    }
}
