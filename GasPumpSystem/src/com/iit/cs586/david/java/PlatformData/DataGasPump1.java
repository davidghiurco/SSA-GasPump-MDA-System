package PlatformData;

/*
    GasPump1 data storage object responsible for storing key platform-specific data that must be shared between
    system components

    NOTE: For the sake of shorter code and simplicity, fields are accessed directly, instead of through getters and setters
 */
public class DataGasPump1 extends Data {
    public String   gasType;
    public float    R_price;
    public float    S_price;
    public float    price;
    public int      G;
    public float    total;

    // temporary variables
    public float a;
    public float b;

}
