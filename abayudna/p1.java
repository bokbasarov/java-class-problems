import java.util.Scanner;

public class bee1234 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            System.out.println(toDanceSentence(input));
        }

        scanner.close();
    }

    private static String toDanceSentence(String sentence) {
        StringBuilder result = new StringBuilder();
        boolean shouldBeUpperCase = true;

        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                if (shouldBeUpperCase) {
                    result.append(Character.toUpperCase(c));
                } else {
                    result.append(Character.toLowerCase(c));
                }
                shouldBeUpperCase = !shouldBeUpperCase;
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}
