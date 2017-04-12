# Software Systems Architectures
## CS 586 Individual Project (Spring, 2017)

### Design pattern requirement Indications

1. State Pattern (De-centralized)
    - implemented in package "Model" of the GasPumpSystem Module
    - StateMachine is the "VM" class
    - State is the abstract State superclass
    - InitState, S0, S1, S2, S3, S4, S5, S6 are the State subclasses 
    - State classes are responsible for performing both actions and state transitions
2. Strategy Pattern
    - implemented in package "ActionStrategy" of the GasPumpSystem Module
    - OutputProcessor is the client class that needs to be initialized with proper action strategies
    - The "ActionStrategy" package contains 14 sub-packages each with 3 classes
    - One class is the abstract strategy that groups different implementations of a specific strategy
    - The other 2 classes are GasPump-1 and GasPump-2 specific implementation for the meta-actions of the model
    according to specifications for their respective GasPump requirements.
3. Abstract Factory Pattern
    - implemented in package "AbstractFactory" of the GasPumpSystem Module
    - AbstractFactory is the abstract superclass
    - ConcreteFactory1 is the factory that returns the necessary driver objects for GasPump1
    - ConcreteFactory2 is the factory that returns the necessary driver objects for GasPump2
    - The "GasPump" package contains the abstract class GasPump which uses the correct polymorphed AbstractFactory
    class to initialize the proper drivers for GasPump1 and GasPump2

### How to run
To run the executable, from the root directory of the project:

    $ java -jar GasPumpSystem/target/GasPumpSystem-1.0.jar
    
To compile the source code using Maven, then run the resulting executable:
    
    $ cd GasPumpSystem/
    $ mvn
    $ java -jar target/GasPumpSystem-1.0.jar
