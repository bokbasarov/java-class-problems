import java.util.Scanner;

public class bee1287 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String input = scanner.nextLine().trim();
            String sanitizedInput = sanitizeInput(input);
            String numberString = interpretInput(sanitizedInput);

            if (isValidNumberString(numberString)) {
                try {
                    int number = Integer.parseInt(numberString);
                    System.out.println(number);
                } catch (NumberFormatException e) {
                    System.out.println("error");
                }
            } else {
                System.out.println("error");
            }
        }

        scanner.close();
    }

    private static String sanitizeInput(String input) {
        return input.replaceAll("[,\\s]", "");
    }

    private static String interpretInput(String input) {
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (c == 'O' || c == 'o') {
                result.append('0');
            } else if (c == 'l') {
                result.append('1');
            } else if (Character.isDigit(c)) {
                result.append(c);
            } else {
                return "";
            }
        }

        return result.toString();
    }

    private static boolean isValidNumberString(String str) {
        if (str.isEmpty()) {
            return false;
        }

        try {
            int number = Integer.parseInt(str);
            return number >= 0 && Long.parseLong(str) <= Integer.MAX_VALUE;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
