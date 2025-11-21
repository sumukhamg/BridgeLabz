package create_contact;

public class Contacts {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private long phoneNo;
    private String email;

    public Contacts(ContactBuilder contactBuilder) {
        this.firstName = contactBuilder.firstName;
        this.lastName = contactBuilder.lastName;
        this.address = contactBuilder.address;
        this.city = contactBuilder.city;
        this.state = contactBuilder.state;
        this.phoneNo = contactBuilder.phoneNo;
        this.email = contactBuilder.email;
    }

    public Contacts() {

    }

    static class ContactBuilder {
        private String firstName;
        private String lastName;
        private String address;
        private String city;
        private String state;
        private long phoneNo;
        private String email;

        public ContactBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public ContactBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public ContactBuilder address(String address) {
            this.address = address;
            return this;
        }

        public ContactBuilder city(String city) {
            this.city = city;
            return this;

        }

        public ContactBuilder state(String state) {
            this.state = state;
            return this;

        }

        public ContactBuilder phoneNo(long phoneNo) {
            this.phoneNo = phoneNo;
            return this;

        }

        public ContactBuilder email(String email) {
            this.email = email;
            return this;

        }

        public Contacts build() {
            return new Contacts(this);
        }

    }

    public String getFirstName() {
        return firstName;
    }

    // --------Setters-----------------

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // ------toString--------

    @Override
    public String toString() {
        StringBuilder contactDetails = new StringBuilder();
        System.out.println("-----Address Detail-----");

        if (firstName != null)
            contactDetails.append("First Name: " + firstName + " \n");
        // contactDetails.append("Last Name: " + lastName + " \n");
        if (lastName != null)
            // contactDetails.append("First Name: " + firstName + " \n");
            contactDetails.append("Last Name: " + lastName + " \n");
        if (address != null)
            contactDetails.append("Addrsss: " + address + " \n");
        if (city != null)
            contactDetails.append("City: " + city + " \n");
        if (state != null)
            contactDetails.append("State" + state + " \n");
        if (email != null)
            contactDetails.append("Email: " + email + " \n");
        if (phoneNo != 0)
            contactDetails.append("Phone Number: " + phoneNo + "");

        return new String(contactDetails);

    }

}
