package case_studies;

interface Payment {
    void pay(double amount);
}

class CreditCardPayment implements Payment {
    String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using Credit Card (Card No: " + cardNumber + ")");
    }
}

class UPIPayment implements Payment {
    String upiId;

    public UPIPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using UPI (UPI ID: " + upiId + ")");
    }
}

class NetBankingPayment implements Payment {
    String bankName;

    public NetBankingPayment(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using Net Banking (" + bankName + ")");
    }
}

public class CaseStudy10_PaymentSystem {
    public static void main(String[] args) {
        System.out.println("--- Payment Methods Demo ---");

        Payment p1 = new CreditCardPayment("1234-5678-9876-5432");
        Payment p2 = new UPIPayment("user@oksbi");
        Payment p3 = new NetBankingPayment("HDFC Bank");

        p1.pay(2499.00);
        p2.pay(550.00);
        p3.pay(12000.00);
    }
}
