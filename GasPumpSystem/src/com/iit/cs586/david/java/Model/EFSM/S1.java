package Model.EFSM;

/*
    State S1 in the EFSM model
 */
class S1 extends State {

    S1(StateMachine model) {
        super(model);
    }

    /*
        credit: t=1
            Transition to State S2
            No meta-action called
        cash:   t=2
            Transition to State S3
            Call StoreCash() and DisplayMenu() meta-actions
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
