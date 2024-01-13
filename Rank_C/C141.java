// Link: https://paiza.jp/student/challenges/698/retry

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class C141 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> votes = new HashMap<String, Integer>();

        int numStudents = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numStudents; i++) {
            String name = scanner.nextLine();

            if (votes.containsKey(name)) {
                int value = votes.get(name);

                value++;

                votes.put(name, value);
            } else {
                votes.put(name, 1);
            }
        }

        String winner = findMaxValue(votes);
        System.out.println(winner);

        scanner.close();
    }

    public static String findMaxValue(Map<String, Integer> votes) {
        String winner = null;
        int highestVotes = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : votes.entrySet()) {
            int currentVotes = entry.getValue();

            if (currentVotes > highestVotes) {
                highestVotes = currentVotes;
                winner = entry.getKey();
            }
        }

        return winner;
    }
}
