import java.util.Scanner;

public class Runner {
    Flight flight1 = new Flight("Thailand", "T123");
    Flight flight2 = new Flight("Spain", "S257");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        while(true){
            //    ask user for name, contact details and ID
            System.out.println("Enter your name");
            String name = scanner.nextLine();
            System.out.println("Enter your contact details");
            String contactDetails = scanner.nextLine();
            System.out.println("Enter your ID");
            int iD = scanner.nextInt();
            Passenger passenger = new Passenger(name, contactDetails, iD);


//    ask user for destination
//    display available flights
//    ask for confirmation to book selected flight
//    display confirmation of booking
//    option to cancel flight
    }


}
