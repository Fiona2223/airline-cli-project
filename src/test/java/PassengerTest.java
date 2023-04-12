import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PassengerTest {

    Passenger passenger;

    @BeforeEach
    public void setUp(){
        passenger = new Passenger("John", "Johnsmith@bnta.com", 123467);
    }

    @Test
    public void hasName(){
        assertThat(passenger.getName()).isEqualTo("John");
    }

    @Test
    public void canSetName(){
        passenger.setName("Geraldine");
        assertThat(passenger.getName()).isEqualTo("Geraldine");
    }

    @Test
    public  void canSetContactInfo(){
        passenger.setContactInformation("gke05@bnta.com");
        assertThat(passenger.getContactInformation()).isEqualTo("gke05@bnta.com");
    }

    @Test
    public  void hasContactInfo(){
        assertThat(passenger.getContactInformation()).isEqualTo("Johnsmith@bnta.com");
    }

    @Test
    public void hasUniqueID(){
        assertThat(passenger.getUniqueID()).isEqualTo(123467);
    }

}
