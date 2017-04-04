package Model;

import OutputProcessor.OutputProcessor;

class S4 extends State {

    S4(StateMachine model, OutputProcessor op) {super(model, op);}

    @Override
    void startPump() {
        if(model.s == model.LS[4]) {
            model.s = model.LS[5];
            op.SetInitialValues();
            op.ReadyMsg();
        }
    }
}
