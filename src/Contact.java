public class Contact {
    /* UC1:-Ability to create a Contacts in AddressBook with first and last names, address,
city, state, zip, phone number and
email*/
    String firstName, lastName,address;
    String city,state,zip;
    String phoneNumber,email;
    //parameterised Constructor of class
    Contact(String firstName,String lastName,String address,String city,String state,String zip,String phonenumber,String email)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.address=address;
        this.city=city;
        this.state=state;
        this.zip=zip;
        this.phoneNumber=phonenumber;
        this.email=email;
    }
}
