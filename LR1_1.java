import java.util.Scanner;

public class LR1_1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Введiть дiйсне значення a: ");
        double a = scan.nextDouble();
        
        System.out.print("Введiть дiйсне значення b: ");
        double b = scan.nextDouble();
        
        scan.close();
        
        double result1 = (1.0 / (a * Math.pow(b, 2) - 2 * b)) + (1.0 / (3 * Math.pow(a, 2) + 2)) * b;
        System.out.println("Варiант 1 (дiйснi вхiднi, дiйсний результат): " + result1);

        int aInt = (int) a;
        int bInt = (int) b;
        double result2 = (1.0 / (aInt * Math.pow(bInt, 2) - 2 * bInt)) + (1.0 / (3 * Math.pow(aInt, 2) + 2)) * b;
        System.out.println("Варiант 2 (цiлi вхiднi, дiйсний результат): " + result2);
        
        int result3 = (int) ((1.0 / (a * Math.pow(b, 2) - 2 * b)) + (1.0 / (3 * Math.pow(a, 2) + 2)) * b);
        System.out.println("Варiант 3 (дiйснi вхiднi, цiлий результат): " + result3);
    }
}
