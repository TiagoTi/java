package br.net.ti2;

import lombok.Data;

public @Data class Bicycle {
    int cadence = 0;
    int speed = 0;

    void changeCadence(int newCadence){
        this.cadence = newCadence;
    }

    void speedUp(int increment) {
        speed += increment;   
   }

   void applyBrakes(int decrement) {
        speed -= decrement;
   }
}