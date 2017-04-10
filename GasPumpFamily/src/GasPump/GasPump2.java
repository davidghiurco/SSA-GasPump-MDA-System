package GasPump;

import AbstractFactory.AbstractFactory;
import DataStore.DataGasPump2;
import InputProcessor.IPGasPump2;

public class GasPump2 extends GasPump {
    public GasPump2(AbstractFactory af) {
        super(af);
    }

    @Override
    public void printOperations() {
        DataGasPump2 d = (DataGasPump2) this.getData();
        System.out.println(
                "Enter an operation: " +
                        "\n (1) Activate" +
                        " (2): Start" +
                        " (3) Pay Cash" +
                        "\n (4) Select Regular Gas [$" + d.R_price + "/liter]" +
                        " (5) Select Super Gas [$" + d.S_price + "/liter]" +
                        " (6) Select Premium Gas [$" + d.P_price + "/liter]" +
                        " (7) Cancel" +
                        "\n (8) Start Pump" +
                        " (9) Pump Liter" +
                        "(10) Stop Pump" +
                        "\n(11) Print Receipt" +
                        "(12) No Receipt"
        );
    }

    public void Activate(Integer a, Integer b, Integer c) {
        IPGasPump2 ip = (IPGasPump2) this.getIP();
        ip.Activate(a, b, c);
    }

    public void Start() {
        IPGasPump2 ip = (IPGasPump2) this.getIP();
        ip.Start();
    }

    public void PayCash(Float cash) {
        IPGasPump2 ip = (IPGasPump2) this.getIP();
        ip.PayCash(cash);
    }

    public void Cancel() {
        IPGasPump2 ip = (IPGasPump2) this.getIP();
        ip.Cancel();
    }

    public void Regular() {
        IPGasPump2 ip = (IPGasPump2) this.getIP();
        ip.Regular();
    }

    public void Super() {
        IPGasPump2 ip = (IPGasPump2) this.getIP();
        ip.Super();
    }

    public void Premium() {
        IPGasPump2 ip = (IPGasPump2) this.getIP();
        ip.Premium();
    }

    public void StartPump() {
        IPGasPump2 ip = (IPGasPump2) this.getIP();
        ip.StartPump();
    }

    public void PumpLiter() {
        IPGasPump2 ip = (IPGasPump2) this.getIP();
        ip.PumpLiter();
    }

    public void Stop() {
        IPGasPump2 ip = (IPGasPump2) this.getIP();
        ip.Stop();
    }

    public void Receipt() {
        IPGasPump2 ip = (IPGasPump2) this.getIP();
        ip.Receipt();
    }

    public void NoReceipt() {
        IPGasPump2 ip = (IPGasPump2) this.getIP();
        ip.NoReceipt();
    }
}
