package GasPump;

import AbstractFactory.AbstractFactory;
import InputProcessor.IPGasPump1;

public class GasPump1 extends GasPump {
    public GasPump1(AbstractFactory af) {
        super(af);
    }

    @Override
    public void printOperations() {
        System.out.println(
                "GasPump-1 " +
                        "\nMENU of Operations: " +
                        "\n-------------------------" +
                        "\n(0) Activate " +
                        "\n(1) Start " +
                        "\n(2) Pay Credit " +
                        "\n(3) Approve " +
                        "\n(4) Reject" +
                        "\n(5) Select Regular Gas " +
                        "\n(6) Select Super Gas " +
                        "\n(7) Cancel " +
                        "\n(8) Start Pump " +
                        "\n(9) Pump Gallon " +
                        "\n(x) Stop Pump" +
                        "\n{q} Quit the program" +
                        "\n-------------------------"
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

    public void Approve() {
        IPGasPump1 ip = (IPGasPump1) this.getIP();
        ip.Approve();
    }

    public void Reject() {
        IPGasPump1 ip = (IPGasPump1) this.getIP();
        ip.Reject();
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

    /*
        HELPER METHODS
    */
}
