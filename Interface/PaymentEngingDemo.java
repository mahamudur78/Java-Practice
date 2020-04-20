package Interface;

public class PaymentEngingDemo {
    public static void main(String[] args){
        PaymentEngine paymentEngine = new PaymentEngine();
        BkashPayment bkashPayment = new BkashPayment();
        paymentEngine.accept(bkashPayment);
        CashPayment cashPayment = new CashPayment();
        paymentEngine.accept(cashPayment);
    }
}
