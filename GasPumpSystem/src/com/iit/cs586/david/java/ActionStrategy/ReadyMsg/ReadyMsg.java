package ActionStrategy.ReadyMsg;

import PlatformData.Data;

/*
    Abstract ReadyMsg action strategy
    Groups all "Ready Message" actions under 1 abstract superclass
 */
public abstract class ReadyMsg {
    Data data;

    public ReadyMsg(Data data) {
        this.data = data;
    }

    public abstract void readyMsg();
}
