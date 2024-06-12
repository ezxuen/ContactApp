import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ContactManager implements Serializable {
    List<Contact> contacts;

    public ContactManager() {
        contacts = new ArrayList<>();
    }

    public ContactManager(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public Contact getContact(String name) {
        for (Contact contact : this.contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                return contact;
            }
        }
        return null;
    }

    public String toString() {
        return contacts.toString();
    }

    public void saveContactsToFile(String fileName) {
        try {
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(fileName));
            output.writeObject(this.contacts);
            System.out.println("Contacts Saved to " + fileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void loadContactsFromFile(String fileName){
        try {
            ObjectInputStream input = new ObjectInputStream(new FileInputStream(fileName));
            this.contacts = (List<Contact>) input.readObject();
        }catch(IOException | ClassNotFoundException e){
            throw new RuntimeException(e);
        }
    }
}
