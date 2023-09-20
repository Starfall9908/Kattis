import java.util.Scanner;

class Greetings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String sectionE = input.substring(1, input.length() - 1);

        String result = "";

        for (int i = 0; i < sectionE.length() * 2; i++) {
            result += "e";
        }

        System.out.println("h" + result + "y");
    }
}
