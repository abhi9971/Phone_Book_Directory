import java.util.LinkedList;


public class CreateContact_PhoneBook_UC1 {

    // linked list created

    private LinkedList<PersonDetails> memberContacts = new LinkedList<>();

    // method to add member details in Linkedlist

    public void addMemberContactDetails(String firstName, String lastName, String address, String mobileNumber, String landlineNo, String email) {
        PersonDetails member = new PersonDetails(firstName,lastName,address,mobileNumber,landlineNo,email);
        memberContacts.add(member);
        System.out.println("Hurray ! member added");
        display(member);
    }
    // method  to display details of member book entries

    public void display(PersonDetails member) {
        System.out.println("first name is :" + member.firstName);
        System.out.println(" last name is :" + member.lastName);
        System.out.println(" address is :" + member.address);

        System.out.println(" phone number is :" + member.mobileNumber);
        System.out.println(" phone number is :" + member.landlineNo);

        System.out.println(" email address is :" + member.email);

    }

    // main function
    public static void main(String[] args) {

        CreateContact_PhoneBook_UC1 entry1 = new CreateContact_PhoneBook_UC1();
        // entries of new member
        entry1.addMemberContactDetails("abhishek","rajawat","Shov colony pinto park","99719944613","0751-2460548","abhishekrajawat101@gmail.com");
        // printing out details of member added


    }
}