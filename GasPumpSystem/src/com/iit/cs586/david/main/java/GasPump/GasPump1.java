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
                        "Select operation: " +
                        "\n(0) Activate(float a, float b) " +
                        "\n(1) Start " +
                        "(2) PayCredit " +
                        "(3) Approve " +
                        "(4) Reject" +
                        "\n(5) RegularGas " +
                        "(6) SuperGas " +
                        "(7) Cancel " +
                        "\n(8) StartPump " +
                        "(9) PumpGallon " +
                        "(x) StopPump " +
                        "{q} Quit the program "
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

    public void PayCredit() {
        IPGasPump1 ip = (IPGasPump1) this.getIP();
        ip.PayCredit();
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
}
