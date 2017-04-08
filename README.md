# Software Systems Architecture
## CS 586 Individual Project (Spring, 2017)

### Design pattern requirement Indications

1. State Pattern (De-centralized)
    - implemented in package "Model" of the GasPumpFamily Module
    - StateMachine is the "VM" class
    - State is the abstract superclass
    - InitState, S0, S1, S2, S3, S4, S5, S6 are the State subclasses 
    - State classes are responsible for performing both actions and state transitions
2. Strategy Pattern
    - implemented in package "OutputProcesor" of the GasPumpFamily Module
    - OutputProcessor is the abstract superclass that contains abstract method declarations
    - GasPumpOP1 & GasPumpOP2 both inherit these empty methods and implement them each in their own way
    according to specifications for their respective GasPump requirements.
3. Abstract Factory Pattern