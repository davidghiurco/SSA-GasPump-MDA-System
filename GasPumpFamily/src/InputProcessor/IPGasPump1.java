package InputProcessor;

import DataStore.Data;
import DataStore.DataGasPump1;
import Model.StateMachine;

public class IPGasPump1 extends InputProcessor {
    // inherit StateMachine model object
    // inherit Data data object

    public IPGasPump1(StateMachine model, DataGasPump1 data) {
        super(model, data);
    }

    void Activate(float a, float b) {
        if(a > 0 && b > 0) {
            DataGasPump1 d = (DataGasPump1) data;
            d.a = a;
            d.b = b;
            model.activate();
        }
    }

    void Start() {
        model.start();
    }

    void PayCredit(String credit_card) {
        DataGasPump1 d = (DataGasPump1) data;
        d.credit_card = credit_card;
        model.payType(1);
    }

    void Approved() {
        model.approved();
    }

    void Rejected() {
        model.rejected();
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

    void StartPump() {
        model.startPump();
    }

    void PumpGallon() {
        model.pump();
    }

    void StopPump() {
        model.stopPump();
        model.receipt();
    }
}
