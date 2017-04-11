package Model;

class InitState extends State {

    InitState(StateMachine model) {
        super(model);
    }

    @Override
    void activate() {
        if (model.s == model.LS[7]) {
            model.s = model.LS[0];
            model.getOP().StoreData();
        }
    }
}
