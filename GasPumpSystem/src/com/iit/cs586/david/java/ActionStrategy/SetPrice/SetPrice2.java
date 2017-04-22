package ActionStrategy.SetPrice;

import PlatformData.Data;
import PlatformData.DataGasPump2;

/*
    GasPump2 SetPrice action responsible for updating the shared data structure with the correct price based on the
    selected gas type
 */
public class SetPrice2 extends SetPrice {

    public SetPrice2(Data data) {
        super(data);
    }

    /*
        Set the price per gallon for this transaction according to the type of gas which was selected to be pumped

        @param g : integer passed in from the EFSM model representing the type of gasoline
        for which the price calculation must be set
        For GasPump2:
        g = 1: Regular gas
        g = 2: Super gas
        g = 3: Premium gas
    */
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
