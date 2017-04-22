package ActionStrategy.ReturnCash;

import PlatformData.Data;

/*
    Abstract ReturnCash action strategy
    Groups sll "Return Cash" actions under 1 abstract superclass
 */
public abstract class ReturnCash {
    Data data;

    /*
        GasPump1 constructor (doesn't need the shared data structure)
        Note, GasPump1 should never call this constructor under the current system design
     */
    public ReturnCash() {
    }

    /*
        GasPump2 constructor (needs the shared data structure)
     */
    public ReturnCash(Data data) {
        this.data = data;
    }

    public abstract void returnCash();
}
