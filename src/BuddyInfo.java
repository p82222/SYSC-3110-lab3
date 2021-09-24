public class BuddyInfo {

    private String name;
    private String address;
    private String phone;


    public BuddyInfo() {
        this.name = "";
        this.address = "";
        this.phone = "";


    }

    public String getName() {
        return name;
    }
    public String getAddress() {  return address;  }
    public String getPhone() { return phone; }


    public BuddyInfo(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;

    }



    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Chris","123 Carleton St", "513-123-5678");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        System.out.println("Hello " + buddy.getName());
    }
}
