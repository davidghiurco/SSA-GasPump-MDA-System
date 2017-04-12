package ActionStrategy.SetPrice;

import PlatformData.Data;

public abstract class SetPrice {
    Data data;

    public SetPrice(Data data) {
        this.data = data;
    }

    public abstract void setPrice(int g);
}
