package DataStore;

public class DataGasPump1 extends Data {
    public float R_price;
    public float S_price;
    public String gasType;
    public float price;
    public int G;
    public float total;
    public String credit_card;


    // temporary variables
    public float a;
    public float b;

    public void reset() {
        this.gasType = null;
        this.G = 0;
        this.total = 0;
        this.credit_card = null;

    }
}
