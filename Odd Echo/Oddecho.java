import java.util.Scanner;

class Oddecho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i <= n; i++) {
            String word = scanner.nextLine();
            if (i % 2 != 0) {
                System.out.println(word);
            } else {
            }
        }

    }
}
