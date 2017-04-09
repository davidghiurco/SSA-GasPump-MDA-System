package DataStore;

public class DataGasPump2 extends Data {
    /*
        Regular:    1
        Super:      2
        Premium:    3
        Cancel:     Any other string
    */
    public String   gasType;
    public int      R_price;
    public int      S_price;
    public int      P_price;
    public float    cash;
    public int      price;
    public int      L;
    public int      total;

    // temporary variables
    public int a;
    public int b;
    public int c;
    public float temp_cash;
}
