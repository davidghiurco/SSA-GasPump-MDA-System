package GasPump;

import AbstractFactory.AbstractFactory;
import DataStore.DataGasPump1;
import InputProcessor.IPGasPump1;

public class GasPump1 extends GasPump {
    public GasPump1(AbstractFactory af) {
        super(af);
    }

    @Override
    public void printOperations() {
        DataGasPump1 d = (DataGasPump1) this.getData();
        System.out.println(
                "Enter an operation: " +
                        "\n(1) Activate " +
                        "(2) Start " +
                        "(3) Pay Credit " +
                        "\n(4) Select Regular Gas [$" + d.R_price + "/gal]" +
                        "(5) Select Super Gas [$" + d.S_price + "/gal]" +
                        "(6) Cancel " +
                        "\n(7) Start Pump " +
                        "(8) Pump Gallon " +
                        "(9) Stop Pump"
        );
    }

    public void Activate(Float a, Float b) {
        IPGasPump1 ip = (IPGasPump1) this.getIP();
        ip.Activate(a, b);
    }

    public void Start() {
        IPGasPump1 ip = (IPGasPump1) this.getIP();
        ip.Start();
    }

    public void PayCredit(String credit_card) {
        IPGasPump1 ip = (IPGasPump1) this.getIP();
        ip.PayCredit(credit_card);
    }

    public void Approved() {
        IPGasPump1 ip = (IPGasPump1) this.getIP();
        ip.Approved();
    }

    public void Rejected() {
        IPGasPump1 ip = (IPGasPump1) this.getIP();
        ip.Rejected();
    }

    public void Regular() {
        IPGasPump1 ip = (IPGasPump1) this.getIP();
        ip.Regular();
    }

    public void Super() {
        IPGasPump1 ip = (IPGasPump1) this.getIP();
        ip.Super();
    }

    public void Cancel() {
        IPGasPump1 ip = (IPGasPump1) this.getIP();
        ip.Cancel();
    }

    public void StartPump() {
        IPGasPump1 ip = (IPGasPump1) this.getIP();
        ip.StartPump();
    }

    public void PumpGallon() {
        IPGasPump1 ip = (IPGasPump1) this.getIP();
        ip.PumpGallon();
    }

    public void StopPump() {
        IPGasPump1 ip = (IPGasPump1) this.getIP();
        ip.StopPump();
    }
}
