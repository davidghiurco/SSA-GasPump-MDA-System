package GasPump;

import AbstractFactory.AbstractFactory;
import PlatformData.DataGasPump1;

public class GasPump1 extends GasPump {
    public GasPump1(AbstractFactory af) {
        super(af);
    }

    @Override
    public void printOperations() {
        System.out.println(
                        "*********************************************************************" +
                        "\nSelect operation: " +
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
                        "{q} Quit the program " +
                        "\n*********************************************************************"
        );
    }

    public void Activate(float a, float b) {
        if (a > 0 && b > 0) {
            DataGasPump1 d = (DataGasPump1) this.data;
            d.a = a;
            d.b = b;
            model.activate();
        } else {
            System.out.println("Activation failed!");
            System.out.println("Prices must be greater than $0");
        }
    }

    public void Start() {
        model.start();
    }

    public void PayCredit() {
        model.payType(1);
        System.out.println("PLEASE WAIT -- AUTHENTICATING CREDIT CARD");
    }

    public void Approve() {
        model.approve();
    }

    public void Reject() {
        model.reject();
    }

    public void Cancel() {
        model.cancel();
    }

    public void Regular() {
        model.selectGas(1);
    }

    public void Super() {
        model.selectGas(2);
    }

    public void StartPump() {
        model.startPump();
    }

    public void PumpGallon() {
        model.pump();
    }

    public void StopPump() {
        model.stopPump();
        model.receipt();
    }
}
