public class Invoice {

    private double amount;

    public Invoice(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    // The method now accepts a PaymentStrategy object to process payment
    public void processPayment(PaymentStrategy paymentStrategy) {
        paymentStrategy.processPayment(this.amount);
    }
}
