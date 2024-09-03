/* Polymorphism*

For example, the Main class can use the Payment interface to process
payments without needing to
know whether it's dealing with a credit card, PayPal, or any other payment type.

/
 */


interface Payment {
    // Method to process the payment
    void makePayment(double amount);
}
