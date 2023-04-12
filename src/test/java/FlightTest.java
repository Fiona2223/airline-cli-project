import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FlightTest {
    Flight flight;
    Passenger passenger1;

    @BeforeEach
    public void setUp(){
        flight = new Flight("Thailand", "abc123");
        passenger1 = new Passenger("John", "Johnsmith@bnta.com", 1234);
    }

    @Test
    public void hasDestination(){
        assertThat(flight.getDestination()).isEqualTo("Thailand");
    }

    @Test
    public void hasID(){
        assertThat(flight.getID()).isEqualTo("abc123");
    }

    @Test
    public void passengerCountStartsEmpty(){
        assertThat(flight.getPassengerCount()).isEqualTo(0);
    }

    @Test
    public void canAddPassenger(){
        flight.addPassenger(passenger1);
        assertThat(flight.getPassengerCount()).isEqualTo(1);
    }

    @Test
    public void canGetListOfPassengers(){
        flight.addPassenger(passenger1);
        System.out.println(flight.getPassengerList());
//        assertThat(flight.getPassengerList()).isEqualTo(passenger1);
    }
}
