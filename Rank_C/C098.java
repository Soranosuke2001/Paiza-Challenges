import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class C098 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numPlayers = scanner.nextInt();

        Map<Integer, Integer> ballCount = new HashMap<>();

        for (int i = 0; i < numPlayers; i++) {
            ballCount.put(i + 1, scanner.nextInt());
        }

        int numPasses = scanner.nextInt();

        for (int i = 0; i < numPasses; i++) {
            int playerPassing = scanner.nextInt();
            int playerReceiving = scanner.nextInt();
            int numBallsPassed = scanner.nextInt();

            int currentHeldBalls = ballCount.get(playerPassing);

            if (currentHeldBalls == 0) {
                continue;
            }

            if (currentHeldBalls < numBallsPassed) {
                numBallsPassed = currentHeldBalls;
            }

            // updating the first player ball count
            ballCount.put(playerPassing, ballCount.get(playerPassing) - numBallsPassed);

            // updating the second player ball count
            ballCount.put(playerReceiving, ballCount.get(playerReceiving) + numBallsPassed);
        }

        for (Integer count : ballCount.values()) {
            System.out.println(count);
        }
        
        scanner.close();
    }
}
