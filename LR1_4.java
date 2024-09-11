import java.util.Scanner;

public class LR1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Введiть текст:");
        String text = scanner.nextLine();
        
        scanner.close();
        
        String[] words = text.split("\\s+|(?=\\p{Punct})|(?<=\\p{Punct})");

        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                // Перевірка довжини слова
                if (word.length() % 2 != 0) {
                    int midIndex = word.length() / 2;

                    word = word.substring(0, midIndex) + word.substring(midIndex + 1);
                }
            }
            result.append(word);
        }

        System.out.println("Результат:");
        System.out.println(result.toString());
    }
}

