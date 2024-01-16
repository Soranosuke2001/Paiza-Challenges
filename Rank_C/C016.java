// Link: https://paiza.jp/challenges/54/show

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class C016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Character, Character> leetMap = new HashMap<Character, Character>();

        leetMap.put('A', '4');
        leetMap.put('E', '3');
        leetMap.put('G', '6');
        leetMap.put('I', '1');
        leetMap.put('O', '0');
        leetMap.put('S', '5');
        leetMap.put('Z', '2');

        String word = scanner.nextLine();
        String alteredWord = "";

        for (int i = 0; i < word.length(); i++) {
            if (leetMap.containsKey(word.charAt(i))) {
                char convertedChar = leetMap.get(word.charAt(i));

                alteredWord = alteredWord + convertedChar;
            } else {
                alteredWord = alteredWord + word.charAt(i);
            }
        }

        System.out.println(alteredWord);

        scanner.close();
    }
}
