
public class ContactApp {

    public static void main(String[] args) {

        Contact contact1 = new Contact("Nick", "+31 0612345678");
        Contact contact2 = new Contact("Delano", "+31 0612345678");
        Contact contact3 = new Contact("Siem", "+31 0612345678");

        ContactList contactList = new ContactList();

        contactList.addContact(contact1);
        contactList.addContact(contact2);
        contactList.addContact(contact3);

        Contact x = contactList.getContactByName("Nick");
        System.out.println(x.getPhone() + " " + x.getName());

        // testaaaaaa

    }

}
