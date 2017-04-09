package Model;

import OutputProcessor.OutputProcessor;

/*
    This class is the VM class in the De-centralized State design pattern
*/

public class StateMachine {
    State s;
    State[] LS;
    private OutputProcessor op;

    public StateMachine() {
        LS = new State[8];
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

    OutputProcessor getOP() {
        return op;
    }

    public void setOP(OutputProcessor op) {
        this.op = op;
    }

    public void activate() {
        s.activate();
    }

    public void start() {
        s.start();
    }

    /*
        credit: t=1
        cash:   t=2
     */
    public void payType(int t) {
        s.payType(t);
    }

    public void approved() {
        s.approved();
    }

    public void rejected() {
        s.rejected();
    }

    public void cancel() {
        s.cancel();
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

    /*
        Regular:    g=1
        Super:      g=2
        Premium:    g=3
     */
    public void selectGas(int g) {
        s.selectGas(g);
    }

    public void receipt() {
        s.receipt();
    }

    public void noReceipt() {
        s.noReceipt();
    }


}
