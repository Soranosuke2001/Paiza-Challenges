// Link: https://paiza.jp/student/challenges/639/retry

import java.util.ArrayList;
import java.util.Scanner;

public class C130 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numQuestions = scanner.nextInt();
        scanner.nextLine();

        ArrayList<Integer> wrongQuestions = new ArrayList<Integer>();

        for (int i = 0; i < numQuestions; i++) {
            String round1Result = scanner.next();
            String round2Result = scanner.next();

            if (round1Result.equals("n") || round2Result.equals("n")) {
                wrongQuestions.add(i + 1);
            }
        }

        System.out.println(wrongQuestions.size());

        for (Integer question : wrongQuestions) {
            System.out.println(question);
        }

        scanner.close();
    }    
}