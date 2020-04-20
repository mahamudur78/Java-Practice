package Interface;

public class BkashPayment implements Payment{
    @Override
    public long getAmount(){
        System.out.println("Taking Bkash Payment");
        return 100;
    }
}
