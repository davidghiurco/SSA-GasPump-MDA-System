package ActionStrategy.StoreCash;

/*
    GasPump1 StoreCash action --> does nothing under current system design
 */
public class StoreCash1 extends StoreCash {

    /*
        GasPump1 does not support payment with cash, and so this method should never be invoked
        by GasPump1 under the current system design.
        However, in the case that it does get invoked, it will do nothing.
    */
    @Override
    public void storeCash() {

    }
}
