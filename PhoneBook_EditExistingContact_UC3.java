import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class PhoneBook_EditExistingContact_UC3 {
    // arraylist created to store contact details
    //private ArrayList<PersonDetails> contactList = new ArrayList<>();
    static Map<ContactDetails, PersonDetails> contactList = new HashMap<>();

    // method to take input of contact details n
    private static PersonDetails getInitialContactDetails() {
        System.out.println("enter contact details ----");

        Scanner scan = new Scanner(System.in);

        System.out.println("enter first name");
        String firstName = scan.nextLine();

        System.out.println("enter last name");
        String lastName = scan.nextLine();


        System.out.println("enter street address");
        String address = scan.nextLine();

        System.out.println("enter phone number");
        String mobileNumber = scan.nextLine();

        System.out.println("enter phone number");
        String landlineNo = scan.nextLine();

        System.out.println("enter email Address");
        String email = scan.nextLine();


        PersonDetails entry = new PersonDetails(firstName, lastName, address, mobileNumber, landlineNo, email);

        return entry;


    }

    // method to add details of contact in arraylist
    private void addContact( PersonDetails contact ) {
        ContactDetails contactDetails=new ContactDetails( contact.mobileNumber, contact.landlineNo);

        contactList.put(contactDetails,contact);
        System.out.println("contact added whose name is :  " + contact.firstName + " " + contact.lastName);

    }

    // method to display all entries of arraylist
    private void displayContactDetails() {
        System.out.println("displaying contact details :");
        for (int i = 0; i < contactList.size(); i++) {
            System.out.println("contact no" + (i + 1));
            PersonDetails con = contactList.get(i);
            System.out.println("first name is :" + con.firstName);
            System.out.println(" last name is :" + con.lastName);
            System.out.println(" address is :" + con.address);





            System.out.println(" phone number is :" + con.mobileNumber);
            System.out.println(" phone number is :" + con.landlineNo);

            System.out.println(" email address is :" + con.email);
        }
    }

    // method to edit contact details
    private void editContact() {
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  first name of person whose contact details you wants to edit");
        String name = sc.nextLine();
        PersonDetails contactToBeEdited = contactList.get(0);
        System.out.println(contactList.get(0));

        for (int j = 0; j < contactList.size(); j++) {
            PersonDetails conMatch = contactList.get(j);
          //  System.out.println(conMatch.firstName);
            if (name.equals(conMatch.firstName)) {
                flag = true;
                contactToBeEdited = contactList.get(j);

            } else {
                System.out.println("no contact with this first name ");
            }

        }

        if (flag) {

            System.out.print(" what you want to edit : "
                    + "\n1. Zip Code" + "\n2. First Name" + "\n3  Last Name" + "\n4. Address"+ "\n5. City" + "\n6. State"

                    + "\n7. Phone Number" + "\n8. Email");

            int option = sc.nextInt();
            sc.nextLine(); // catches the new line character

            switch (option) {


                case 1:
                    System.out.println("enter  new first name");
                    String newFirstName = sc.nextLine();
                    contactToBeEdited.setFirstName(newFirstName);
                    break;

                case 2:
                    System.out.println("enter  new last name");
                    String newLastName = sc.nextLine();
                    contactToBeEdited.setFirstName(newLastName);
                    break;

                case 3:
                    System.out.println("enter  new street address");
                    String address = sc.nextLine();
                    contactToBeEdited.setAddress(address);
                    break;



                case 7:
                    System.out.println("enter  new phone number");
                    String newPhoneNumber = sc.nextLine();
                    contactToBeEdited.setPhoneNumber(newPhoneNumber);
                    break;

                case 8:
                    System.out.println("enter  new email address");
                    String newEmailAddress = sc.nextLine();
                    contactToBeEdited.setEmail(newEmailAddress);
                    break;

                default:
                    System.out.println("choice does not exist");

            }

        }

    }

    // main function
    public static void main(String[] args) {

        System.out.println("this is address book feature");

        PhoneBook_EditExistingContact_UC3 entry3 = new PhoneBook_EditExistingContact_UC3();

        entry3.addContact(entry3.getInitialContactDetails());
        entry3.displayContactDetails();
        entry3.editContact();
        System.out.println("Updated record details :");
        entry3.displayContactDetails();

    }
}