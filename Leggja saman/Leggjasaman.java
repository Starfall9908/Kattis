import java.util.Scanner;

class Leggjasaman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringN = scanner.nextLine();
        int n = Integer.parseInt(stringN);

        String stringM = scanner.nextLine();
        int m = Integer.parseInt(stringM);

        System.out.println(n + m);

    }
}