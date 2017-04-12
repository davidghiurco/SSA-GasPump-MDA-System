package InputProcessor;

import PlatformData.DataGasPump1;

/*
    This class implements the platform specifications for input processing of GasPump1
*/
public class IPGasPump1 extends InputProcessor {
    // inherit Data data object
    // inherit StateMachine model object

    public IPGasPump1() {
        super();
    }

    public void Activate(float a, float b) {
        if (a > 0 && b > 0) {
            DataGasPump1 d = (DataGasPump1) data;
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
