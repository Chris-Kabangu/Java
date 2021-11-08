import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int FOUR = 4;
        int num = scanner.nextInt();

        while (scanner.hasNextInt()) {
            int element = scanner.nextInt();
            if (element > num && element % FOUR == 0) {
                num = element;
            }
        }

        System.out.println(num);
