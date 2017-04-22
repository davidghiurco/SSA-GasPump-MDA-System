package PlatformData;

/*
    GasPump2 data storage object responsible for storing key platform-specific data that must be shared between
    system components

    NOTE: For the sake of shorter code and simplicity, fields are accessed directly, instead of through getters and setters
 */
public class DataGasPump2 extends Data {
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
