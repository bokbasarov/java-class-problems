import java.util.Scanner;

public class bee1253 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < testCases; i++) {
            String encodedText = scanner.nextLine();
            int shift = scanner.nextInt();
            scanner.nextLine();

            System.out.println(decodeCaesarCipher(encodedText, shift));
        }

        scanner.close();
    }

    private static String decodeCaesarCipher(String encodedText, int shift) {
        StringBuilder decodedText = new StringBuilder();

        for (char c : encodedText.toCharArray()) {
            char decodedChar = (char) ((c - 'A' - shift + 26) % 26 + 'A');
            decodedText.append(decodedChar);
        }

        return decodedText.toString();
    }
}
