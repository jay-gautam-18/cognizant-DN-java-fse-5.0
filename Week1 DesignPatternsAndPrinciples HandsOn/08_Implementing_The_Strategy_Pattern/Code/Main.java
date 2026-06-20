public class Main {
    public static void main(String[] args) {

        System.out.println();
        
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9876-5432", "jaydaku");
        PaymentStrategy payPalPayment = new PayPalPayment("jaykimail@gmail.com");

        
        PaymentContext paymentContext = new PaymentContext(creditCardPayment);
        paymentContext.executePayment(800);

        paymentContext = new PaymentContext(payPalPayment);
        paymentContext.executePayment(100);
    }
}
