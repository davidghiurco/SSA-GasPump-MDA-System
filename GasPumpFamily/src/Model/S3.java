package Model;

class S3 extends State {

    S3(StateMachine model) {
        super(model);
    }

    @Override
    void selectGas(int g) {
        if (model.s == model.LS[3]) {
            model.s = model.LS[4];
            model.getOP().SetPrice(g);
        }
    }

    @Override
    void cancel() {
        if (model.s == model.LS[3]) {
            model.s = model.LS[0];
            model.getOP().CancelMsg();
            model.getOP().ReturnCash();
        }
    }
}
