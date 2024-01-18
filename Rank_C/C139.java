import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C139 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numProducts = scanner.nextInt();
        List<Integer> orderedProducts = new ArrayList<>();

        for (int i = 0; i < numProducts; i++) {
            int productNum = scanner.nextInt();

            if (productNum > numProducts) {
                continue;
            }

            if (!checkProductNum(productNum, orderedProducts)) {
                orderedProducts.add(productNum);
            }
        }

        System.out.println(numProducts - orderedProducts.size());

        scanner.close();
    }

    public static boolean checkProductNum(int value, List<Integer> productList) {
        for (Integer productNum : productList) {
            if (productNum == value) {
                return true;
            }
        }

        return false;
    }
}
