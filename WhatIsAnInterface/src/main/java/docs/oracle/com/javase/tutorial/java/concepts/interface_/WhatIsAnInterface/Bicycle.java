package docs.oracle.com.javase.tutorial.java.concepts.interface_.WhatIsAnInterface;

interface Bicycle {
    void changeCadence(int newValue);

    void changeGear(int newValue);

    void speedUp(int increment);

    void applyBrakes(int decrement);
    
    void printStates();
}
