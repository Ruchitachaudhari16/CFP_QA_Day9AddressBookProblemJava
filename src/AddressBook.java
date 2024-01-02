import java.util.ArrayList;

public class AddressBook {
    public static  void main(String[] args)
    {
        System.out.println("Welcome to Address Book Problem");
        //Create object of a contact class.
        Contact cs=new Contact("Ruchita","Chaudhari","balaji nagar","karanja Lad","Mararastra","444105","9158834567","abc@gmail.com");
        Contact csOne=new Contact("Nita","Chaudhari","balaji nagar","karanja Lad","Mararastra","444105","9124344567","nitac@gmail.com");
        Contact csTwo=new Contact("Ruta","Chaudhari","balaji nagar","karanja Lad","Mararastra","444105","9134567890","rita123@gmail.com");

        //Create a arraylist of Contact class
        ArrayList<Contact> contacts=new ArrayList<>();
        contacts.add(cs);
        contacts.add(csOne);
        contacts.add(csTwo);
        for(Contact con :contacts)
        {
            System.out.println(con.firstName);
            System.out.println(con.lastName);
            System.out.println(con.address);
            System.out.println(con.city);
            System.out.println(con.state);
            System.out.println(con.zip);
            System.out.println(con.phoneNumber);
            System.out.println(con.email);
            System.out.println("-----------------------------");
        }


    }
}
