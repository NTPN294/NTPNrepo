import java.util.*;

public class ContactList {

    private HashMap<String, Contact> contacts;

    public ContactList() {
        this.contacts = new HashMap<>();
    }

    public void addContact(Contact contact) {
        contacts.put(contact.getName().toLowerCase(), contact);
    }

    public Contact getContactByName(String name) {

        return contacts.get(name.toLowerCase());

    }

}
