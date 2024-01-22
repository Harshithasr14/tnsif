package Airlines;

import java.util.Scanner;
class SkyAirlines{
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter name");
    String name = scanner.nextLine();

    System.out.println("Enter source");
    String source = scanner.nextLine();

    System.out.println("Enter destination");
    String destination = scanner.nextLine();

    AirlineMessageGenerator generator = new AirlineMessageGenerator();
    String message = generator.generateMessage(name, source, destination);

    System.out.println(message);

    scanner.close();
}
}

class AirlineMessageGenerator {
public String generateMessage(String name, String source, String destination) {
    return "Dear " + name + ", welcome onboard with service from " + source +
            " to " + destination + ". Thank you for choosing Sky Airlines. Enjoy your flight.";
}
}

