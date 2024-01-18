import java.util.Scanner;

public class C049 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numFloors = scanner.nextInt();
        int totalFloors = 0;
        int nextFloor = 0;
        int previousFloor = 1;

        for (int i = 0; i < numFloors; i++) {
            nextFloor = scanner.nextInt();

            totalFloors = totalFloors + Math.abs(previousFloor - nextFloor);

            previousFloor = nextFloor;
        }

        System.out.println(totalFloors);

        scanner.close();
    }
}
