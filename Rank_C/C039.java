import java.util.Scanner;

public class C039 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String equation = scanner.nextLine();

        int total = 0;

        for (int i = 0; i < equation.length(); i++) {
            if (equation.charAt(i) == '<') {
                total = total + 10;
            } else if (equation.charAt(i) == '/') {
                total++;
            } else {
                continue;
            }
        }
        
        System.out.println(total);

        scanner.close();
    }
}
