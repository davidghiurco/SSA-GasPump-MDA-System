package ActionStrategy.ReadyMsg;

import PlatformData.Data;

public abstract class ReadyMsg {
    Data data;

    public ReadyMsg(Data data) {
        this.data = data;
    }

    public abstract void readyMsg();
}
