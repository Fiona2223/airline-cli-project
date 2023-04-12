public class Passenger {
    private String name;
    private String contactInformation;
    private int uniqueID;

    public Passenger(String name, String contactInformation, int uniqueID){
        this.name = name;
        this.contactInformation = contactInformation;
        this.uniqueID = uniqueID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    public int getUniqueID() {
        return uniqueID;
    }

}
