package GasPump;

import AbstractFactory.AbstractFactory;
import PlatformData.DataGasPump1;

/*
    This class is the InputProcessor for GasPump1
 */
public class GasPump1 extends GasPump {
    public GasPump1(AbstractFactory af) {
        super(af);
    }

    /*
        Print a menu of supported operations
     */
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
                        "\n(5) Regular " +
                        "(6) Super " +
                        "(7) Cancel " +
                        "\n(8) StartPump " +
                        "(9) PumpGallon " +
                        "(x) StopPump " +
                        "{q} Quit the program " +
                        "\n*********************************************************************"
        );
    }

    /*
        Check the input parameters for correctness, and call the
        activate() meta-event of the EFSM model

        If input is incorrect, print a message indicating as such

        @param a: price of Regular gas
        @param b: price of Super gas1
     */
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

    /*
        Call the start() meta-event of the EFSM model
     */
    public void Start() {
        model.start();
    }

    /*
        Call the payType() meta-event of the EFSM model,
        passing in "1" as the payment type which represents credit payment under the model design

        Also print a credit card authentication message
     */
    public void PayCredit() {
        model.payType(1);
        System.out.println("PLEASE WAIT -- AUTHENTICATING CREDIT CARD");
    }

    /*
        Call the approve() meta-event of the EFSM model
     */
    public void Approve() {
        model.approve();
    }

    /*
        Call the reject() meta-event of the EFSM model
     */
    public void Reject() {
        model.reject();
    }

    /*
        Call the cancel() meta-event of the EFSM model
     */
    public void Cancel() {
        model.cancel();
    }

    /*
        Call the selectGas() meta-event of the EFSM model,
        passing in 1 as the gas-type
     */
    public void Regular() {
        model.selectGas(1);
    }

    /*
        Call the selectGas() meta-event of the EFSM model,
        passing in 2 as the gas-type
     */
    public void Super() {
        model.selectGas(2);
    }

    /*
        Call the startPump() meta-event of the EFSM model
     */
    public void StartPump() {
        model.startPump();
    }

    /*
        Call the pump() meta-event of the EFSM model
     */
    public void PumpGallon() {
        model.pump();
    }

    /*
        call the stopPump() and receipt() meta-events of the EFSM model

        Note: GasPump1 always prints receipts after fuel is finished dispensing under current
        system design.
     */
    public void StopPump() {
        model.stopPump();
        model.receipt();
    }
}
