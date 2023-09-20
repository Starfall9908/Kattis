import java.util.Scanner;

public class Taketwostones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int n = Integer.parseInt(input);

        if (n % 2 == 0)
            System.out.println("Bob");
        else
            System.out.println("Alice");
    }
}
