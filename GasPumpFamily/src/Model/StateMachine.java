package Model;

import OutputProcessor.OutputProcessor;

public class StateMachine {
    protected State s;
    protected State[] LS;
    protected OutputProcessor op;

    public StateMachine(OutputProcessor op) {
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
        this.op = op;
    }

}
