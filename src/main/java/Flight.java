import java.lang.reflect.Array;
import java.util.ArrayList;

public class Flight {
    private String destination;
    private String iD;
    private ArrayList<Passenger> passengers;

    public Flight(String destination, String iD){
        this.destination = destination;
        this.iD = iD;
        this.passengers = new ArrayList<>();
    }

    public String getDestination() {
        return destination;
    }

    public String getID() {
        return iD;
    }

    public int getPassengerCount(){
        return this.passengers.size();
    }

    public void addPassenger(Passenger passenger){
        this.passengers.add(passenger);
    }

    public ArrayList<Passenger> getPassengerList(){
        return passengers;
    }

    public void setPassengerList(ArrayList<Passenger> passengers){
        this.passengers = passengers;
    }
}
