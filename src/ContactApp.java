import java.util.Scanner;
public class ContactApp {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        ContactManager contactManager = new ContactManager();
        int choice;
        do {
            System.out.println("1- Add contact");
            System.out.println("2- Retrieve contact by name");
            System.out.println("3- List all contacts");
            System.out.println("4- save Contact list to file");
            System.out.println("5- Load Contact list from file");
            System.out.println("0- Exiting program");
            choice = read.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enter name , email , phoneNumber");
                    contactManager.addContact(new Contact(read.next(), read.next(), read.next()));
                    break;
                case 2:
                    System.out.println("enter name of contact");
                    System.out.println(contactManager.getContact(read.next()).toString());
                    break;
                case 3:
                    System.out.println("Contact List");
                    System.out.println(contactManager);
                    break;
                case 4:
                    System.out.println("Enter filename");
                    contactManager.saveContactsToFile(read.next());
                    break;
                case 5:
                    System.out.println("Enter filename");
                    contactManager.loadContactsFromFile(read.next());
                    break;
                case 0:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("invalid input");
                    break;
            }
        } while (choice != 0);
        read.close();
    }
}
