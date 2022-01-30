import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class AddMultipleContactPhoneDirectoryUC5 {

    // linked list created to add employee contact
    //private LinkedList<PersonDetails> contacts = new LinkedList<>();
    static Map<ContactDetails, PersonDetails> contacts = new HashMap<>();


    // method to add contact details in linked list
    public void addContactDetails(String firstName, String lastName, String address, String mobileNumber, String landlineNo, String email) {
        
        PersonDetails member = new PersonDetails(firstName,lastName,address,mobileNumber,landlineNo,email);
        ContactDetails contactDetails=new ContactDetails( mobileNumber, landlineNo);

        contacts.put(contactDetails,member);
        System.out.println(" contact added");
        display(member);

    }

    // method display details of contact book entries
    public void display(PersonDetails member) {

        System.out.println("first name is :" + member.firstName);

        System.out.println(" last name is :" + member.lastName);

        System.out.println(" address is :" + member.address);

        System.out.println(" address is :" +member.address);


        System.out.println(" phone number is :" + member.mobileNumber);
        System.out.println(" phone number is :" + member.landlineNo);

        System.out.println(" email address is :" + member.email);

        System.out.println(" email address is :" + member.email);

    }

    public static void main(String[] args) {
        // taking input from console
        Scanner scan = new Scanner(System.in);
        System.out.println("How many records u want to enter:  ");
        int totalRecords = scan.nextInt();

        for (int i = 0; i <= totalRecords; i++) {

            System.out.println("enter first name");
            String firstName = scan.nextLine();

            System.out.println("enter last name");
            String lastName = scan.nextLine();

            System.out.println("enter street address");
            String address = scan.nextLine();


            System.out.println("enter phone number");
            String phoneNumber = scan.nextLine();

            System.out.println("enter landline number");
            String landNumber = scan.nextLine();

            System.out.println("enter email Address");
            String emailAddress = scan.nextLine();


            // adding console input in Contact list
            AddMultipleContactPhoneDirectoryUC5 entry = new AddMultipleContactPhoneDirectoryUC5();
            entry.addContactDetails(firstName, lastName, address, phoneNumber, landNumber, emailAddress);

        }
    }
}