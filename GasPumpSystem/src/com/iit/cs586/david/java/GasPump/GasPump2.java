package GasPump;

import AbstractFactory.AbstractFactory;
import PlatformData.DataGasPump2;

public class GasPump2 extends GasPump {
    public GasPump2(AbstractFactory af) {
        super(af);
    }

    @Override
    public void printOperations() {
        System.out.println(
                        "*********************************************************************" +
                        "\nSelect operation: " +
                        "\n(0) Activate(int a, int b, int c)" +
                        "\n(1) Start " +
                        "(2) PayCash " +
                        "\n(3) RegularGas " +
                        "(4) SuperGas " +
                        "(5) PremiumGas " +
                        "(6) Cancel " +
                        "\n(7) StartPump " +
                        "(8) PumpLiter " +
                        "(9) Stop " +
                        "\n(p) PrintReceipt " +
                        "(n) NoReceipt " +
                        "(q) Quit the program " +
                        "\n*********************************************************************"
        );
    }

    public void Activate(int a, int b, int c) {
        if (a > 0 && b > 0 && c > 0) {
            DataGasPump2 d = (DataGasPump2) data;
            d.a = a;
            d.b = b;
            d.c = c;
            model.activate();
        } else {
            System.out.println("Activation failed!");
            System.out.println("Prices must be greater than $0");
        }
    }

    public void Start() {
        model.start();
    }

    public void PayCash(float cash) {
        if (cash > 0) {
            DataGasPump2 d = (DataGasPump2) data;
            d.temp_cash = cash;
            model.payType(2);
        } else {
            System.out.println("Cash amount must be greater than $0");
        }
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

    public void Premium() {
        model.selectGas(3);
    }

    public void StartPump() {
        model.startPump();
    }

    public void PumpLiter() {
        DataGasPump2 d = (DataGasPump2) data;
        if (d.cash < d.price * (d.L + 1)) {
            System.out.println("NOT ENOUGH CASH");
            model.stopPump();
        } else {
            model.pump();
        }
    }

    public void Stop() {
        model.stopPump();
    }

    public void Receipt() {
        model.receipt();
    }

    public void NoReceipt() {
        model.noReceipt();
    }
}
