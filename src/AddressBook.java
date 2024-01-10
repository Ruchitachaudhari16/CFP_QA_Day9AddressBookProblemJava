import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    //Create a arraylist of Contact class
    List<Contact> contactlist = new ArrayList<>();

    //enter a proper choice
    void enterProperChoice() {
        System.out.println("1.Create new Contact");
        System.out.println("2.Display contact");
        System.out.println("3.Edit contact");
        System.out.println("4.Delete contact");
    }

    //Create contact method
    public Contact createUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the FirstName");
        String firstname = sc.nextLine();
        System.out.println("Enter the Lastname");
        String lastname = sc.nextLine();
        System.out.println("Enter the Address");
        String address = sc.nextLine();
        System.out.println("Enter the City");
        String city = sc.nextLine();
        System.out.println("Enter the State");
        String state = sc.nextLine();
        System.out.println("Enter the Zip");
        String zip = sc.nextLine();
        System.out.println("Enter the Phonenumber");
        String phoneNumber = sc.nextLine();
        System.out.println("Enter the email");
        String email = sc.nextLine();
        //Using list object call to add contact method.
        Contact contact = new Contact(firstname, lastname, address, city, state, zip, phoneNumber, email);
        return contact;
    }

    //add contact from a list
    void addContact(Contact contact) {
        contactlist.add(contact);
    }

    //Display contact using foreach loop in display method.
    public void displayContact() {
        for (Contact contact : contactlist) {
            System.out.println(contact.getFirstName() + " " + contact.getLastName() + " " + contact.getAddress() + " "
                    + contact.getCity() + " " + contact.getState() + " " + contact.getZip() + " " + contact.getPhoneNumber() + " "
                    + contact.getEmail());

        }

    }

   //Remove contact
    public void removeContactByfirstname(String firstname)
    {
        for(Contact contact:contactlist)
        {
            if(contact.getFirstName()==firstname)
            {
                contactlist.remove(contact);
            }
        }
        System.out.println("Contact Deleted Successfully");
    }

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();

        System.out.println("Welcome to Address Book Problem");
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            addressBook.enterProperChoice();
            option = sc.nextInt();
            switch (option) {
                case 1:
                    //Create new contact
                    Contact con = addressBook.createUserInput();
                    addressBook.addContact(con);
                    break;

                case 2:
                    addressBook.displayContact();
                    break;
                case 3:
                    // addressBook.editContact();
                    // addressBook.editContactByLastname("Chau");
                    break;
                case 4:
                    addressBook.removeContactByfirstname("Ruchita");
                    default:
                    System.out.println("Wrong option");
            }
        }
        while (option != 3);
    }
}



