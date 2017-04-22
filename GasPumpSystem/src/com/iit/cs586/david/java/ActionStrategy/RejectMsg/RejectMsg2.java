package ActionStrategy.RejectMsg;

/*
    GasPump2 RejectMsg action --> does nothing under current system design
 */
public class RejectMsg2 extends RejectMsg {

    /*
        GasPump2 does not support credit card payment and so this action will do nothing
        Note that this action should never be invoked on a GasPump2 component,
        but in case it is, it will do nothing
    */
    @Override
    public void rejectMsg() {

    }
}
