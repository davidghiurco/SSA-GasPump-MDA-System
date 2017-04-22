package Model.EFSM;

/*
    State S2 in the EFSM model
 */
class S2 extends State {

    S2(StateMachine model) {
        super(model);
    }

    /*
        Transition to State S3 and call DisplayMenu() meta-action
     */
    @Override
    void approve() {
        if (model.s == model.LS[2]) {
            model.s = model.LS[3];
            model.getOP().DisplayMenu();
        }
    }

    /*
        Transition to State S0 and call RejectMsg() meta-action
     */
    @Override
    void reject() {
        if (model.s == model.LS[2]) {
            model.s = model.LS[0];
            model.getOP().RejectMsg();
        }
    }
}
