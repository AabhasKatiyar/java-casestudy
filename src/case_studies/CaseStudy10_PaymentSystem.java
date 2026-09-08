package case_studies;

public class CaseStudy10_PaymentSystem {

    public interface Payment {
        void pay(double amount);
    }

    public static class CreditCardPayment implements Payment {

        private String cardNumber;

        public CreditCardPayment(String cardNumber) {
            this.cardNumber = cardNumber;
        }

        public void pay(double amount) {
            System.out.println("Paid ₹" + amount + " using Credit Card " + cardNumber);
        }
    }

    public static class UPIPayment implements Payment {

        private String upiId;

        public UPIPayment(String upiId) {
            this.upiId = upiId;
        }

        public void pay(double amount) {
            System.out.println("Paid ₹" + amount + " using UPI " + upiId);
        }
    }

    public static class NetBankingPayment implements Payment {

        private String bankName;

        public NetBankingPayment(String bankName) {
            this.bankName = bankName;
        }

        public void pay(double amount) {
            System.out.println("Paid ₹" + amount + " using Net Banking (" + bankName + ")");
        }
    }

    public static void processPayment(Payment payment, double amount) {
        payment.pay(amount);
    }

    public static void main(String[] args) {

        Payment p1 = new CreditCardPayment("XXXX-1234");
        Payment p2 = new UPIPayment("user@upi");
        Payment p3 = new NetBankingPayment("State Bank of India");

        System.out.println("E-Commerce Payment System\n");

        processPayment(p1, 4599);
        processPayment(p2, 1250);
        processPayment(p3, 18900);
    }
}
