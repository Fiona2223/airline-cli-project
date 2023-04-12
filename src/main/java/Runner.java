import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Flight flight1 = new Flight("Thailand", "T123");
        Flight flight2 = new Flight("Spain", "S257");

//        while(true){
            //    ask user for name, contact details and ID
            System.out.println("Enter your name");
            String name = scanner.nextLine();
            System.out.println("Enter your contact details");
            String contactDetails = scanner.nextLine();
            System.out.println("Enter your ID");
            int iD = scanner.nextInt();
            Passenger passenger = new Passenger(name, contactDetails, iD);

           AirlineBooking airlineBooking = new AirlineBooking();
           airlineBooking.addFlight(flight1);
           airlineBooking.addFlight(flight2);

//    display available flights

           System.out.println("List of flights " + flight1 + flight2);




//    ask user for destination
//    ask for confirmation to book selected flight
//    display confirmation of booking
//    option to cancel flight
    }


}
