package docs.oracle.com.javase.tutorial.java.nutsandbolts.datatypes.PrimitiveDataTypes;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        byte byteMax = 127;
        byte byteMin = -128;
        
        short shortMin = -32768;
        short shotMax = 32767;
        
        int intMin = -2147483648;
        int intMax = 2147483647;
        
        System.out.println("Byte Min: "+ byteMin + "\nByte Max: "+ byteMax+"\n+++++++++++++++++++");
        System.out.println("Short Min: "+ shortMin + "\nShort Max: "+ shotMax+"\n+++++++++++++++++++");
        System.out.println("Int Min: "+ intMin + "\nInt Max: "+ intMax+"\n+++++++++++++++++++");
        
        
        // Literals
        int b1 = 0b10;
        System.out.println(b1 + b1);
        
        int exa = 0x0000000f;
        System.out.println(exa+exa);
    }
}
