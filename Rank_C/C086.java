import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class C086 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Character, Boolean> vowels = new HashMap<Character, Boolean>();

        vowels.put('a', true);
        vowels.put('e', true);
        vowels.put('i', true);
        vowels.put('o', true);
        vowels.put('u', true);
        vowels.put('A', true);
        vowels.put('E', true);
        vowels.put('I', true);
        vowels.put('O', true);
        vowels.put('U', true);

        String inputString = scanner.nextLine();
        String alteredString = "";

        for (int i = 0; i < inputString.length(); i++) {
            if (!vowels.containsKey(inputString.charAt(i))) {
                alteredString = alteredString + inputString.charAt(i);
            }
        }

        System.out.println(alteredString);

        scanner.close();
    }
}
