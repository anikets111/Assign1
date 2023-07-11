import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter five integers:");

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt();
            sum += num;
        }

        System.out.println("The sum of the five integers is: " + sum);
    }
}
