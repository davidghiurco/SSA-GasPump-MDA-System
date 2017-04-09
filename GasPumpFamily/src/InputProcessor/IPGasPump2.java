package InputProcessor;
import DataStore.DataGasPump2;

public class IPGasPump2 extends InputProcessor {
    //inherit Data data object
    //inherit StateMachine model object

    public IPGasPump2() {}

    void Activate(int a, int b, int c) {
        if (a > 0 && b > 0 && c > 0) {
            DataGasPump2 d = (DataGasPump2) data;
            d.a = a;
            d.b = b;
            d.c = c;
            model.activate();
        }
    }

    void Start() {
        model.start();
    }

    void PayCash(float cash) {
        if(cash > 0){
            DataGasPump2 d = (DataGasPump2) data;
            d.temp_cash = cash;
            model.payType(2);
        }
    }

    void Cancel() {
        model.cancel();
    }

    void Regular() {
        model.selectGas(1);
    }

    void Super() {
        model.selectGas(2);
    }

    void Premium() {
        model.selectGas(3);
    }

    void StartPump() {
        model.startPump();
    }

    void PumpLiter() {
        DataGasPump2 d = (DataGasPump2) data;
        if(d.cash < d.L + 1) {
            model.stopPump();
        }
        else {
            model.pump();
        }
    }

    void Stop() {
        model.stopPump();
    }

    void Receipt() {
        model.receipt();
    }

    void NoReceipt() {
        model.noReceipt();
    }
}
