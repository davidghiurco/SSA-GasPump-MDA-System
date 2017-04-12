package ActionStrategy.SetPrice;

import PlatformData.Data;
import PlatformData.DataGasPump2;

public class SetPrice2 extends SetPrice {

    public SetPrice2(Data data) {
        super(data);
    }

    @Override
    public void setPrice(int g) {
        DataGasPump2 d = (DataGasPump2) data;
        if (g == 1) { // Regular selected
            d.price = d.R_price;
            d.gasType = "Regular";
        } else if (g == 2) { // Super selected
            d.price = d.S_price;
            d.gasType = "Super";
        } else if (g == 3) { // Premium selected
            d.price = d.P_price;
            d.gasType = "Premium";
        }
        System.out.println(d.gasType + " gasoline selected @ price of $" + d.price + "/liter");
        System.out.println("Select (7) to start the pump");
    }
}
