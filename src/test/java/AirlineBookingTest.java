import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AirlineBookingTest {
    AirlineBooking airlineBooking;
    Flight flight;
    Passenger passenger1;

    @BeforeEach
    public void setUp(){
        airlineBooking = new AirlineBooking();
        flight = new Flight("Thailand", "abc123");
        passenger1 = new Passenger("John", "Johnsmith@bnta.com", 1234);

    }

    @Test
    public void canAddFlight(){
        airlineBooking.addFlight(flight);
        assertThat(airlineBooking.getFlightCount()).isEqualTo(1);
    }

    @Test
    public void canCancelFlight(){
        airlineBooking.addFlight(flight);
        assertThat(airlineBooking.getFlightCount()).isEqualTo(1);
        airlineBooking.cancelFlight(flight);
        assertThat(airlineBooking.getFlightCount()).isEqualTo(0);
    }

}
