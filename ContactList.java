import java.util.ArrayList;

public class ContactList {

    private ArrayList<Contact> contacts;

    public ContactList() {
        this.contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public Contact getContactByName(String name) {

        Contact contact = null;

        for (Contact c : contacts) {
            if (c.getName().equals(name)) {
                contact = c;
            }
        }

        return contact;

    }

}
