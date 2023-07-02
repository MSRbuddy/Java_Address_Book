import java.util.Scanner;

public class AddressBookUC2
{
    public static void main(String[] args)
    {
        AddressBook addressBook = new AddressBook();
        addressBook.addContact();
        addressBook.displayContact();
    }
}
class Contact2 {
    private String firstName;
    private String lastName;
    private String adddress;
    private String city;
    private String state;
    private String zipCode;
    private String mobileNumber;
    private String email;
    // creating getter and setter methods
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getAdddress() {
        return adddress;
    }
    public void setAdddress(String adddress) {
        this.adddress = adddress;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getZipCode() {
        return zipCode;
    }
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    public String getMobileNumber() {
        return mobileNumber;
    }
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

}
class AddressBook
{
    Scanner sc = new Scanner(System.in);
    // creating object of Contact class
    Contact2 contact = new Contact2();

    public void addContact()
    {

        System.out.println("Enter the First Name :");
        contact.setFirstName(sc.next());
        System.out.println("Enter the Last Name :");
        contact.setLastName(sc.next());
        System.out.println("Enter the Address :");
        contact.setAdddress(sc.next());
        System.out.println("Enter the City :");
        contact.setCity(sc.next());
        System.out.println("Enter the State :");
        contact.setState(sc.next());
        System.out.println("Enter the Zip code :");
        contact.setZipCode(sc.next());
        System.out.println("Enter the Mobile Number :");
        contact.setMobileNumber(sc.next());
        System.out.println("Enter the Email id :");
        contact.setEmail(sc.next());
    }

    public void displayContact() {

        System.out.println("\n     New Contact    ");
        System.out.println("----------------------");
        System.out.println("First Name    : " + contact.getFirstName());
        System.out.println("Last Name     : " + contact.getLastName());
        System.out.println("Address       : " + contact.getAdddress());
        System.out.println("City          : " + contact.getCity());
        System.out.println("State         : " + contact.getState());
        System.out.println("Zip code      : " + contact.getZipCode());
        System.out.println("Mobile Number : " + contact.getMobileNumber());
        System.out.println("Email id      : " + contact.getEmail());

    }
}