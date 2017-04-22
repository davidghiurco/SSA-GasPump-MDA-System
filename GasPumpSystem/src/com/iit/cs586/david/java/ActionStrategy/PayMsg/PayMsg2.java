package ActionStrategy.PayMsg;

/*
    GasPump2 PayMsg action responsible for printing a payment selection prompt
 */
public class PayMsg2 extends PayMsg {

    /*
        Print a payment selection prompt
     */
    @Override
    public void payMsg() {
        System.out.println("Thank you for choosing GasPump-2");
        System.out.println("Please select payment type: ");
    }
}
