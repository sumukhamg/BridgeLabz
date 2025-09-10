package create_contact;

import java.util.ArrayList;

public class AddressBook {
    ArrayList<Contacts> contactList = new ArrayList<>();
    private static AddressBook addressBookObj;

    private AddressBook() {

    }

    public void addContact(Contacts contact) {
        contactList.add(contact);
    }

    public void display() {
        if (contactList.isEmpty())
            System.out.println("No contacts found");
        else
            System.out.println(contactList);
    }

    public static AddressBook createObject() {
        if (addressBookObj == null)
            addressBookObj = new AddressBook();
        return addressBookObj;
    }

}