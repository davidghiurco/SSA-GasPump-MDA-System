package DataStore;

public class DataGasPump2 extends Data {
    public int R_price;
    public int S_price;
    public int P_price;
    public float cash;
    public float price;
    public int L;
    public int total;

    /*
        Regular:    1
        Super:      2
        Premium:    3
        Cancel:     Any other string
     */
    public String gasType;


    // temporary variables
    public int temp_a;
    public int temp_b;
    public int temp_c;
    public float temp_cash;
}
