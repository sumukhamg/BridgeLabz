package create_contact;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Contacts contactBook = new Contacts.ContactBuilder().build();
        AddressBookImpl addressBook = null;
        AddressBookImpl addressFamily = new AddressBookImpl();
        AddressBookImpl addressFriends = new AddressBookImpl();
        AddressBookImpl addressWork = new AddressBookImpl();

        while (true) {
            System.out.println("Which Address Book you want to update?");
            System.out.println("1. Family");
            System.out.println("2. Friends");
            System.out.println("3. Work");

            int addressBookChoice = sc.nextInt();
            if (addressBookChoice == 1)
                addressBook = addressFamily;
            else if (addressBookChoice == 2)
                addressBook = addressFriends;
            else if (addressBookChoice == 3)
                addressBook = addressWork;
            else {
                System.out.println("Invalid choice");
                return;
            }

            System.out.println("Please Enter a choice: ");
            System.out.println("1. Add new Contact");
            System.out.println("2. Edit existing contact");
            System.out.println("3. To delete a person");
            System.out.println("4. To display a person contact details");
            System.out.println("any other key to exit switch");
            int choice = sc.nextInt();

            switch (choice) {
                //Case1: To add a new COntact
                case 1:
                    add();
                    break;
                //Case2: Edit the details of the person. (As of now we can only edit name)
                case 2:
                    System.out.println("Please enter the first name of the person");
                    String name = sc.nextLine();
                    sc.nextLine();

                    for (int i = 0; i < addressBook.contactList.size(); i++) {
                        if (addressBook.isPresent(name)) {
                            System.out.println("Enter new name:");
                            String newName = sc.nextLine();
                            addressBook.editName(i, newName);
                        } else {
                            System.out.println("Invalid name");
                        }
                    }
                    break;
                //Case3: Delete the person details
                case 3:
                    System.out.println("Please enter the first name of the person");
                    String deleteName = sc.nextLine();
                    sc.nextLine();
                    if (!addressBook.contactList.isEmpty()) {
                        for (int i = 0; i < addressBook.contactList.size(); i++) {
                            if (addressBook.isPresent(deleteName)) {
                                addressBook.deleteContact(i, deleteName);
                            } else {
                                System.out.println("Invalid name");
                            }
                        }
                    } else {
                        System.out.println("Contact list is empty");
                    }
                    break;

                //Add multiple contacts
                case 4:
                    List<Contact> contacts = new ArrayList();
                    while(true){
                        System.out.println("Do you want to add new contact\nType yes if you want to add and no if you don't");
                        String s = sc.nextLine();
                        if(s.equalsIgnoreCase("no"))
                            break;
                        add();
                    }



                case 5:
                    addressBook.display();
                    // System.out.println(contactBook);
                    break;
                default:
                    System.out.println("Exiting switch");
                    return;
            }
        }



        static void addPerson(){
            System.out.println("Enter firstName: ");
            String firstName = sc.next();
            sc.nextLine();

            System.out.println("Enter lastName: ");
            String lastNAme = sc.nextLine();

            System.out.println("Enter Phone Number: ");
            long phone = sc.nextLong();

            System.out.println("Enter Address: ");
            String address = sc.next();
            sc.nextLine();

            System.out.println("Enter City: ");
            String city = sc.nextLine();
            // sc.nextLine();

            System.out.println("Enter State: ");
            String state = sc.nextLine();
            // sc.nextLine();

            System.out.println("Enter email: ");
            String email = sc.nextLine();

            contactBook = new Contacts.ContactBuilder()
                    .firstName(firstName)
                    .lastName(lastNAme)
                    .phoneNo(phone)
                    .address(address)
                    .city(city)
                    .state(state)
                    .email(email)
                    .build();
            addressBook.addContact(contactBook);
        }
    }

}
