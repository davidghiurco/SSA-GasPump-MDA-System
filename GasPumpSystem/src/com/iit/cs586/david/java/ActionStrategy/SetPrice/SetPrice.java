package ActionStrategy.SetPrice;

import PlatformData.Data;

/*
    Abstract SetPrice action strategy
    Groups all "Set Price" actions under 1 abstract superclass
 */
public abstract class SetPrice {
    Data data;

    public SetPrice(Data data) {
        this.data = data;
    }

    public abstract void setPrice(int g);
}
