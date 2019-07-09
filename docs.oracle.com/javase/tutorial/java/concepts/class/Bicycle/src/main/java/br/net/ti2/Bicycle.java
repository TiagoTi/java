package br.net.ti2;

public class Bicycle {
    int cadence = 0;

    void changeCadence(int newCadence){
        this.cadence = newCadence;
    }

    public String state(){
        return "Cadence: " + this.cadence;
    }
}