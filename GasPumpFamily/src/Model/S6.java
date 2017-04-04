package Model;

import OutputProcessor.OutputProcessor;

class S6 extends State {

    S6(StateMachine model, OutputProcessor op) {super(model, op);}

    @Override
    void receipt() {
        if(model.s == model.LS[6]) {
            model.s = model.LS[0];
            op.PrintReceipt();
            op.ReturnCash();
        }
    }

    @Override
    void noReceipt() {
        if(model.s == model.LS[6]) {
            model.s = model.LS[0];
            op.ReturnCash();
        }
    }
}
