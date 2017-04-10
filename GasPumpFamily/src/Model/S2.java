package Model;

class S2 extends State {

    S2(StateMachine model) {
        super(model);
    }

    @Override
    void approved() {
        if (model.s == model.LS[2]) {
            model.s = model.LS[3];
            model.getOP().DisplayMenu();
        }
    }

    @Override
    void rejected() {
        if (model.s == model.LS[2]) {
            model.s = model.LS[0];
            model.getOP().RejectMsg();
        }
    }
}
