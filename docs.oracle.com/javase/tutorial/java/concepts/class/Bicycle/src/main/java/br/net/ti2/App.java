package br.net.ti2;

import br.net.ti2.Bicycle;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Bicycle bike_green = new Bicycle();

        System.out.println( bike_green.toString() );
        bike_green.changeCadence(2);
        bike_green.speedUp(10);
        System.out.println( bike_green.toString() );
        bike_green.applyBrakes(2);
        bike_green.changeGear(2);
        System.out.println( bike_green.toString() );

        System.out.println("\n*****************************************************************\n");
        // Create two different 
        // Bicycle objects
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();

        // Invoke methods on 
        // those objects
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates();

        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.printStates();
    }
}
