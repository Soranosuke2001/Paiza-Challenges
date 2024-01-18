import java.util.Arrays;
import java.util.Scanner;

public class C102 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] eventSchedule = new char[31];
        Arrays.fill(eventSchedule, 'x');

        char current = 'A';
        
        int numAEvents = scanner.nextInt();
        int[] eventASchedule = new int[numAEvents];

        for (int i = 0; i < numAEvents; i++) {
            eventASchedule[i] = scanner.nextInt();
        }

        int numBEvents = scanner.nextInt();
        int[] eventBSchedule = new int[numBEvents];

        for (int i = 0; i < numBEvents; i++) {
            eventBSchedule[i] = scanner.nextInt();
        }

        for (int eventDate : eventASchedule) {
            eventSchedule[eventDate - 1] = 'A';
        }

        for (int eventDate : eventBSchedule) {
            if (eventSchedule[eventDate - 1] == 'A') {
                if (current == 'A') {
                    current = 'B';
                } else {
                    eventSchedule[eventDate - 1] = 'B';
                    current = 'A';
                }
            }

            if (eventSchedule[eventDate - 1] == 'x') {
                eventSchedule[eventDate - 1] = 'B';
            }
        }

        for (char date : eventSchedule) {
            System.out.println(date);
        }

        scanner.close();
    }    
}