package docs.oracle.com.javase.tutorial.java.concepts.inheritance.WhatIsInheritance;

import lombok.Data;
import lombok.ToString;

@ToString
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