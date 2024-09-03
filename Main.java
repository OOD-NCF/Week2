public class Main {
    public static void main(String[] args) {
        // Using CreditCardPayment to make a payment
        Payment creditCard = new CreditCardPayment("1234-5678-9012-3456");
        creditCard.makePayment(100.50);

        // Using PayPalPayment to make a payment
        Payment payPal = new PayPalPayment("user@example.com");
        payPal.makePayment(200.75);
    }
}
