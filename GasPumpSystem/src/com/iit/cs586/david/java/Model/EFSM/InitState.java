package Model.EFSM;

/*
    Initial State in the EFSM model
 */
class InitState extends State {

    InitState(StateMachine model) {
        super(model);
    }

    /*
        Transition to State S0 and call the StoreData() meta-action
     */
    @Override
    void activate() {
        if (model.s == model.LS[7]) {
            model.s = model.LS[0];
            model.getOP().StoreData();
        }
    }
}
