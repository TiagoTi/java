package docs.oracle.com.javase.tutorial.java.concepts.interface_.WhatIsAnInterface;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
@AllArgsConstructor
public @Data class ACMEBicycle implements Bicycle {

    int cadence = 0;
    int speed = 0;
    int gear = 1;

    public void changeCadence(int newCadence){
        cadence = newCadence;
    }

    public void speedUp(int increment) {
        speed += increment;   
   }

   public void applyBrakes(int decrement) {
        speed -= decrement;
   }

   public void changeGear(int newGear){
       gear = newGear;
   }

   public void printStates(){
       System.out.println(toString());
   }

}
