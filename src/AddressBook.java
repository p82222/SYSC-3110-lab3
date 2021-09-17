import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    private List<BuddyInfo> myList;

    public AddressBook() {
        myList = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo buddy){
        myList.add(buddy);

    }

    public void removeBuddy(BuddyInfo buddy){
        for (int counter = 0; counter < myList.size(); counter++) {
            if (myList.get(counter).equals(buddy)) {
                myList.remove(counter);
            }
        }
    }

    public static void main(String[] args) {
        BuddyInfo buddy= new BuddyInfo("Tom","Carleton", "613");
        AddressBook addresbook = new AddressBook();
        addresbook.addBuddy(buddy);
        addresbook.removeBuddy(buddy);

        System.out.println("Address Book");
    }
}
