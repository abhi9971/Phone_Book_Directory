public class PersonDetails {
    String firstName;
    String lastName;
    String address;
   String mobileNumber;
    String landlineNo;
    String email;

    public PersonDetails(String firstName, String lastName, String address, String mobileNumber, String landlineNo, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.mobileNumber = mobileNumber;
        this.landlineNo = landlineNo;
        this.email = email;
    }



    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    public void setAddress(String newAddress) {
        this.address = newAddress;
    }



    public void setPhoneNumber(String newPhoneNumber) {
        this.mobileNumber = newPhoneNumber;
    }
    public void setLandlineNo(String newLandLineNumber) {
        this.landlineNo = newLandLineNumber;
    }

    public void setEmail(String newEmailAddress) {
        this.email = newEmailAddress;
    }
}
