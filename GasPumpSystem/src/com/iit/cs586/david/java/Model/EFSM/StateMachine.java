package Model.EFSM;

import Model.OutputProcessor.OutputProcessor;

/*
    This class is the VM class in the De-centralized State design pattern
    State classes are responsible for performing
        1) Actions
        2) State transitions
 */

public class StateMachine {
    protected State s;
    protected State[] LS;
    private OutputProcessor op;

    public StateMachine() {
        // list of states in the EFSM
        LS = new State[8];

        // instantiate each state, passing in a reference to this VM class
        LS[7] = new InitState(this);
        LS[0] = new S0(this);
        LS[1] = new S1(this);
        LS[2] = new S2(this);
        LS[3] = new S3(this);
        LS[4] = new S4(this);
        LS[5] = new S5(this);
        LS[6] = new S6(this);

        s = LS[7]; // Initially in the Init State
    }
    /*
        Getters and Setters
     */

    public OutputProcessor getOP() {
        return op;
    }

    public void setOP(OutputProcessor op) {
        this.op = op;
    }

    /*
        State operations --> forward the called operation to the state class
     */

    public void activate() {
        s.activate();
    }

    public void start() {
        s.start();
    }

    /*
        @param t : t = 1 represents credit card payment type
                   t = 2 represents cash payment type
     */
    public void payType(int t) {
        s.payType(t);
    }

    public void approve() {
        s.approve();
    }

    public void reject() {
        s.reject();
    }

    public void cancel() {
        s.cancel();
    }

    /*
        @param g: g = 1 represents Regular gas
                  g = 2 represents Super gas
                  g = 3 represents Premium gas
     */
    public void selectGas(int g) {
        s.selectGas(g);
    }

    public void startPump() {
        s.startPump();
    }

    public void pump() {
        s.pump();
    }

    public void stopPump() {
        s.stopPump();
    }

    public void receipt() {
        s.receipt();
    }

    public void noReceipt() {
        s.noReceipt();
    }


}
