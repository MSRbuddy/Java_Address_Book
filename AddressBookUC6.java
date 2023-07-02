import java.util.*;

public class AddressBookUC6
{
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Contact6> adressBook = new ArrayList<Contact6>();
    static Contact addressBoook = new Contact();

    public static void main(String[] args) {
        System.out.println("Welcome to the Address Book Problem");
        AddressBookUC6 addressBookList = new AddressBookUC6();
        boolean condition = true;

        while (condition == true)
        {
            System.out.println("Enter a options" + "\n" + "1.Do you want to continue in existing addressbook" + "\n"
                    + "2.Create a new address book");
            int options = sc.nextInt();
            switch (options)
            {
                case 1:
                    boolean condition1 = true;
                    while ((condition1) == true)
                    {
                        System.out.println(
                                "1.add" + "\n" + "2.display" + "\n" + "3.edit" + "\n" + "4.delete" + "\n" + "5.exit");
                        int option = sc.nextInt();
                        switch (option)
                        {
                            case 1:
                                addressBookList.addContactDetails();
                                break;
                            case 2:
                                addressBookList.display();
                                break;
                            case 3:
                                addressBookList.editContactDetails();
                                break;
                            case 4:
                                addressBookList.deleteContact();
                                break;
                            case 5:
                                condition1 = false;
                                break;
                            default:
                                System.out.println("Invalid Input");
                        }
                    }
                    break;
                case 2:
                    HashMap<String, ArrayList<Contact>> map = new HashMap<>();
                    ArrayList<Contact> arrayList = new ArrayList<>();
                    Contact addessBook1 = addressBoook;
                    arrayList.add(addessBook1);
                    map.put("Ram", arrayList);
                    System.out.println(map);
                    if (map.containsKey("Ram")) {
                        ArrayList<Contact> ram = map.get("Ram");
                        Contact addessBook2 = addressBoook;
                        ram.add(addessBook2);
                        map.put("Ram", ram);
                    }
                    System.out.println(map);
                    Contact addessBook3 = addressBoook;
                    arrayList.add(addessBook3);
                    map.put("Abhi", arrayList);
                    System.out.println(map);
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }
    }

    public void addContactDetails()
    {
        Contact6 details = new Contact6();
        System.out.println("Enter a first name:");
        String firstName = sc.next();
        details.setFirstName(sc.next());
        System.out.println("Enter a last name:");
        String lastName = sc.next();
        details.setLastName(sc.next());
        System.out.println("Enter a Address:");
        String address = sc.next();
        details.setAddress(sc.next());
        System.out.println("Enter a City name:");
        String city = sc.next();
        details.setCity(sc.next());
        System.out.println("Enter a state:");
        String state = sc.next();
        details.setState(sc.next());
        System.out.println("Enter a email:");
        String email = sc.next();
        details.setEmail(sc.next());
        System.out.println("Enter a zip code:");
        String zip = sc.next();
        details.setZipCode(sc.next());
        System.out.println("Enter a phone number:");
        String phoneNumber = sc.next();
        details.setMobileNumber(sc.next());

        adressBook.add(details);
        Contact6 details1 = new Contact6(firstName, lastName, address, city, state, email, zip, phoneNumber);
        adressBook.add(details1);
        System.out.print(adressBook);
        System.out.println("succesfully added person new contacts");
    }


    public void editContactDetails() {
        System.out.println("enter a name for edit:");
        String editName = sc.next();
        for (int i = 0; i < adressBook.size(); i++) {
            if (adressBook.get(i).getFirstName().equals(editName)) {
                System.out.println("select options");
                System.out.println(
                        "\n1.First Name\n2.Last Name\n3.Address\n4.City\n5.State\n6.Zip\n7.Phone Number\n8.Email");
                int editOption = sc.nextInt();

                switch (editOption) {
                    case 1:
                        System.out.println("Enter a First name:");
                        String editFirstName = sc.next();
                        adressBook.get(i).setFirstName(editFirstName);
                        System.out.println(editFirstName);
                        break;
                    case 2:
                        System.out.print("Enter a Last name:");
                        adressBook.get(i).setLastName(sc.next());
                        break;
                    case 3:
                        System.out.print("Enter a Address:");
                        adressBook.get(i).setAddress(sc.next());
                        break;
                    case 4:
                        System.out.print("Enter a city:");
                        adressBook.get(i).setCity(sc.next());
                        break;
                    case 5:
                        System.out.print("Enter a state:");
                        adressBook.get(i).setState(sc.next());
                        break;
                    case 6:
                        System.out.print("Enter a zip code:");
                        adressBook.get(i).setZipCode(sc.next());
                        break;
                    case 7:
                        System.out.print("Enter a phone number:");
                        adressBook.get(i).setMobileNumber(sc.next());
                        break;
                    case 8:
                        System.out.print("Enter a email:");
                        adressBook.get(i).setEmail(sc.next());
                        break;
                    default:
                        System.out.println("enter valid contact");
                }
            }
            System.out.println("Edited list is:");
            System.out.println(adressBook);
        }
    }

    public void deleteContact()
    {
        System.out.println("confirm the name to delete contact");
        String confirmName = sc.next();
        for (int i = 0; i < adressBook.size(); i++) {
            if (adressBook.get(i).getFirstName().equalsIgnoreCase(confirmName))
                ;
            Contact6 person = adressBook.get(i);
            adressBook.remove(person);
        }
        System.out.println(adressBook);
    }

    public void display() {
        for (int i = 0; i < adressBook.size(); i++) {
            Contact6 person = adressBook.get(i);
            System.out.println("FirstName" + ":=" + person.getFirstName() + "\n" + "lastname" + ":= "
                    + person.getLastName() + "\n" + "Address" + ":= " + person.getAddress() + "\n" + "City" + ":= "
                    + person.getCity() + "\n" + "State" + ":=" + person.getState() + "\n" + "Zip" + ":= "
                    + person.getZipCode() + "\n" + "PhoneNumber" + ":= " + person.getMobileNumber() + "\n" + "Email" + ":= "
                    + person.getEmail());
        }
    }
}


class Contact6
{
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String mobileNumber;
    private String email;

    public Contact6(String firstName, String lastName, String address, String city, String state, String zip, String phoneNumber,
                   String email)
    {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAddress(address);
        this.setCity(city);
        this.setState(state);
        this.setZipCode(zip);
        this.setMobileNumber(phoneNumber);
        this.setEmail(email);
    }

    public Contact6() {
        // TODO Auto-generated constructor stub
    }
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
        return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", adddress=" + address + ", city=" + city
                + ", state=" + state + ", zipCode=" + zipCode + ", mobileNumber=" + mobileNumber + ", email=" + email
                + "]";
    }
}