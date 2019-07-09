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
        Bicycle bike_orange = new Bicycle();

        System.out.println( bike_green.toString() );
        bike_green.changeCadence(2);
        bike_green.speedUp(10);
        System.out.println( bike_green.toString() );
        bike_green.applyBrakes(2);
        System.out.println( bike_green.toString() );
    }
}
