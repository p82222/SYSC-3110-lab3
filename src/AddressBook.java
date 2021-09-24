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

        System.out.println("Address Book");
        
        System.out.println("This is to test lab3 edit online");

        System.out.println("This is to test lab3 new branch");
    }
}
