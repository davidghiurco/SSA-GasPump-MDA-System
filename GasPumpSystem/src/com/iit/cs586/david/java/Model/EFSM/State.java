package Model.EFSM;

/*
    This class is the abstract State superclass in the De-centralized State Design Pattern

    Normally, each operation defined in this class should be abstract. However, due to Java-specific
    requirements regarding abstract classes, it was decided to instead default each operation to print
    a "not allowed" message.

    This is because if all methods in this class are declared abstract, then all abstract methods MUST be overridden
    by EACH state sub-class, and most state-subclasses would only ACTUALLY implement only 1 or 2 of the methods.
    The rest would have empty bodies and that is a waste of both coding space and memory space.

    In this design,
    methods are initially defined to print a "Not Allowed" message.
    Each state subclass inherits these methods and overrides the appropriate ones.
    This means that methods that do not get overridden will print a "Not Allowed" message
    if they are called from a state that does not allow them to be called
 */

public abstract class State {
    StateMachine model;

    public State(StateMachine model) {
        this.model = model;
    }

    void activate()         {notAllowed();}
    void start()            {notAllowed();}

    /*
        credit: t=1
        cash:   t=2
     */
    void payType(int t)     {notAllowed();}
    void approve()          {notAllowed();}
    void reject()           {notAllowed();}
    /*
        Regular:    g=1
        Super:      g=2
        Premium:    g=3
     */
    void selectGas(int g)   {notAllowed();}
    void cancel()           {notAllowed();}
    void startPump()        {notAllowed();}
    void pump()             {notAllowed();}
    void stopPump()         {notAllowed();}
    void receipt()          {notAllowed();}
    void noReceipt()        {notAllowed();}

    /*
        Print a "not allowed" message
     */
    private void notAllowed() {
        System.out.println("OPERATION NOT ALLOWED IN THIS STATE");
    }
}
