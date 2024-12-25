import java.util.Scanner;

public class bee1243 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            int totalLength = 0;
            int wordCount = 0;


            String[] symbols = line.split(" ");

            for (String symbol : symbols) {

                if (isValidWord(symbol)) {

                    totalLength += symbol.length() - (symbol.endsWith(".") ? 1 : 0);
                    wordCount++;
                }
            }


            int averageLength = (wordCount > 0) ? totalLength / wordCount : 0;
            int difficulty = classifyDifficulty(averageLength);
            System.out.println(difficulty);
        }

        scanner.close();
    }


    private static boolean isValidWord(String symbol) {
        if (symbol.isEmpty()) return false;


        if (symbol.charAt(symbol.length() - 1) == '.') {
            return symbol.substring(0, symbol.length() - 1).matches("[a-zA-Z]+");
        } else {
            return symbol.matches("[a-zA-Z]+");
        }
    }


    private static int classifyDifficulty(int averageLength) {
        if (averageLength <= 3) {
            return 250;
        } else if (averageLength >= 4 && averageLength <= 5) {
            return 500;
        } else {
            return 1000;
        }
    }
}
