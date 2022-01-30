public class ContactDetails {
    String landlineno;
    String phoneNumber;

    public String getLandlineno() {
        return landlineno;
    }

    public void setLandlineno(String landlineno) {
        this.landlineno = landlineno;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ContactDetails() {
    }

    public ContactDetails(String landlineNo, String phoneNumber) {
        this.landlineno = landlineno;
        this.phoneNumber = phoneNumber;
    }

}
