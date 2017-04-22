package ActionStrategy.PayMsg;

/*
    GasPump1 PayMsg action responsible for printing a payment selection prompt
 */
public class PayMsg1 extends PayMsg {

    /*
        Print a payment selection prompt
     */
    @Override
    public void payMsg() {
        System.out.println("Thank you for choosing GasPump-1");
        System.out.println("Please select payment type");
    }
}
