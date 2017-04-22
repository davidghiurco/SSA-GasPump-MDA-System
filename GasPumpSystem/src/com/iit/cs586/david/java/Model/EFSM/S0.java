package Model.EFSM;

/*
    State S0 in the EFSM model
 */
class S0 extends State {

    S0(StateMachine model) {
        super(model);
    }

    /*
        Transition to State S1 and call the PayMsg() meta-action
     */
    @Override
    void start() {
        if (model.s == model.LS[0]) {
            model.s = model.LS[1];
            model.getOP().PayMsg();
        }
    }
}
