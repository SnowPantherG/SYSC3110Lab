import java.util.*;

public class AddressBook {
    private List<BuddyInfo> buddies;

    public AddressBook(){
        this.buddies=new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo buddy){
        if (buddy!=null){
            buddies.add(buddy);
        }
    }

    public void removeBuddy(BuddyInfo buddy){
        buddies.remove(buddy);
    }

    public static void main(String[] args) {
        BuddyInfo buddy=new BuddyInfo("Tom","Carleton","613");
        AddressBook addressBook=new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }


}

