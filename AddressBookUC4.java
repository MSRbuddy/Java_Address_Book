import java.util.*;

public class AddressBookUC4
{
    HashMap<String,AddressBook> addressBookHashMap = new HashMap<>();

    public static void main(String[] args)
    {
        AddressBook4 addressBook = new AddressBook4();
        int choice;
        System.out.println("\n**** ADDRESS-BOOK SIMULATION ****\n");

        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please Choose an Option");
            System.out.println("1. ADD CONTACT \n2. DISPLAY CONTACT \n3. EDIT CONTACT \n4. DELETE CONTACT \n5. EXIT");
            choice = sc.nextInt();
            // performing task according to the choices entered by the User
            switch (choice) {
                case 1:
                    addressBook.addContact();
                    break;
                case 2:
                    addressBook.displayContact();
                    break;
                case 3:
                    addressBook.editContact();
                    break;
                case 4:
                    addressBook.deleteContact();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice entered !!!!!!");
                    System.out.println("Kindly choose the correct Option");
                    break;
            }
        }
    }
}

class Contact4
{
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
    @Override
    public String toString()
    {
        return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", adddress=" + adddress + ", city="
                + city + ", state=" + state + ", zipCode=" + zipCode + ", mobileNumber=" + mobileNumber + ", email="
                + email + "]";
    }
}

class AddressBook4
{
    Scanner sc = new Scanner(System.in);
    ArrayList<Contact4> contactArrayList = new ArrayList<Contact4>();

    public void addContact()
    {
        // creating object of Contact class
        Contact4 contact = new Contact4();

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
        // adding contact to Array List
        contactArrayList.add(contact);
    }

    public void displayContact()
    {

        System.out.println("\n    Contact    ");
        System.out.println("----------------------");
        // displaying the data in the ArrayList through index value
        for(int i = 0; i < contactArrayList.size(); i++ ) {
            Contact4 contact = contactArrayList.get(i);
            // Printing the contact using toString method
            System.out.println(contact.toString());
        }
    }

    public void editContact()
    {
        // editing the existing contact using their First Name
        int choice;
        System.out.println("Enter the First Name of Contact to Edit");
        String firstName = sc.next();
        boolean isAvailable = false;
        for (Contact4 contact : contactArrayList) {
            if (contact.getFirstName().equals(firstName)) {
                isAvailable = true;

                do {
                    System.out.println("What you want to edit for the contact");
                    System.out.println(
                            "1.First Name\n2.Last Name\n3.Address\n4.City\n5.State\n6.Zip Code\n7.Mobile Number\n8.Email id\n9.Exit\n10.Main Menu");
                    choice = sc.nextInt();
                    // choose options what you want to edit
                    switch (choice) {
                        case 1:
                            System.out.println("Enter the First Name :");
                            contact.setFirstName(sc.next());
                            break;
                        case 2:
                            System.out.println("Enter the Last Name :");
                            contact.setLastName(sc.next());
                            break;
                        case 3:
                            System.out.println("Enter the Address :");
                            contact.setAdddress(sc.next());
                            break;
                        case 4:
                            System.out.println("Enter the City :");
                            contact.setCity(sc.next());
                            break;
                        case 5:
                            System.out.println("Enter the State :");
                            contact.setState(sc.next());
                            break;
                        case 6:
                            System.out.println("Enter the Zip code :");
                            contact.setZipCode(sc.next());
                            break;
                        case 7:
                            System.out.println("Enter the Mobile Number :");
                            contact.setMobileNumber(sc.next());
                            break;
                        case 8:
                            System.out.println("Enter the Email id :");
                            contact.setEmail(sc.next());
                            break;
                        case 9:
                            System.exit(0);
                            break;
                        default:
                            break;
                    }
                    System.out.println("Updated Sucessfully ...");
                }
                while (choice != 9);
            }
        }
        if (isAvailable == false) {
            System.out.println("Contact is not Available \nTry again");
        }
    }

    public void deleteContact()
    {
        // taking first name of contact to be deleted
        System.out.println("Enter the First Name of Contact to Delete");
        String firstName = sc.next();
        boolean isAvailable = false;
        for(Contact4 contact : contactArrayList)
        {
            if(contact.getFirstName().equalsIgnoreCase(firstName))
            {
                // removing the contact if first name matched
                isAvailable = true ;
                contactArrayList.remove(contact);
                System.out.println("Contact deleted sucessfully");
                break;
            }
        }
        if (isAvailable == false)
        {
            System.out.println("Sorry ! Data not found");
        }
    }
}



