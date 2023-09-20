import java.util.Scanner;

class Ovissa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        char search = 'u';
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == search)
                count++;
        }

        System.out.println(count);

    }
}