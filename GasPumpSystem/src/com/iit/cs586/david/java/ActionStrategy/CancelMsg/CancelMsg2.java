package ActionStrategy.CancelMsg;

/*
    GasPump2 CancelMsg action responsible for printing a cancellation message
 */
public class CancelMsg2 extends CancelMsg {

    /*
        Print a cancellation message
     */
    @Override
    public void cancelMsg() {
        System.out.println("Cancelling transaction ... ");
    }
}
