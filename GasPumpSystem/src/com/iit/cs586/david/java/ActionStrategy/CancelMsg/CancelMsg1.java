package ActionStrategy.CancelMsg;

/*
    GasPump1 CancelMsg action responsible for printing a cancellation message
 */
public class CancelMsg1 extends CancelMsg {

    /*
        Print a cancellation message
     */
    @Override
    public void cancelMsg() {
        System.out.println("Cancelling transaction ... ");
    }
}
