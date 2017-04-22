package ActionStrategy.CancelMsg;
/*
    Abstract CancelMsg action strategy.
    Groups all "Cancel Message" actions under 1 abstract superclass strategy.
    In the case of cancellation messages, GasPump1 and GasPump2 have the same output, and so only 1 action
    strategy class could have been used for both GasPumps.
    However, in view of potential changes that might be needed to be made in the future, each GasPump
    gets its own CancelMsg action class to allow for easy modification in the future without having to
    program new classes.
 */
public abstract class CancelMsg {
    public CancelMsg() {
    }

    public abstract void cancelMsg();
}
