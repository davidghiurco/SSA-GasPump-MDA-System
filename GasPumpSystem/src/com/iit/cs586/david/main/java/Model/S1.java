package Model;

class S1 extends State {

    S1(StateMachine model) {
        super(model);
    }

    /*
        credit: t=1
        cash:   t=2
     */
    @Override
    void payType(int t) {
        if ((t == 1) && (model.s == model.LS[1])) {
            model.s = model.LS[2];
        } else if ((t == 2) && (model.s == model.LS[1])) {
            model.s = model.LS[3];
            model.getOP().StoreCash();
            model.getOP().DisplayMenu();
        }
    }
}
