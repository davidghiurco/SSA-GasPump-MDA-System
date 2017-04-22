package ActionStrategy.SetPrice;

import PlatformData.Data;
import PlatformData.DataGasPump1;

/*
    GasPump1 SetPrice action responsible for updating the shared data structure with the correct price based on the
    selected gas type
 */
public class SetPrice1 extends SetPrice {

    public SetPrice1(Data data) {
        super(data);
    }

    /*
        Set the price per gallon for this transaction according to the type of gas which was selected to be pumped

        @param g : integer passed in from the EFSM model representing the type of gasoline
        for which the price calculation must be set
        For GasPump1:
        g = 1: Regular gas
        g = 2: Super gas
     */
    @Override
    public void setPrice(int g) {
        DataGasPump1 d = (DataGasPump1) data;
        if (g == 1) { // Regular selected
            d.price = d.R_price;
            d.gasType = "Regular";
        } else if (g == 2) { // Super selected
            d.price = d.S_price;
            d.gasType = "Super";
        }
        System.out.println(d.gasType + " gasoline selected @ price of $" + d.price + "/gallon");
        System.out.println("Select (8) to start the pump");
    }
}
