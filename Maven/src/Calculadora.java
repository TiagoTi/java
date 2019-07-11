import com.thoughtworks.xstream.XStream;

public class Calculadora {
    public static void main(String[] args){
        XStream xstream = new XStream();
        xstream.alias("person", Person.class);
        xstream.alias("phonenumber", PhoneNumber.class);
        Person joe = new Person("Joe", "Walnes");
        joe.setPhone(new PhoneNumber(123, "1234-456"));
        joe.setFax(new PhoneNumber(123, "9999-999"));
        String xml = xstream.toXML(joe);
        System.out.println(xml );
        System.out.println("A soma de 5 mais 5 é : " + (5+5) );
    }
}