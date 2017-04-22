package ActionStrategy.StopMsg;

/*
    Abstract StopMsg action strategy
    Groups all "Stop Message" actions under 1 abstract superclass
    Note: both GasPumps print essentially the same Stop Message.
    Therefore, both classes COULD use the same action implementation for the StopMsg action

    However, under the current design, it is very easy to change each respective GasPump's StopMsg implementation
    if they need to differ from each other in a certain way. Under this design, no new classes have to be added in the case
    that such a change is needed.
 */
public abstract class StopMsg {
    public StopMsg() {
    }

    public abstract void stopMsg();
}
