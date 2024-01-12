import java.util.Scanner;

public class C112 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numFlights = scanner.nextInt();
        
        int[][] flightDates = new int[numFlights][];
        int max = 0;
        int min = 100000;

        // Getting input
        for (int i = 0; i < numFlights; i++) {
            int[] flightInfo = new int[3];

            for (int j = 0; j < 3; j++) {
                flightInfo[j] = scanner.nextInt();
            }

            flightDates[i] = flightInfo;
        }

        // Calculate if there is a time zone diff
        for (int i = 0; i < numFlights; i++) {
            int country1Hrs = flightDates[i][0];
            int flightTime = flightDates[i][1];
            int country2ArrivalTime = flightDates[i][2];

            int estCountry2Arrival = country1Hrs + flightTime;
            
            int timeZoneDiff = country2ArrivalTime - estCountry2Arrival;
            
            int totalHours = 24 - timeZoneDiff;

            if (totalHours > max) {
                max = totalHours;
            }

            if (totalHours < min) {
                min = totalHours;
            }
        }

        System.out.println(min);
        System.out.println(max);

        scanner.close();
    }
}