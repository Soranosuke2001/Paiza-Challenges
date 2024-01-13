// Link: https://paiza.jp/student/challenges/555/retry

import java.util.Scanner;

public class C114 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numWords = scanner.nextInt();
        scanner.nextLine();

        String[] words = new String[numWords];

        for (int i = 0; i < numWords; i++) {
            words[i] = scanner.nextLine();
        }

        char previousLetter = '\u0000';
        char currentLetter = '\u0000';
        boolean complete = true;

        for (int i = 0; i < words.length; i++) {
            if (i == 0) {
                previousLetter = words[i].charAt(words[i].length() - 1);
                continue;
            }

            currentLetter = words[i].charAt(0);

            if (currentLetter != previousLetter) {
                System.out.println(previousLetter + " " + currentLetter);
                complete = false;
                break;
            }

            previousLetter = words[i].charAt(words[i].length() - 1);
        }

        if (complete) {
            System.out.println("Yes");
        }

        scanner.close();
    }
}
