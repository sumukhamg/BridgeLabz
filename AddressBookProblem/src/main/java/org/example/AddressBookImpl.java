package create_contact;

import java.util.ArrayList;
import java.util.Iterator;

public class AddressBookImpl implements AddressBook {
    ArrayList<Contacts> contactList = new ArrayList<>();

    public AddressBookImpl() {

    }

    @Override
    public void addContact(Contacts contact) {
        contactList.add(contact);
    }

    @Override
    public void display() {
        if (contactList.isEmpty())
            System.out.println("No contacts found");
        else {
            for (Contacts details : contactList) {
                System.out.println("First Name: " + details.getFirstName());
                System.out.println("Last Name: " + details.getLastName());
                System.out.println("Address: " + details.getAddress());
                System.out.println("City: " + details.getCity());
                System.out.println("State: " + details.getState());
                System.out.println("Phone number: " + details.getPhoneNo());
                System.out.println("Email: " + details.getEmail());
            }
        }

    }

    public boolean isPresent(String firstName) {
        if (contactList.isEmpty())
            return false;
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getFirstName() == firstName) {
                return true;
            }

        }
        return false;
    }

    public void editName(int idx, String newName) {
        contactList.get(idx).setFirstName(newName);
        System.out.println("Edited contact: ");
        System.out.println(contactList.get(idx));
    }

    public void deleteContact(int idx, String name) {
        Iterator<Contacts> iterator = contactList.iterator();

        while (iterator.hasNext()) {
            Contacts contact = iterator.next();
            if (contact.toString().toLowerCase().contains(name)) {
                iterator.remove();
                // isDeleted = true;
                System.out.println("Contact deleted successfully!");
                break;
            }
        }

    }

}