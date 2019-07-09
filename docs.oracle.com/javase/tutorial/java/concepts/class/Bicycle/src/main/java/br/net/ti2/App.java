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
        Bicycle b = new Bicycle();
        System.out.println( b.toString() );
        b.changeCadence(2);
        System.out.println( b.toString() );
    }
}
