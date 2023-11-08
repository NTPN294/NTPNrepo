
public class ContactApp {

    public static void main(String[] args) {

        Contact contact1 = new Contact("Nick");
        Contact contact2 = new Contact("Delano");
        Contact contact3 = new Contact("Siem");

        ContactList contactList = new ContactList();

        contactList.addContact(contact1);
        contactList.addContact(contact2);
        contactList.addContact(contact3);

        Contact x = contactList.getContactByName("Nick");
        System.out.println(x.getKanker());

    }

}
