import java.util.ArrayList;

public class AirlineBooking {
    private ArrayList<Flight> flight;

    public AirlineBooking (){
        this.flight = new ArrayList<>();
    }

    public void addFlight(Flight flight){
        this.flight.add(flight);
    }

    public int getFlightCount(){
        return this.flight.size();
    }

    public void cancelFlight(Flight flight){
        this.flight.remove(flight);
    }

//    public void cancelFlightBooking(Flight flights){
//        this.flight.flights.removePassenger(Passenger passenger);
//    }

    public ArrayList<Flight> getFlightList() {
        return flight;
    }

    public void setFlightList(ArrayList<Flight> flight) {
        this.flight = flight;
    }
}
