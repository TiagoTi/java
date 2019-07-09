package br.net.ti2;

import lombok.Data;

public @Data class Bicycle {
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    void changeCadence(int newCadence){
        cadence = newCadence;
    }

    void speedUp(int increment) {
        speed += increment;   
   }

   void applyBrakes(int decrement) {
        speed -= decrement;
   }

   void changeGear(int newGear){
       gear = newGear;
   }

   void printStates(){
       System.out.println(toString());
   }
}