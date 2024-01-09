public class Contact {


    /* UC1:-Ability to create a Contacts in AddressBook with first and last names, address,
    city, state, zip, phone number and
    email*/
    String firstName, lastName,address;
    String city;
    String state;
    String zip;
    String phoneNumber,email;

    public Contact(String firstName, String lastName, String address, String city, String state, String zip, String phoneNumber, String email) {
       this.firstName = firstName;
       this.lastName = lastName;
       this.address = address;
       this.city = city;
       this.state = state;
        this.zip = zip;
       this.phoneNumber = phoneNumber;
      this.email = email;
  }



    //getter setter properties
    public String getFirstName(){return firstName;}
    public  String getLastName() {return lastName;}
    public String getAddress(){return address;}
    public String getCity(){return city; }
    public String getState(){return state;}
    public String getZip(){return zip;}
    public String getPhoneNumber(){return phoneNumber;}
    public String getEmail(){return email;}
}
