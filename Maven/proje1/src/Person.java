public class Person implements PhoneCall, FaxReceiver{
    private String firstname;
    private String lastname;
    private PhoneNumber phone;
    private PhoneNumber fax;
    
    public Person(String firstname_, String lastanme_){
        this.firstname = firstname_;
        this.lastname = lastanme_;
    }

    public void setPhone(PhoneNumber phoneNumber){
        this.phone = phoneNumber;
    }

    public void setFax(PhoneNumber phoneNumber){
        this.fax = phoneNumber;
    }
  }