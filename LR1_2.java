import java.util.Random;
import java.util.Scanner;

public class LR1_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введiть кiлькiсть елементiв масиву n (n <= 200): ");
        int n = scanner.nextInt();

        scanner.close();

        if (n > 200) {
            System.out.println("Кількiсть елементiв не повинна перевищувати 200.");
            return;
        }

        int[] A = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            A[i] = random.nextInt(100);
        }

        System.out.println("Масив A:");
        for (int i = 0; i < n; i++) {
            System.out.print("[" + A[i] + "]");
        }
        System.out.println();

        int[] B = new int[n];
        int bIndex = 0;

        for (int i = 0; i < n; i++) {

            boolean isDuplicate = false;
            boolean isAlreadyInB = false;

            for (int j = 0; j < n; j++) {
                if (A[i] == A[j] && i != j) {
                    isDuplicate = true;
                    break;
                }
            }

            if (isDuplicate) {
                for (int k = 0; k < bIndex; k++) {
                    if (B[k] == A[i]) {
                        isAlreadyInB = true;
                        break;
                    }
                }

                if (!isAlreadyInB) {
                    B[bIndex++] = A[i];
                }
            }
        }

        System.out.println("Масив B (унiкальнi повторюванi елементи):");
        for (int i = 0; i < bIndex; i++) {
            System.out.print("[" + B[i] + "]");
        }
        System.out.println();
    }
}
