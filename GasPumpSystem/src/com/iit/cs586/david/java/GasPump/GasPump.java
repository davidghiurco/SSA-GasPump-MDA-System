package GasPump;

import AbstractFactory.AbstractFactory;
import InputProcessor.InputProcessor;

/*
    This abstract superclass implements the client-side of the Abstract Factory design pattern.
    It provides a constructor which subclasses can use to build up their drivers and necessary objects.

    Each child GasPump class will call this superclass's constructor passing in its own ConcreteFactory
    as the AbstractFactory field.
*/

public abstract class GasPump {
    private InputProcessor ip;


    public GasPump(AbstractFactory af) {
        this.ip = af.getInputProcessor();
    }

    public abstract void printOperations();


    /*
        GETTERS AND SETTERS
    */

    public InputProcessor getIP() {
        return ip;
    }

    public void setIP(InputProcessor ip) {
        this.ip = ip;
    }

}
