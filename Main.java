public class Main {
    public static void main(String[] args) {
        // Create an Invoice object with a specified amount
        Invoice invoice = new Invoice(150.75);

        // Process payment using Credit Card
        System.out.println("Processing with Credit Card:");
        PaymentStrategy creditCardPayment = new CreditCardPayment();
        invoice.processPayment(creditCardPayment);

        // Process payment using PayPal
        System.out.println("\nProcessing with PayPal:");
        PaymentStrategy payPalPayment = new PayPalPayment();
        invoice.processPayment(payPalPayment);

        // Additional payment types can be added in the future without modifying Invoice class
    }
}