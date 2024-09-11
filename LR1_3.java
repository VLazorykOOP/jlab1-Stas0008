import java.util.Random;
import java.util.Scanner;

public class LR1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введiть розмiр матрицi n (n <= 15): ");
        int n = scanner.nextInt();

        if (n > 15) {
            System.out.println("Розмiр матрицi не повинен перевищувати 15.");
            scanner.close();
            return;
        }
        scanner.close();

        int[][] A = new int[n][n];
        System.out.println("Матриця A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = random.nextInt(10);
                System.out.print("[ " + A[i][j] + " ]");
            }
            System.out.println();
        }

        int maxProduct = Integer.MIN_VALUE;
        int maxProductRow = -1;

        for (int i = 0; i < n; i++) {
            int product = 1;
            for (int j = 0; j < n; j++) {
                product *= A[i][j];
            }
            if (product > maxProduct) {
                maxProduct = product;
                maxProductRow = i;
            }
        }

        int minElement = Integer.MAX_VALUE;
        for (int j = 0; j < n; j++) {
            if (A[maxProductRow][j] < minElement) {
                minElement = A[maxProductRow][j];
            }
        }

        System.out.println("Рядок з найбiльшим добутком:");
        for (int j = 0; j < n; j++) {
            System.out.print("[ " + A[maxProductRow][j] + " ]");
        }
        System.out.println();
        System.out.println("Найменший елемент у рядку з найбiльшим добутком: " + minElement);

        
    }
}
