package ActionStrategy.StopMsg;

/*
    GasPump1 StopMsg action responsible for printing a message indicating that the pump is stopping
 */
public class StopMsg1 extends StopMsg {

    /*
        Print a message indicating to the user that the pump is stopping
     */
    @Override
    public void stopMsg() {
        System.out.println("STOPPING PUMP ...");
    }
}
