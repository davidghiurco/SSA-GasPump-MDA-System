package Model;

import OutputProcessor.OutputProcessor;

class S3 extends State {

    S3(StateMachine model, OutputProcessor op) {super(model, op);}

    @Override
    void selectGas(int g) {
        if (model.s == model.LS[3]) {
            model.s = model.LS[4];
            op.SetPrice(g);
        }
    }

    @Override
    void cancel() {
        if (model.s == model.LS[3]) {
            model.s = model.LS[0];
            op.CancelMsg();
            op.ReturnCash();
        }
    }
}
