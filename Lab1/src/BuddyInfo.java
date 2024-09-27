public class BuddyInfo {
    private String name;
    private String address;
    private String phoneNumber;

    public String getName() {
        return name;
    }

    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address=address;
        this.phoneNumber=phoneNumber;
    }

    public static void main(String[] args) {
        //BuddyInfo Buddy=new BuddyInfo("Rach");
        //System.out.println("Hello, "+Buddy.getName());
        System.out.println("Hello World!");
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
